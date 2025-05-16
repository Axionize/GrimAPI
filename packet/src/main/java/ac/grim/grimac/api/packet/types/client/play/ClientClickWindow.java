package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface ClientClickWindow extends RecievablePacket {
    WindowClickType windowClickType();

    enum WindowClickType {
        PICKUP,
        QUICK_MOVE,
        SWAP,
        CLONE,
        THROW,
        QUICK_CRAFT,
        PICKUP_ALL,
        UNKNOWN;
    }
}
