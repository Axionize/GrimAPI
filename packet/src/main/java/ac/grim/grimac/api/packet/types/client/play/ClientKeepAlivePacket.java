package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientKeepAlivePacket extends SendablePacket {
    static ClientKeepAlivePacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    long getId();
}
