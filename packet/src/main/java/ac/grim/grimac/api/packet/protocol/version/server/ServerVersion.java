package ac.grim.grimac.api.packet.protocol.version.server;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public interface ServerVersion {
    boolean isNewerThanOrEquals(ServerVersion version);
    boolean isNewerThan(ServerVersion version);

    boolean isOlderThanOrEquals(ServerVersion version);
    boolean isOlderThan(ServerVersion version);

    String getReleaseName();

    PacketClientVersion toClientVersion();

    int getProtocolVersion();
}
