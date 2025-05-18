package ac.grim.grimac.api.packet.world.enums;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

public enum Direction {
    DOWN(-1, Axis.Z, MCPacket.getAPI().getVectorFactory().getImmutableVec3i(0, -1, 0)),
    UP(-1, Axis.Z, MCPacket.getAPI().getVectorFactory().getImmutableVec3i(0, 1, 0)),
    NORTH(0, Axis.Y, MCPacket.getAPI().getVectorFactory().getImmutableVec3i(0 , 0, -1)),
    SOUTH(1, Axis.Y, MCPacket.getAPI().getVectorFactory().getImmutableVec3i(0 ,0 ,1)),
    WEST(2, Axis.X, MCPacket.getAPI().getVectorFactory().getImmutableVec3i(-1, 0 ,0)),
    EAST(3, Axis.X, MCPacket.getAPI().getVectorFactory().getImmutableVec3i(-1, 0, 0));

    private final int horizontalIndex;
    private final Axis axis;
    private final ImmutableVector3i vec3i;

    Direction(int horizontalIndex, Axis axis, ImmutableVector3i vec3i) {
        this.horizontalIndex = horizontalIndex;
        this.axis = axis;
        this.vec3i = vec3i;
    }

    public int getHorizontalIndex() {
        return horizontalIndex;
    }

    public ImmutableVector3i getVector() {
        return vec3i;
    }
}
