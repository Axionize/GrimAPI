package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

public interface ServerBlockActionPacket extends SendablePacket {
    static ServerBlockActionPacket from(PacketSendEvent event) {
        return null;
    }

    ImmutableVector3i getBlockPosition();

    int getActionData();
}
