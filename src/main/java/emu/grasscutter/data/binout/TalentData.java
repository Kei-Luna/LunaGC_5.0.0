package emu.grasscutter.data.binout;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.common.DynamicFloat;
import java.io.Serializable;

public class TalentData implements Serializable {
    public enum Type {
        @SerializedName(value = "AddAbility", alternate = "PMNMNAJPAJM")
        AddAbility,
        @SerializedName(value = "ModifySkillCD", alternate = "IMHHAILMJOL")
        ModifySkillCD,
        @SerializedName(value = "UnlockTalentParam", alternate = "ENOOJEEGFMJ")
        UnlockTalentParam,
        @SerializedName(value = "AddTalentExtraLevel", alternate = "FLJFCBKMDLH")
        AddTalentExtraLevel,
        @SerializedName(value = "ModifyAbility", alternate = "MLKFNEPHHND")
        ModifyAbility,
        CPAFGCPBJKB,
        GICDBMMHIGO;
    }

    @SerializedName("$type")
    public Type type;

    public String abilityName;
    public String talentParam;
    public int talentIndex;
    public int extraLevel;

    public String paramSpecial;
    public DynamicFloat paramDelta;
    public DynamicFloat paramRatio = new DynamicFloat(1.0f);
}
