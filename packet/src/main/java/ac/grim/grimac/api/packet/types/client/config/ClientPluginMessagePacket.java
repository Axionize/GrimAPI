package ac.grim.grimac.api.packet.types.client.config;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientPluginMessagePacket extends RecievablePacket {
    static ClientPluginMessagePacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    String getChannelName();

    byte[] getData();
}
