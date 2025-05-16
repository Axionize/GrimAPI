package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.types.PacketType;

public interface PacketTypeFactory {
    PacketType getC2SPacketTypeByString(String packetIdentifier);
    PacketType getS2CPacketTypeByString(String packetIdentifier);
}
