package ac.grim.grimac.api.packet.pe.version;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import ac.grim.grimac.api.packet.protocol.version.server.PacketServerVersion;
import ac.grim.grimac.api.packet.version.VersionManager;
import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;

public class PEPacketVersionManager implements VersionManager {
    @Override
    public PacketClientVersion getClientVersionById(int protocolVersion) {
        return ClientVersion.getById(protocolVersion);
    }

    @Override
    public PacketClientVersion getClientVersionByString(String versionName) {
        return ClientVersion.valueOf(versionName);
    }

    @Override
    public PacketServerVersion getServerVersionById(int protocolVersion) {
        return null;
//        return ServerVersion.getById(protocolVersion);
    }

    @Override
    public PacketServerVersion getServerVersionByString(String versionName) {
        return null;
//        return ServerVersion.valueOf(versionName);
    }
}
