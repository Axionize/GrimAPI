package ac.grim.grimac.api.packet.item;

import ac.grim.grimac.api.GrimAPIProvider;
import ac.grim.grimac.api.packet.ResourceLocationI;
import ac.grim.grimac.api.packet.manager.PacketItemTypeManager;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental @ApiStatus.Internal
public interface PacketItemType {
    @ApiStatus.Experimental @ApiStatus.Internal
    PacketItemTypeManager TYPE = GrimAPIProvider.getDirect().getPlatformLoader().getPacketItemManager().getItemTypeManager();

    PacketItemType AIR = getPacketItemTypeFromString("air");
    PacketItemType LIGHT = getPacketItemTypeFromString("light");
    PacketItemType BUCKET = getPacketItemTypeFromString("bucket");
    PacketItemType FLINT_AND_STEEL = getPacketItemTypeFromString("flint_and_steel");
    PacketItemType FIRE_CHARGE = getPacketItemTypeFromString("fire_charge");
    PacketItemType ELYTRA = getPacketItemTypeFromString("elytra");
    PacketItemType CARROT_ON_A_STICK = getPacketItemTypeFromString("carrot_on_a_stick");
    PacketItemType WARPED_FUNGUS_ON_A_STICK = getPacketItemTypeFromString("warped_fungus_on_a_stick");
    PacketItemType LEATHER_BOOTS = getPacketItemTypeFromString("leather_boots");

    int getMaxAmount();

    boolean hasAttribute(PacketItemAttribute itemAttribute);

    // Remember to make sure the Optimzation in PacketEventsInit for loading name works
    ResourceLocationI getName();

    PacketStateType getPlacedType();

    @ApiStatus.Experimental @ApiStatus.Internal
    static PacketItemType getPacketItemTypeFromString(String string) {
        return TYPE.getByString(string);
    }
}
