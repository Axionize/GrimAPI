package ac.grim.grimac.api.packet.registry.map;

import ac.grim.grimac.api.packet.registry.PacketKey;

public interface PacketTypeMapper {
    PacketKey map(Object platformHandle);
}