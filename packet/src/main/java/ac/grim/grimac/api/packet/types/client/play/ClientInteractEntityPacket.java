package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface ClientInteractEntityPacket extends RecievablePacket {
    InteractAction action();

    enum InteractAction {
        INTERACT, ATTACK, INTERACT_AT;
    }
}
