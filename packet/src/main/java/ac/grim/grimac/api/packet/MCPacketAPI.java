package ac.grim.grimac.api.packet;

import ac.grim.grimac.api.packet.entity.PacketEntityManager;
import ac.grim.grimac.api.packet.manager.PacketItemManager;

public interface MCPacketAPI {
    PacketItemManager getItemManager();
    PacketEntityManager getEntityManager();
}
