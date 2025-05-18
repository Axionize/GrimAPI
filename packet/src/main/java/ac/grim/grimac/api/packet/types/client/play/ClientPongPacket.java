package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientPongPacket extends SendablePacket {
    static ClientPongPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getId();
}
