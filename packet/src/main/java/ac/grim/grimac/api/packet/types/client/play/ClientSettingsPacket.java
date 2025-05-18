package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientSettingsPacket extends RecievablePacket {
    static ClientSettingsPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getViewDistance();

    void setViewDistance(int viewDistance);
}
