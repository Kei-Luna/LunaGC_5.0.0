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
        DoActionByEnergyChangeMixin,
        DoActionByKillingMixin,
        DoActionByTargetsCountMixin,
        OnAvatarUseSkillMixin,
        CostStaminaMixin,
        AttachModifierToPredicateMixin,
        DoActionByEntityKillMixin,
        OverrideCombatLockMixin,
        DoActionByElementReactionMixin,
        SwitchHealToHPDebtsMixin,
        AvatarChangeSkillMixin,
        WindZoneMixin,
        AttachActionToModifierMixin,
        MuteHitEffectMixin,
        DoActionByTeamStatusMixin,
        AttachToStateIDMixin,
        AvatarCombatMixin,
        CameraBlurMixin,
        TriggerWeatherMixin,
        AttachModifierToSelfGlobalValueMixin,
        AttachToNormalizedTimeMixin,
        ModifyDamageMixin,
        HPDebtsMixin,
        AttachToMultiNormalizedTimeMixin,
        DoActionOnGlobalValueChangeMixin,
        ShieldBarMixin,
        ReplaceEventPatternMixin,
        SwitchSkillIDMixin,
        TileAttackManagerMixin;
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
