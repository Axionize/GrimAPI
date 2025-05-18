package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityAnimationPacket extends SendablePacket {
    static ServerEntityAnimationPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    EntityAnimationType getType();

    enum EntityAnimationType {
        SWING_MAIN_ARM,
        HURT,
        WAKE_UP,
        SWING_OFF_HAND,
        CRITICAL_HIT,
        MAGIC_CRITICAL_HIT;
    }

    int getEntityId();
}
