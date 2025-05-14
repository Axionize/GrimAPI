package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.item.PacketItemStack;
import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3f;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;
import ac.grim.grimac.api.packet.world.enums.BlockFace;

import java.util.Optional;

public interface ClientPlayerBlockPlacementPacket extends SendablePacket {
    BlockFace blockFace();
    Optional<PacketItemStack> getItemStack();
    int getSequence();
    ImmutableVector3i getBlockPosition();
    ImmutableVector3f getCursorPosition();
}
