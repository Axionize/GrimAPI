package ac.grim.grimac.api.packet.impl.pe;

import ac.grim.grimac.api.packet.MCPacketAPI;
import ac.grim.grimac.api.packet.entity.PacketEntityManager;
import ac.grim.grimac.api.packet.impl.pe.entity.PEEntityManager;
import ac.grim.grimac.api.packet.impl.pe.item.PEItemManager;
import ac.grim.grimac.api.packet.manager.PacketBlockStateManager;
import ac.grim.grimac.api.packet.manager.PacketItemManager;
import ac.grim.grimac.api.packet.manager.PacketStateTypeManager;
import ac.grim.grimac.api.packet.types.PacketWrapperFactory;

public class PEPacketAPI implements MCPacketAPI {

    private final PacketItemManager packetItemTypeManager = new PEItemManager();
    private final PacketEntityManager packetEntityManager = new PEEntityManager();

    public PEPacketAPI() {

    }

    @Override
    public PacketItemManager getItemManager() {
        return packetItemTypeManager;
    }

    @Override
    public PacketEntityManager getEntityManager() {
        return packetEntityManager;
    }

    @Override // TODO fix
    public PacketBlockStateManager getBlockStateManager() {
        return null;
    }

    @Override
    public PacketStateTypeManager getStateTypeManager() {
        return null;
    }

    @Override
    public PacketWrapperFactory packetFactory() {
        return null;
    }
}
