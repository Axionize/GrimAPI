package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerWorldBorderPacket extends SendablePacket {
    static ServerWorldBorderPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    WorldBorderAction getAction();

    double getRadius();

    double getOldRadius();

    double getNewRadius();

    long getSpeed();

    double getCenterX();

    double getCenterZ();

    int getPortalTeleportBoundary();

    enum WorldBorderAction {
        SET_SIZE,
        LERP_SIZE,
        SET_CENTER,
        INITIALIZE,
        SET_WARNING_TIME,
        SET_WARNING_BLOCKS;
    }
}
