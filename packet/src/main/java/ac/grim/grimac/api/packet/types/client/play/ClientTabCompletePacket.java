package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientTabCompletePacket extends RecievablePacket {
    static ClientTabCompletePacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    String getText();
}
