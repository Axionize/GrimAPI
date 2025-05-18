package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.world.chunk.Column;

public interface ServerChunkDataPacket extends SendablePacket {
    static ServerChunkDataPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    Column getColumn();
}
