package ac.grim.grimac.api.packet.world.chunk.v1_18;

import ac.grim.grimac.api.packet.world.chunk.PacketChunk;
import ac.grim.grimac.api.packet.world.chunk.palette.DataPaletteHolder;

public interface ChunkV1_18 extends PacketChunk {
    static PacketChunk from() {
        return null; // TODO (Packet Rewrite)
    }
    static PacketChunk from(int blockCount, DataPaletteHolder chunkData, DataPaletteHolder biomeData) {
        return null; // TODO (Packet Rewrite)
    }
}
