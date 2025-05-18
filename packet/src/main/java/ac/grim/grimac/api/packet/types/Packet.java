package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.types.event.PacketEvent;

import java.util.Map;
import java.util.function.Function;

public interface Packet {
    static Packet from(PacketEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int readInt();

    int readVarInt();

    // TODO (Packet Rewrite) NBT interfaces
    Object readNBT();

    <K, V> Map<K, V> readMap(Function<Packet, K> keyFunction, Function<Packet, V> valueFunction);

    // TODO Stop relying on (Bytebuf) from this
    Object getBuffer();

    boolean readBoolean();

    int readUnsignedShort();
    
    long[] readLongArray();
}
