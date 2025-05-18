package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.player.enums.DiggingAction;
import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

public interface ServerAcknowledgePlayerDiggingPacket extends SendablePacket {
    static ServerAcknowledgePlayerDiggingPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    ImmutableVector3i getBlockPosition();

    int getBlockId();

    DiggingAction getAction();

    boolean isSuccessful();
}
