package ac.grim.grimac.api.packet.world.chunk;

import ac.grim.grimac.api.packet.block.PacketBlockState;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import ac.grim.grimac.api.packet.world.chunk.palette.DataPaletteHolder;

public interface PacketChunk {
    boolean isEmpty();

    PacketBlockState get(PacketClientVersion blockVersion, int x, int y, int z);

    PacketBlockState get(PacketClientVersion blockVersion, int x, int y, int z, boolean clone);

    void set(int x, int y, int z, int combinedID);

    int getBlockCount();

    DataPaletteHolder getChunkData();
}
