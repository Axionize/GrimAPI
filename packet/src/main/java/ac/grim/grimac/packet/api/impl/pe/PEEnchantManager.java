package ac.grim.grimac.packet.api.impl.pe;

import ac.grim.grimac.api.packet.item.PacketEnchantmentType;
import ac.grim.grimac.api.packet.manager.PacketEnchantmentManager;
import com.github.retrooper.packetevents.protocol.item.enchantment.type.EnchantmentTypes;

public class PEEnchantManager implements PacketEnchantmentManager {
    @Override
    public PacketEnchantmentType getEnchantmentTypeByString(String string) {
        return EnchantmentTypes.getByName(string);
    }
}
