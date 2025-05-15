package ac.grim.grimac.api.packet.registry.map;

import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface PacketWrapperFactory {
    <T extends RecievablePacket> T wrap(Object event, Class<T> apiClass);
}
