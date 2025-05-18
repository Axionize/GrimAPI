package ac.grim.grimac.api.packet.world.chunk.storage;

public interface BaseStorage {
    int get(int index);

    void set(int index, int value);
}
