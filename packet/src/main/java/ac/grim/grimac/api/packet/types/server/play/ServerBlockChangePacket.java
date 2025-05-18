package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

public interface ServerBlockChangePacket extends SendablePacket {
    static ServerBlockChangePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerBlockChangePacket from(ImmutableVector3i blockPosition, int blockID) {
        return null; // TODO (Packet Rewrite)
    }

    ImmutableVector3i getBlockPosition();

    int getBlockId();
}
