package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientSteerVehiclePacket extends RecievablePacket {
    static ClientSteerVehiclePacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    float getForward();

    float getSideways();
}
