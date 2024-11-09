package emu.grasscutter.data.binout.routes;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.net.proto.RoutePointOuterClass;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoutePoint {
    @SerializedName(value = "pos", alternate = {"_pos"})
    private Position pos;
    private int speedLevel; // optional
    private float waitTime; // optional
    private float targetVelocity; // optional
    private boolean hasReachEvent; // optional
    // rotRoundReachDir //optional Pos with optional values
    // rotRoundLeaveDir //optional Pos with optional values

    public RoutePointOuterClass.RoutePoint.Builder toProto() {
        val builder = RoutePointOuterClass.RoutePoint.newBuilder().setPosition(pos.toProto());
        if (waitTime != 0) {
            builder.setTime(waitTime);
        } else if (targetVelocity != 0) {
            builder.setVelocity(targetVelocity);
        }

        return builder;
    }
}
