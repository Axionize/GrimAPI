package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerUnloadChunkPacket {
    static ServerUnloadChunkPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getChunkX();

    int getChunkZ();
}
