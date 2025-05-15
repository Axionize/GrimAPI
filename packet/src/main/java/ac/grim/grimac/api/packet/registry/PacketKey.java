package ac.grim.grimac.api.packet.registry;

import ac.grim.grimac.api.packet.protocol.PacketConnectionState;

import java.util.Objects;

/**
 * Runtime-extensible identifier for a packet.
 *
 * The class is immutable and JDK 8 friendly (no records).
 * Every platform benefits from all three fields:
 *  • id         – logging / debugging / mods (“examplemod:play/c_ray_gun”)
 *  • state      – vanilla connection state (handshake, status, login, play, …)
 *  • direction  – true = client→server (serverbound); false = server→client
 */
public final class PacketKey {

    private final String id;
    private final PacketConnectionState state;
    private final boolean serverbound;

    public PacketKey(String id, PacketConnectionState state, boolean serverbound) {
        this.id          = id;
        this.state       = state;
        this.serverbound = serverbound;
    }

    public String  id()          { return id;          }
    public PacketConnectionState    state()       { return state;       }
    public boolean serverbound() { return serverbound; }

    @Override public int hashCode() { return Objects.hash(id); }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PacketKey)) return false;
        PacketKey k = (PacketKey) o;
        return id.equals(k.id);
    }
    @Override public String toString() { return id; }
}