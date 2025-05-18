package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;
import org.jetbrains.annotations.Nullable;

public interface ServerMultiBlockChangePacket extends SendablePacket {
    static ServerMultiBlockChangePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerMultiBlockChangePacket from(ImmutableVector3i chunkPosition, @Nullable Boolean trustEdges, EncodedBlock[] blockData) {
        return null; // TODO (Packet Rewrite)
    }

    EncodedBlock[] getBlocks();

    interface EncodedBlock {

        static EncodedBlock from(int blockID, int x, int y, int z) {
            return null; // TODO (Packet Rewrite)
        }

        int getX();

        int getY();

        int getZ();

        int getBlockId();
    }
}
