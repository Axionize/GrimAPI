package ac.grim.grimac.api.packet;

import ac.grim.grimac.api.packet.entity.PacketEntityManager;
import ac.grim.grimac.api.packet.manager.PacketBlockStateManager;
import ac.grim.grimac.api.packet.manager.PacketItemManager;
import ac.grim.grimac.api.packet.manager.PacketStateTypeManager;
import ac.grim.grimac.api.packet.manager.PacketTypeFactory;
import ac.grim.grimac.api.packet.types.PacketWrapperFactory;
import ac.grim.grimac.api.packet.version.VersionManager;

public interface MCPacketAPI {
    PacketItemManager getItemManager();
    PacketEntityManager getEntityManager();
    PacketBlockStateManager getBlockStateManager();
    PacketStateTypeManager getStateTypeManager();
    PacketWrapperFactory packetFactory();
    VersionManager getVersionManager();
    PacketTypeFactory getPacketTypeManager();
}
