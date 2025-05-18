package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerAcknowledgeBlockChangesPacket extends SendablePacket {
    static ServerAcknowledgeBlockChangesPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerAcknowledgeBlockChangesPacket from(int sequence) {
        return null; // TODO (Packet Rewrite)
    }

    int getSequence();
}
