package ac.grim.grimac.api.packet.item;

import ac.grim.grimac.api.GrimAPIProvider;
import ac.grim.grimac.api.packet.component.PacketComponentType;
import ac.grim.grimac.api.packet.manager.PacketItemManager;
import org.jetbrains.annotations.ApiStatus;

import java.util.Optional;

@ApiStatus.Experimental
public interface PacketItemStack {
    PacketItemManager ITEM = GrimAPIProvider.getDirect().getPlatformLoader().getPacketItemManager();
    PacketItemStack EMPTY = ITEM.getEmptyStack();

    boolean isSameItemSameTags(PacketItemStack packetItemStack);
    PacketItemStack split(int toTake);
    int getAmount();
    int getMaxStackSize();
    boolean isEmpty();

    static Builder builder() {
        return ITEM.getBuilder();
    }

    void setAmount(int amount);

    void shrink(int amount);

    void grow(int amount);

    PacketItemStack copy();

    int getDamageValue();

    int getMaxDamage();

    PacketItemType getType();

    boolean is(PacketItemType packetItemType);

    boolean isDamaged();

    boolean hasComponent(PacketComponentType<?> glider);

    Optional<?> getComponent(PacketComponentType<Object> equippable);

    int getEnchantmentLevel(PacketEnchantmentType enchantmentType, int protocolVersion);

    int getLegacyData();

    interface Builder {
        Builder type(String name);
        Builder type(PacketItemType name);
        Builder amount(int amount);
        PacketItemStack build();
    }
}
