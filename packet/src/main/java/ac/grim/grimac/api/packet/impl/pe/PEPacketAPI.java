package ac.grim.grimac.api.packet.impl.pe;

import ac.grim.grimac.api.packet.MCPacketAPI;
import ac.grim.grimac.api.packet.entity.PacketEntityManager;
import ac.grim.grimac.api.packet.impl.pe.entity.PEEntityManager;
import ac.grim.grimac.api.packet.impl.pe.item.PEItemManager;
import ac.grim.grimac.api.packet.impl.pe.packet.PEPacketWrapperFactory;
import ac.grim.grimac.api.packet.impl.pe.type.block.PEPacketBlockStateManager;
import ac.grim.grimac.api.packet.impl.pe.type.state.PEPacketStateTypeManager;
import ac.grim.grimac.api.packet.impl.pe.version.PEPacketVersionManager;
import ac.grim.grimac.api.packet.manager.PacketBlockStateManager;
import ac.grim.grimac.api.packet.manager.PacketItemManager;
import ac.grim.grimac.api.packet.manager.PacketStateTypeManager;
import ac.grim.grimac.api.packet.types.PacketWrapperFactory;
import ac.grim.grimac.api.packet.version.VersionManager;

public class PEPacketAPI implements MCPacketAPI {

    private final PacketItemManager packetItemTypeManager = new PEItemManager();
    private final PacketEntityManager packetEntityManager = new PEEntityManager();
    private final PacketBlockStateManager packetBlockStateManager = new PEPacketBlockStateManager();
    private final PacketStateTypeManager packetStateTypeManager = new PEPacketStateTypeManager();
    private final PacketWrapperFactory packetWrapperFactory = new PEPacketWrapperFactory();
    private final VersionManager packetVersionManager = new PEPacketVersionManager();

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
        return packetBlockStateManager;
    }

    @Override
    public PacketStateTypeManager getStateTypeManager() {
        return packetStateTypeManager;
    }

    @Override
    public PacketWrapperFactory packetFactory() {
        return packetWrapperFactory;
    }

    @Override
    public VersionManager getVersionManager() {
        return packetVersionManager;
    }
}
