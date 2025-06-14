package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.protocol.potion.PotionType;
import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityEffectPacket extends SendablePacket {
    static ServerEntityEffectPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    int getEffectAmplifier();

    PotionType getPotionType();
}
