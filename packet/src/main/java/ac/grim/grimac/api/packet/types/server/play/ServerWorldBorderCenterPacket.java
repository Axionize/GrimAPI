package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerWorldBorderCenterPacket extends SendablePacket {
    static ServerWorldBorderCenterPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    double getX();

    double getZ();
}
