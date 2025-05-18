package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerChangeGameStatePacket extends SendablePacket {
    Reason getReason();

    float getValue();

    enum Reason {
        NO_RESPAWN_BLOCK_AVAILABLE,
        END_RAINING,
        BEGIN_RAINING,
        CHANGE_GAME_MODE,
        WIN_GAME,
        DEMO_EVENT,
        ARROW_HIT_PLAYER,
        RAIN_LEVEL_CHANGE,
        THUNDER_LEVEL_CHANGE,
        PLAY_PUFFER_FISH_STING_SOUND,
        PLAY_ELDER_GUARDIAN_MOB_APPEARANCE,
        ENABLE_RESPAWN_SCREEN,
        LIMITED_CRAFTING,
        START_LOADING_CHUNKS;
    }

    static ServerChangeGameStatePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }
}
