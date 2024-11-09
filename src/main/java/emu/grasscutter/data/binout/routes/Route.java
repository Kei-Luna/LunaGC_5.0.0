package emu.grasscutter.data.binout.routes;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.net.proto.RouteOuterClass;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Route {
    private int localId;
    @SerializedName(value = "name", alternate = {"_name"})
    private String name;
    private RouteType type = RouteType.Unknown;
    @SerializedName(value = "points", alternate = {"_points"})
    private RoutePoint[] points;
    private float arriveRange; // optional
    private RotType rotType; // optional
    private RotAngleType rotAngleType; // optional

    public RouteOuterClass.Route toProto() {
        val builder = RouteOuterClass.Route.newBuilder().setRouteType(type.getValue());
        if (points != null) {
            for (var routePoint : points) {
                builder.addRoutePoints(routePoint.toProto().setArriveRange(arriveRange));
            }
        }
        return builder.build();
    }
}
