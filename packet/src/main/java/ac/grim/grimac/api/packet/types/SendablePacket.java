package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface SendablePacket extends Packet {
    static SendablePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }
}
