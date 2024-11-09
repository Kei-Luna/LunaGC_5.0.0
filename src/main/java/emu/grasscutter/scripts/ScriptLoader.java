package emu.grasscutter.scripts;

import emu.grasscutter.*;
import emu.grasscutter.config.Configuration;
import emu.grasscutter.game.dungeons.challenge.enums.*;
import emu.grasscutter.game.props.*;
import emu.grasscutter.game.quest.enums.QuestState;
import emu.grasscutter.scripts.constants.*;
import emu.grasscutter.scripts.data.SceneMeta;
import emu.grasscutter.scripts.serializer.*;
import emu.grasscutter.utils.FileUtils;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.script.*;
import lombok.Getter;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.OneArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.script.*;

public class ScriptLoader {
    private static ScriptEngineManager sm;
    private static Bindings globalBindings;
    private static final int SCOPE = ScriptContext.ENGINE_SCOPE;
    @Getter private static Serializer serializer;
    @Getter private static ScriptLib scriptLib;
    @Getter private static LuaValue scriptLibLua;
    /** suggest GC to remove it if the memory is less */
    private static Map<String, SoftReference<String>> scriptSources = new ConcurrentHashMap<>();

    private static Map<String, SoftReference<CompiledScript>> scriptsCache =
            new ConcurrentHashMap<>();
    /** sceneId - SceneMeta */
    private static Map<Integer, SoftReference<SceneMeta>> sceneMetaCache = new ConcurrentHashMap<>();
    private static Pattern regexLocal = Pattern.compile("^local\\s+", Pattern.MULTILINE);
    private static Pattern regexRequire = Pattern.compile("^require(\s*[^'\"]*('|\"))([^'\"]+)(.*)$", Pattern.MULTILINE);
    private static Set<String> slowRequire = Set.of();
    private static CompiledScript NullScript;

    /** Initializes the script engine. */
    public static synchronized void init() throws Exception {
        if (sm != null) {
            throw new Exception("Script loader already initialized");
        }

        ScriptLoader.sm = new ScriptEngineManager();
        ScriptLoader.serializer = new LuaSerializer();
        ScriptLoader.globalBindings = sm.getBindings();

        addEnumByIntValue(EntityType.values(), "EntityType");
        addEnumByIntValue(QuestState.values(), "QuestState");
        addEnumByIntValue(ElementType.values(), "ElementType");

        addEnumByOrdinal(GroupKillPolicy.values(), "GroupKillPolicy");
        addEnumByOrdinal(SealBattleType.values(), "SealBattleType");
        addEnumByOrdinal(FatherChallengeProperty.values(), "FatherChallengeProperty");
        addEnumByOrdinal(ChallengeEventMarkType.values(), "ChallengeEventMarkType");
        addEnumByOrdinal(VisionLevelType.values(), "VisionLevelType");

        globalBindings.put("EventType", CoerceJavaToLua.coerce(new EventType()));
        globalBindings.put("GadgetState", CoerceJavaToLua.coerce(new ScriptGadgetState()));
        globalBindings.put("RegionShape", CoerceJavaToLua.coerce(new ScriptRegionShape()));

        scriptLib = new ScriptLib();
        scriptLibLua = CoerceJavaToLua.coerce(scriptLib);
        globalBindings.put("ScriptLib", scriptLibLua);
        ScriptLoader.NullScript = newScript("groups = {}", false);
    }

    private static <T extends Enum<T>> void addEnumByOrdinal(T[] enumArray, String name) {
        LuaTable table = new LuaTable();
        Arrays.stream(enumArray)
                .forEach(
                        e -> {
                            table.set(e.name(), e.ordinal());
                            table.set(e.name().toUpperCase(), e.ordinal());
                        });
        globalBindings.put(name, table);
    }

    private static <T extends Enum<T> & IntValueEnum> void addEnumByIntValue(T[] enumArray, String name) {
        LuaTable table = new LuaTable();
        Arrays.stream(enumArray)
                .forEach(
                        e -> {
                            table.set(e.name(), e.getValue());
                            table.set(e.name().toUpperCase(), e.getValue());
                        });
        globalBindings.put(name, table);
    }

    public static <T> Optional<T> tryGet(SoftReference<T> softReference) {
        try {
            return Optional.ofNullable(softReference.get());
        } catch (NullPointerException npe) {
            return Optional.empty();
        }
    }

    /**
     * Performs a smart evaluation. This allows for 'require' to work.
     *
     * @param script The script to evaluate.
     * @param bindings The bindings to use.
     * @return The result of the evaluation.
     */
    public static Object eval(CompiledScript script, Bindings bindings) throws ScriptException {
        bindings.putAll(globalBindings);
        script.getEngine().setBindings(bindings, SCOPE);
        // Evaluate the script.
        return script.eval();
    }

    static final class RequireFunction extends OneArgFunction {
        private ScriptContext ctx;
        public RequireFunction(ScriptContext ctx) {
            super();
            this.ctx = ctx;
        }
        @Override
        public LuaValue call(LuaValue arg) {
            // Resolve the script path.
            var scriptName = arg.checkjstring();
            var scriptPath = "Common/" + scriptName + ".lua";

            // Load & compile the script.
            var script = ScriptLoader.getScript(scriptPath);
            if (script == null) {
                return LuaValue.NONE;
            }

            // Append the script to the context.
            try {
                script.eval(ctx.getBindings(SCOPE));
            } catch (Exception exception) {
                if (DebugConstants.LOG_MISSING_LUA_SCRIPTS) {
                    Grasscutter.getLogger()
                            .error("Loading script {} failed! - {}", scriptPath, exception.getLocalizedMessage());
                }
            }

            // TODO: What is the proper return value?
            return LuaValue.NONE;
        }
    }

    /**
     * Loads the sources of a script.
     *
     * @param path The path of the script.
     * @return The sources of the script.
     */
    public static String readScript(String path) {
        return readScript(path, false);
    }

    /**
     * Loads the sources of a script.
     *
     * @param path The path of the script.
     * @param useAbsPath Use path as-is; don't look under Scripts resources.
     * @return The sources of the script.
     */
    public static String readScript(String path, boolean useAbsPath) {
        // Check if the path is cached.
        var cached = ScriptLoader.tryGet(ScriptLoader.scriptSources.get(path));
        if (cached.isPresent()) {
            return cached.get();
        }

        // Attempt to load the script.
        var scriptPath = useAbsPath ? Paths.get(path) : FileUtils.getScriptPath(path);
        if (!Files.exists(scriptPath)) {
            Grasscutter.getLogger().error("Could not find script at path {}", path);
            return null;
        }

        try {
            var source = Files.readString(scriptPath);
            ScriptLoader.scriptSources.put(path, new SoftReference<>(source));

            return source;
        } catch (IOException exception) {
            Grasscutter.getLogger()
                    .error("Loading script {} failed! - {}", path, exception.getLocalizedMessage());
            return null;
        }
    }

    private static CompiledScript newScript(String source, boolean fastRequire) {
        try {
            var engine = (LuaScriptEngine) sm.getEngineByName("luaj");
            // Set the Lua context.
            var ctx = new LuajContext(false, true);
            engine.setContext(ctx);
            // Set the 'require' function handler.
            if (fastRequire) ctx.globals.set("require", new RequireFunction(ctx));
            return engine.compile(source);
        } catch (Exception e) {
            Grasscutter.getLogger().error("Loading script failed! - {}", e.getLocalizedMessage());
            return NullScript;
        }
    }

    /**
     * Fetches a script and compiles it, or uses the cached varient.
     *
     * @param path The path of the script.
     * @return The compiled script.
     */
    public static CompiledScript getScript(String path) {
        return getScript(path, false);
    }

    /**
     * Fetches a script and compiles it, or uses the cached varient.
     *
     * @param path The path of the script.
     * @param useAbsPath Use path as-is; don't look under Scripts resources.
     * @return The compiled script.
     */
    public static CompiledScript getScript(String path, boolean useAbsPath) {
        // Check if the script is cached.
        var sc = ScriptLoader.tryGet(ScriptLoader.scriptsCache.get(path));
        if (sc.isPresent()) {
            return sc.get();
        }

        // Load the script source.
        String source = ScriptLoader.readScript(path, useAbsPath);
        if (source == null) return NullScript;
        // Check to see if the script references other scripts. Assuming every script in Common folder doesn't require again.
        boolean fastRequire = false;
        if (source.contains("require")) {
            fastRequire = true;
            for (Matcher matcher = regexRequire.matcher(source); matcher.find() && (fastRequire &= !slowRequire.contains(matcher.group(3))););
            // Assuming every local declaration has indent respect to its scope.
            if (fastRequire)
                source = regexLocal.matcher(source).replaceAll("");
            else {
                StringBuffer sb = new StringBuffer();
                Matcher m = regexRequire.matcher(source);
                while (m.find()) {
                    var scriptPath = "Common/" + m.group(3) + ".lua";
                    var scriptSource = ScriptLoader.readScript(scriptPath, false);
                    if (scriptSource == null) scriptSource = "";
                    m.appendReplacement(sb, scriptSource.replaceAll("$", "\\$"));
                }
                m.appendTail(sb);
                source = sb.toString();
            }
        }
        CompiledScript script = newScript(source, fastRequire);
        ScriptLoader.scriptsCache.put(path, new SoftReference<>(script));
        return script;
    }

    public static SceneMeta getSceneMeta(int sceneId) {
        return tryGet(sceneMetaCache.get(sceneId))
                .orElseGet(
                        () -> {
                            var instance = SceneMeta.of(sceneId);
                            sceneMetaCache.put(sceneId, new SoftReference<>(instance));
                            return instance;
                        });
    }
}
