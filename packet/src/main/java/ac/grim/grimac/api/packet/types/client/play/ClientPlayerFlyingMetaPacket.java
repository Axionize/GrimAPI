package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.protocol.world.IViewPoint;
import ac.grim.grimac.api.packet.types.PacketType;
import ac.grim.grimac.api.packet.types.PacketTypes;
import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientPlayerFlyingMetaPacket extends RecievablePacket {
    static boolean isFlying(PacketType type) {
        return type == PacketTypes.Play.Client.PLAYER_FLYING
                || type == PacketTypes.Play.Client.PLAYER_POSITION
                || type == PacketTypes.Play.Client.PLAYER_ROTATION
                || type == PacketTypes.Play.Client.PLAYER_POSITION_AND_ROTATION;
    }

    static ClientPlayerFlyingMetaPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    boolean isOnGround();

    void setOnGround(boolean onGround);

    boolean hasPositionChanged();

    boolean hasRotationChanged();

    IViewPoint getLocation();

    void setLocation(IViewPoint iViewPoint);

    boolean isHorizontalCollision();
}
