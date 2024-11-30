package emu.grasscutter.game.dungeons.enums;

import com.google.gson.annotations.SerializedName;
public enum DungeonEntryCondCombType {
    DUNGEON_ENTRY_COND_COMB_NONE,
    @SerializedName(value = "DUNGEON_ENTRY_COND_COMB_LOGIC_OR", alternate = "LOGIC_OR")
    DUNGEON_ENTRY_COND_COMB_LOGIC_OR,
    DUNGEON_ENTRY_COND_COMB_LOGIC_AND
}
