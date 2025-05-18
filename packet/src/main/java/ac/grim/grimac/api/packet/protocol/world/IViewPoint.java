package ac.grim.grimac.api.packet.protocol.world;

import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

public interface IViewPoint {
    static IViewPoint from(double x, double y, double z, float yaw, float pitch) {
        return null; // TODO (Packet Rewrite)
    }

    ImmutableVector3d getPosition();
    float getYaw();
    float getPitch();

    double getX();

    double getY();

    double getZ();
}
