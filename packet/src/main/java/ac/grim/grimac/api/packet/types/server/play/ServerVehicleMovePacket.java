package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

public interface ServerVehicleMovePacket {
    static ServerVehicleMovePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    ImmutableVector3d getPosition();
}
