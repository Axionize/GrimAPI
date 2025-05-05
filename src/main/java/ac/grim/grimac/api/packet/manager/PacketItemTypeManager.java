package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.item.PacketItemType;

public interface PacketItemTypeManager {
    PacketItemType getByString(String string);
}
