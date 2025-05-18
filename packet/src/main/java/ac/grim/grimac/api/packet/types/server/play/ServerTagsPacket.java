package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.ResourceLocationI;
import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import com.github.retrooper.packetevents.resources.ResourceLocation;

import java.util.List;
import java.util.Map;

public interface ServerTagsPacket extends SendablePacket {
    static ServerTagsPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    Map<ResourceLocationI, List<Tag>>  getTagMap();

    interface Tag {

        ResourceLocationI getKey();
    }
}
