package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface RecievablePacket extends Packet {
    static RecievablePacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }
}
