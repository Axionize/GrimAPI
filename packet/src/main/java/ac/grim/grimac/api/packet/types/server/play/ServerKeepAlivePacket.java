package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerKeepAlivePacket extends SendablePacket {
    static ServerKeepAlivePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    long getId();
}
