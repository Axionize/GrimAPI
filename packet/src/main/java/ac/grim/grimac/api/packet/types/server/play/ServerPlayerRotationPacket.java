package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerPlayerRotationPacket extends SendablePacket {
    static ServerPlayerRotationPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    float getPitch();

    void setPitch(int pitch);

    float getYaw();

    void setYaw(int yaw);
}
