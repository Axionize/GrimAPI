package ac.grim.grimac.api.packet.world.chunk;

public interface Column {
    PacketChunk[] getChunks();

    boolean isFullChunk();

    int getX();

    int getZ();
}
