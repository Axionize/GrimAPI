package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerWorldBorderLerpSizePacket extends SendablePacket {
    static ServerWorldBorderLerpSizePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    double getOldDiameter();

    double getNewDiameter();

    long getSpeed();
}
