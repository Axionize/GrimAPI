package ac.grim.grimac.api.packet.impl.pe;

import ac.grim.grimac.api.packet.MCPacketAPI;
import ac.grim.grimac.api.packet.entity.PacketEntityManager;
import ac.grim.grimac.api.packet.impl.pe.entity.PEEntityManager;
import ac.grim.grimac.api.packet.impl.pe.item.PEItemManager;
import ac.grim.grimac.api.packet.manager.PacketItemManager;

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
}
