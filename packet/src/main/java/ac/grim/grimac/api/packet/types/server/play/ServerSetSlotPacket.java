package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.item.PacketItemStack;
import ac.grim.grimac.api.packet.types.SendablePacket;
import com.github.retrooper.packetevents.protocol.item.ItemStack;

public interface ServerSetSlotPacket {
    static SendablePacket from(int windowsID, int stateID, int slot, PacketItemStack mainHand) {
        return null; // TODO (Packet Rewrite)
    }

    int getWindowId();

    int getSlot();

    int getStateId();

    PacketItemStack getItem();
}
