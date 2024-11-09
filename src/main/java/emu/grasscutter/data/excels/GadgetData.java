package emu.grasscutter.data.excels;

import emu.grasscutter.data.*;
import emu.grasscutter.game.props.EntityType;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@ResourceType(name = "GadgetExcelConfigData.json")
@Getter
public final class GadgetData extends GameResource {
    @Getter(onMethod_ = @Override)
    private int id;

    private EntityType type;
    private String jsonName;
    private boolean isInteractive;
    private String[] tags;
    private String itemJsonName;
    private long nameTextMapHash;
    @SerializedName(value = "campID")
    private int campId;
    private String visionLevel;
}
