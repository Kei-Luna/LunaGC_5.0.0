package emu.grasscutter.game.ability.actions;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.scripts.ScriptLoader;
import javax.script.Bindings;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

@AbilityAction(AbilityModifierAction.Type.ServerLuaCall)
public final class ActionServerLuaCall extends AbilityActionHandler {
    @Override
    public boolean execute(
            Ability ability, AbilityModifierAction action, ByteString abilityData, GameEntity target) {
        var scene = target.getScene();
        var scriptManager = scene.getScriptManager();

        var functionName = action.funcName;

        // Set the script library's manager.
        var scriptLib = ScriptLoader.getScriptLib();
        scriptLib.setCurrentEntity(target);
        scriptLib.setSceneScriptManager(scriptManager);

        // Attempt to call the function.
        return switch (action.luaCallType) {
            default -> false;
            case FromGroup -> {
                var groupId = target.getGroupId();
                var group = scriptManager.getGroupById(groupId);
                var script = group.getBindings();

                // Set the script library's group.
                scriptLib.setCurrentGroup(group);

                yield ActionServerLuaCall.callFunction(script, functionName, ability, action);
            }
            case SpecificGroup -> {
                var groupId = action.callParamList[0];
                var group = scriptManager.getGroupById(groupId);
                var script = group.getBindings();

                // Set the script library's group.
                scriptLib.setCurrentGroup(group);

                yield ActionServerLuaCall.callFunction(script, functionName, ability, action);
            }
            case Gadget -> {
                var controller = target.getEntityController();
                if (controller == null || functionName.isBlank()) yield false;

                // Hand off the function handling to the controller.
                controller.callControllerScriptFunc(target, functionName, ability, action);

                yield true;
            }
        };
    }

    /**
     * Handles fetching and calling a function.
     *
     * @param bindings The bindings to fetch the function from.
     * @param functionName The name of the function to call.
     * @param ability The ability data.
     * @param action The ability action data.
     * @return Whether the function was called successfully.
     */
    private static boolean callFunction(
            Bindings bindings, String functionName, Ability ability, AbilityModifierAction action) {
        try {
            // Resolve the function from the script.
            var function = bindings.get(functionName);
            if (!(function instanceof LuaFunction luaFunction))
                throw new Exception("Function is not a LuaFunction.");

            // Convert parameters to Lua values.
            var lParam1 = LuaValue.valueOf(action.param1.getInt(ability));
            var lParam2 = LuaValue.valueOf(action.param2.getInt(ability));
            var lParam3 = LuaValue.valueOf(action.param3.getInt(ability));

            // Invoke the function with the parameters.
            switch (action.paramNum) {
                case 1 -> luaFunction.invoke(new LuaValue[] {lParam1});
                case 2 -> luaFunction.invoke(new LuaValue[] {lParam1, lParam2});
                case 3 -> luaFunction.invoke(new LuaValue[] {lParam1, lParam2, lParam3});
                default -> luaFunction.invoke(new LuaValue[] {ScriptLoader.getScriptLibLua()});
            }

            return true;
        } catch (Exception exception) {
            Grasscutter.getLogger().warn("Unable to invoke {}.", functionName, exception);
            return false;
        }
    }
}
