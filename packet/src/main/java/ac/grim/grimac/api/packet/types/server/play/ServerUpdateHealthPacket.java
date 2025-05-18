package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerUpdateHealthPacket extends SendablePacket {
    static ServerUpdateHealthPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getFood();

    float getHealth();

    float getFoodSaturation();
}
