package ac.grim.grimac.api.packet.registry;

import ac.grim.grimac.api.packet.protocol.PacketConnectionState;

public final class VanillaKeys {
    private VanillaKeys() { }

    public static final PacketKey C_BLOCK_PLACE =
            registerC2SVanillaKey("use_item_on", PacketConnectionState.PLAY);

    private static PacketKey registerC2SVanillaKey(String name, PacketConnectionState state) {
        return new PacketKey("minecraft:" + name, state, true);
    }
}