package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

public interface ClientVehicleMovePacket extends RecievablePacket {
    static ClientVehicleMovePacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    ImmutableVector3d getPosition();

    float getYaw();

    float getPitch();
}
