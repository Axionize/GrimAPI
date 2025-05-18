package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerPlayerAbilitiesPacket extends SendablePacket {
    static ServerPlayerAbilitiesPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    boolean isFlightAllowed();

    boolean isFlying();
}
