package ac.grim.grimac.api.packet.version;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import ac.grim.grimac.api.packet.protocol.version.server.PacketServerVersion;

public interface VersionManager {
    PacketClientVersion getClientVersionById(int protocolVersion);

    PacketClientVersion getClientVersionByString(String versionName);

    PacketServerVersion getServerVersionById(int protocolVersion);

    PacketServerVersion getServerVersionByString(String versionName);
}
