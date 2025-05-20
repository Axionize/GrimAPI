package ac.grim.grimac.api.packet.protocol.version.server;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public interface PacketServerVersion {
    boolean isNewerThanOrEquals(PacketServerVersion version);
    boolean isNewerThan(PacketServerVersion version);

    boolean isOlderThanOrEquals(PacketServerVersion version);
    boolean isOlderThan(PacketServerVersion version);

    String getReleaseName();

    PacketClientVersion toClientVersion();

    int getProtocolVersion();
}
