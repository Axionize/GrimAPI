package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientChatMessagePacket extends RecievablePacket {
    static ClientChatMessagePacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    String getMessage();
}
