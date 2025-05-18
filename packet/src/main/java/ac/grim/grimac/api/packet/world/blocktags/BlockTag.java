package ac.grim.grimac.api.packet.world.blocktags;

import ac.grim.grimac.api.packet.item.PacketStateType;

import java.util.Set;

public interface BlockTag {
    boolean contains(PacketStateType type);

    Set<PacketStateType> getStates();
}
