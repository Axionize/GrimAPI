package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientWindowConfirmationPacket extends RecievablePacket {
    static ClientWindowConfirmationPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    short getActionId();

    boolean isAccepted();
}
