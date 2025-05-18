package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerWindowConfirmation extends SendablePacket {
    static ServerWindowConfirmation from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    short getActionId();
}
