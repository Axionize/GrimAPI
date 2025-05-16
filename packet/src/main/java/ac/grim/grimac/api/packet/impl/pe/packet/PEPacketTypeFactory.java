package ac.grim.grimac.api.packet.impl.pe.packet;

import ac.grim.grimac.api.packet.manager.PacketTypeFactory;
import ac.grim.grimac.api.packet.types.PacketType;

import java.util.IdentityHashMap;
import java.util.Map;

public class PEPacketTypeFactory implements PacketTypeFactory {

    public static final Map<String, PacketType> map = new IdentityHashMap<>();

    public PEPacketTypeFactory() {
        map.put("player_rotation", com.github.retrooper.packetevents.protocol.packettype.PacketType.Play.Client.PLAYER_ROTATION);
        map.put("interact", com.github.retrooper.packetevents.protocol.packettype.PacketType.Play.Client.INTERACT_ENTITY);
    }

    @Override
    public PacketType getC2SPacketTypeByString(String packetIdentifier) {
        return map.get(packetIdentifier);
    }

    @Override
    public PacketType getS2CPacketTypeByString(String packetIdentifier) {
        return null;
    }
}
