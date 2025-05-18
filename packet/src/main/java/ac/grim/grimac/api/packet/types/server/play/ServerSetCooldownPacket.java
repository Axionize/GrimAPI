package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.ResourceLocationI;
import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerSetCooldownPacket extends SendablePacket {
    static ServerSetCooldownPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getCooldownTicks();

    ResourceLocationI getCooldownGroup();
}
