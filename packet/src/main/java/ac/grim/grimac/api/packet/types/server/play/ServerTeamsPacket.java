package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

import java.util.Collection;
import java.util.Optional;

public interface ServerTeamsPacket extends SendablePacket {
    static ServerTeamsPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    TeamMode getTeamMode();

    Optional<ScoreBoardTeamInfo> getTeamInfo();

    Collection<String> getPlayers();

    enum TeamMode {
        CREATE,
        REMOVE,
        UPDATE,
        ADD_ENTITIES,
        REMOVE_ENTITIES;
    }

    enum CollisionRule {
        ALWAYS(),
        NEVER(),
        PUSH_OTHER_TEAMS(),
        PUSH_OWN_TEAM();
    }

    interface ScoreBoardTeamInfo {

        CollisionRule getCollisionRule();
    }

    String getTeamName();
}
