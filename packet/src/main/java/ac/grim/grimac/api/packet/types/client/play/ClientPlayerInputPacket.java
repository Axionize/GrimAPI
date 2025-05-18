package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientPlayerInputPacket extends RecievablePacket {
    static ClientPlayerInputPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    boolean isForward();

    boolean isBackward();

    boolean isLeft();

    boolean isRight();

    boolean isJump();

    boolean isShift();

    boolean isSprint();
}
