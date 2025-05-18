package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerPingPacket extends SendablePacket {
    static ServerPingPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerPingPacket from(int transactionID) {
        return null; // TODO (Packet Rewrite)
    }

    int getId();
}
