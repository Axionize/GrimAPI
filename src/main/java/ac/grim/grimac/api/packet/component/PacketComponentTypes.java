package ac.grim.grimac.api.packet.component;

import ac.grim.grimac.api.GrimAPIProvider;
import ac.grim.grimac.api.packet.manager.PacketComponentManager;
import org.jetbrains.annotations.ApiStatus;

public class PacketComponentTypes {
    @ApiStatus.Experimental
    @ApiStatus.Internal
    private static final PacketComponentManager TYPE = GrimAPIProvider.getDirect().getPlatformLoader().getPacketItemManager().getComponentManager();

    @ApiStatus.Experimental @ApiStatus.Internal
    static PacketComponentType<?> getComponentByName(String string) {
        return TYPE.getComponentTypeFromString(string);
    }


    public static final PacketComponentType<PacketItemUseCooldown> USE_COOLDOWN = (PacketComponentType<PacketItemUseCooldown>) getComponentByName("use_cooldown");
}
