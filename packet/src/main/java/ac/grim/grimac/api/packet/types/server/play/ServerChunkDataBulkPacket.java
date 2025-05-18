package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.world.chunk.PacketChunk;
import org.jetbrains.annotations.ApiStatus;

/**
 * Only used in 1.7 and 1.8
 */
@ApiStatus.Obsolete
public interface ServerChunkDataBulkPacket extends SendablePacket {
    static ServerChunkDataBulkPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    PacketChunk[][] getChunks();

    int[] getX();

    int[] getZ();
}
