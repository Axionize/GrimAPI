package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

public interface ServerUseBedPacket extends SendablePacket {
    static ServerUseBedPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    ImmutableVector3i getPosition();
}
