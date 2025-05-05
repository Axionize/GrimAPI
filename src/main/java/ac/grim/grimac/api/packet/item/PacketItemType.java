package ac.grim.grimac.api.packet.item;

import ac.grim.grimac.api.GrimAPIProvider;
import ac.grim.grimac.api.packet.ResourceLocationI;
import ac.grim.grimac.api.packet.manager.PacketItemTypeManager;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental @ApiStatus.Internal
public interface PacketItemType {
    int getMaxAmount();

    boolean hasAttribute(PacketItemAttribute itemAttribute);

    // Remember to make sure the Optimzation in PacketEventsInit for loading name works
    ResourceLocationI getName();

    PacketStateType getPlacedType();
}
