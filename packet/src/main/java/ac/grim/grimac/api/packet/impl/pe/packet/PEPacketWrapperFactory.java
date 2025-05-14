package ac.grim.grimac.api.packet.impl.pe.packet;

import ac.grim.grimac.api.packet.types.PacketWrapperFactory;
import ac.grim.grimac.api.packet.types.client.play.ClientPlayerBlockPlacementPacket;
import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerBlockPlacement;

public class PEPacketWrapperFactory implements PacketWrapperFactory {
    @Override
    public ClientPlayerBlockPlacementPacket newClientPlayerBlockPlacementPacket(Object event) {
        return new WrapperPlayClientPlayerBlockPlacement((PacketReceiveEvent) event);
    }
}
