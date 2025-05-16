package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.player.enums.DiggingAction;
import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface ClientPlayerDiggingPacket extends RecievablePacket {
    DiggingAction action();
}
