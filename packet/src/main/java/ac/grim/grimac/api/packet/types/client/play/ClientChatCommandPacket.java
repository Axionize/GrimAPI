package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientChatCommandPacket extends RecievablePacket {
    static ClientChatCommandPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    String getCommand();
}
