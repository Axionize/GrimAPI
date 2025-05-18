package ac.grim.grimac.api.packet.world.chunk.v1_9;

import ac.grim.grimac.api.packet.world.chunk.PacketChunk;
import ac.grim.grimac.api.packet.world.chunk.palette.DataPaletteHolder;

public interface ChunkV1_9 extends PacketChunk {
    static ChunkV1_9 from(int blockCount, DataPaletteHolder dataPaletteHolder) {
        return null; // TODO (Packet Rewrite)
    }
}
