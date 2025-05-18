package ac.grim.grimac.api.packet.world.chunk.palette;

import ac.grim.grimac.api.packet.world.chunk.storage.BitStorage;

public interface DataPaletteHolder {
    static DataPaletteHolder from(Palette palette, BitStorage storage) {
//        ListPalette palette = ListPalette.from(4);
//        BitStorage storage = BitStorage.from(4, 4096);
//        DataPaletteHolder dataPalette = DataPaletteHolder.from(palette, storage, PaletteType.CHUNK);
        return null; // TODO (Packet Rewrite)
    }

    static DataPaletteHolder createForChunk() {
        return null; // TODO (Packet Rewrite)
    }

    int set(int x, int y, int z, int state);
}
