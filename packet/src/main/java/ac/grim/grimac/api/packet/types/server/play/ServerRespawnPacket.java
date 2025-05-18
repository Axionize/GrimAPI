package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.player.enums.GameMode;
import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.world.dimension.PacketDimensionType;

public interface ServerRespawnPacket extends SendablePacket {
    static ServerRespawnPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    PacketDimensionType getDimensionType();

    GameMode getGameMode();

    byte getKeptData();
}
