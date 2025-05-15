package ac.grim.grimac.api.packet.registry.ctx;

import ac.grim.grimac.api.packet.registry.PacketKey;
import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface PacketContext {
    PacketKey key();                // universal key
    Object           raw();                // underlying PE event, Minestom packet, or native buffer
    <T extends RecievablePacket> T wrapper(Class<T> type); // lazily built & cached
}