package ac.grim.grimac.api.packet.world.chunk.v1_18;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.world.chunk.PacketChunk;
import ac.grim.grimac.api.packet.world.dimension.PacketDimensionType;

import java.util.BitSet;

public interface ChunkReaderV1_18 {
    static ChunkReaderV1_18 from() {
        return null; // TODO (Packet Rewrite)
    }

    PacketChunk[] read(PacketDimensionType dimensionType, BitSet chunkMask, BitSet secondaryChunkMask, boolean fullChunk,
                       boolean hasBlockLight, boolean hasSkyLight, int chunkSize, int arrayLength, SendablePacket wrapper);
}
