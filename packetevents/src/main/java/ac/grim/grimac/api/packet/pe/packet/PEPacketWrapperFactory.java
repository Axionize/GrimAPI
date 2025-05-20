package ac.grim.grimac.api.packet.pe.packet;

import ac.grim.grimac.api.packet.types.PacketWrapperFactory;
import ac.grim.grimac.api.packet.types.client.play.*;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.types.server.play.*;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClientStatus;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientInteractEntity;
import ac.grim.grimac.api.packet.types.client.play.ClientPlayerBlockPlacementPacket;
import ac.grim.grimac.api.packet.types.client.play.ClientPlayerDiggingPacket;

public class PEPacketWrapperFactory implements PacketWrapperFactory {
    @Override
    public ClientClickWindowPacket clientClickWindow(PacketReceiveEvent event) {
        return null;
    }

    @Override
    public ClientCreativeInventoryActionPacket clientCreativeInventoryAction(PacketReceiveEvent event) {
        return null;
    }

    @Override
    public ClientEntityActionPacket clientEntityAction(PacketReceiveEvent event) {
        return null;
    }

    @Override
    public ClientPlayerBlockPlacementPacket clientPlayerBlockPlacement(ac.grim.grimac.api.packet.types.event.PacketReceiveEvent event) {
//        return new ClientPlayerBlockPlacementPacket((PacketReceiveEvent) event);
        return null;
    }

    @Override
    public ClientStatusPacket clientStatus(ac.grim.grimac.api.packet.types.event.PacketReceiveEvent event) {
//        return new WrapperPlayClientClientStatus((PacketReceiveEvent) event);
        return null;
    }

    @Override
    public ClientInteractEntityPacket clientInteractEntity(ac.grim.grimac.api.packet.types.event.PacketReceiveEvent event) {
//        return new WrapperPlayClientInteractEntity((PacketReceiveEvent) event);
        return null;
    }

    @Override
    public ClientPlayerDiggingPacket clientPlayerDigging(ac.grim.grimac.api.packet.types.event.PacketReceiveEvent event) {
//        return new ClientPlayerDiggingPacket((PacketReceiveEvent) event);
        return null;
    }

    @Override
    public ClientPlayerUseItemPacket clientPlayerUseItem(ac.grim.grimac.api.packet.types.event.PacketReceiveEvent event) {
        return null;
    }

    @Override
    public ClientHeldItemChangePacket clientHeldItemChange(ac.grim.grimac.api.packet.types.event.PacketReceiveEvent event) {
        return null;
    }

    @Override
    public ServerExplosionPacket serverExplosion(PacketSendEvent event) {
        return null;
    }

    @Override
    public ServerOpenWindowPacket serverOpenWindow(PacketSendEvent event) {
        return null;
    }

    @Override
    public ServerOpenHorseWindowPacket serverOpenHorseWindow(PacketSendEvent event) {
        return null;
    }

    @Override
    public ServerWindowItemsPacket serverWindowItems(PacketSendEvent event) {
        return null;
    }

    @Override
    public ServerSetSlotPacket serverSetSlot(PacketSendEvent event) {
        return null;
    }
}
