package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.types.client.play.ClientPlayerBlockPlacementPacket;

public interface PacketWrapperFactory {
    ClientPlayerBlockPlacementPacket newClientPlayerBlockPlacementPacket(Object event);
}
