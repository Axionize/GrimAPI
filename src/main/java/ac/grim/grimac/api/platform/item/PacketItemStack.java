package ac.grim.grimac.api.platform.item;

import ac.grim.grimac.api.GrimAPIProvider;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface PacketItemStack {
    boolean isSameItemSameTags(PacketItemStack packetItemStack);
    PacketItemStack split(int toTake);
    int getAmount();
    int getMaxStackSize();
    boolean isEmpty();

    static Builder builder() {
        return GrimAPIProvider.getDirect().getPacketItemBuilder();
    }

    interface Builder {
        Builder type(String name);
        Builder amount(int amount);
        PacketItemStack builder();
    }
}
