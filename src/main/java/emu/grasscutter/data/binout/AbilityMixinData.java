package emu.grasscutter.data.binout;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.*;

public class AbilityMixinData implements Serializable {
    private static final long serialVersionUID = -2001232313615923575L;

    public enum Type {
        AttachToGadgetStateMixin,
        @SerializedName(value = "AttachToStateIDMixin", alternate = {"KPLCEJNHNEE", "MoleMole.Config.AttachToStateIDMixin"})
        AttachToStateIDMixin,
        @SerializedName(value = "ShieldBarMixin", alternate = "LIFBJIECEDK")
        ShieldBarMixin,
        TileAttackManagerMixin,
        AttachToElementTypeMixin,
        ReplaceEventPatternMixin,
        @SerializedName(value = "AttachModifierToSelfGlobalValueMixin", alternate = {"KEEINDIIMIM", "MoleMole.Config.AttachModifierToSelfGlobalValueMixin"})
        AttachModifierToSelfGlobalValueMixin,
        @SerializedName(value = "InvisibleInTalkAndCSMixin", alternate = "MoleMole.Config.InvisibleInTalkAndCSMixin")
        InvisibleInTalkAndCSMixin,
        @SerializedName(value = "ModifyCameraAircraftParamMixin", alternate = "MoleMole.Config.ModifyCameraAircraftParamMixin")
        ModifyCameraAircraftParamMixin,
        @SerializedName(value = "TriggerPostProcessEffectMixin", alternate = "MoleMole.Config.TriggerPostProcessEffectMixin")
        TriggerPostProcessEffectMixin;
    }

    @SerializedName("$type")
    public Type type;

    private JsonElement modifierName;

    public List<String> getModifierNames() {
        if (modifierName.isJsonArray()) {
            java.lang.reflect.Type listType = (new TypeToken<List<String>>() {}).getType();
            List<String> list = (new Gson()).fromJson(modifierName, listType);
            return list;
        } else {
            return Arrays.asList(modifierName.getAsString());
        }
    }
}
