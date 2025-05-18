package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;

public interface ClientSelectBundleItemPacket extends PacketReceiveEvent {
    static ClientSelectBundleItemPacket from(PacketReceiveEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getSelectedItemIndex();
}
