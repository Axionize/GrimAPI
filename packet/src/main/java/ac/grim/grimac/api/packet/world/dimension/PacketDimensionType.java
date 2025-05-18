package ac.grim.grimac.api.packet.world.dimension;

import ac.grim.grimac.api.packet.ResourceLocationI;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public interface PacketDimensionType {
    int getId(PacketClientVersion version);

    ResourceLocationI getName();

    int getMinY();

    int getHeight();

    boolean isUltraWarm();
}
