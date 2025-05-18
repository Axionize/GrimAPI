package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientPlayerAbilitiesPacket extends RecievablePacket {

    static ClientPlayerAbilitiesPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    boolean isFlying();
}
