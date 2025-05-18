package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.protocol.teleport.RelativeFlag;
import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

public interface ServerPlayerPositionAndLookPacket extends SendablePacket {
    static ServerPlayerPositionAndLookPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerPlayerPositionAndLookPacket from(double x, double y, double z, float yaw, float pitch,
                                                  byte flags, int teleportId, boolean dismountVehicle) {
        return null; // TODO (Packet Rewrite)
    }

    double getX();

    double getY();

    double getZ();

    float getYaw();

    float getPitch();

    boolean isRelativeFlag(RelativeFlag x);

    void setRelative(RelativeFlag flag, boolean relative);

    void setX(double x);

    void setY(double y);

    void setZ(double z);

    boolean isDismountVehicle();

    ImmutableVector3d getDeltaMovement();

    RelativeFlag getRelativeFlags();

    int getTeleportId();
}
