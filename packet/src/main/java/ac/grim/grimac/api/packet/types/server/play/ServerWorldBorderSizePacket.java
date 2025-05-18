package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerWorldBorderSizePacket extends SendablePacket {
    static ServerWorldBorderSizePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    double getDiameter();
}
