package ac.grim.grimac.api.packet.registry;

import ac.grim.grimac.api.packet.protocol.PacketConnectionState;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/**
 * Stores all PacketKey instances known at run-time.
 * Mods (or the platform bridge) call {@link #register} once for their packet.
 */
public final class PacketKeyRegistry {

    private final Map<String, PacketKey> byId        = new ConcurrentHashMap<>();
    private final Map<Object, PacketKey> byPlatform  = new ConcurrentHashMap<>();

    /**
     * Registers a key if it does not exist yet.
     * @param id               namespaced id  (e.g. "foo:play/c_bar")
     * @param state            vanilla connection state (0-4)
     * @param serverbound      true = client→server
     * @param platformHandle   enum constant, packet class, numeric id … may be null
     */
    public PacketKey register(String id,
                              PacketConnectionState state,
                              boolean serverbound,
                              Object platformHandle) {

        PacketKey key = byId.get(id);
        if (key != null) return key;

        key = new PacketKey(id, state, serverbound);
        byId.put(id, key);
        if (platformHandle != null) byPlatform.put(platformHandle, key);
        return key;
    }

    /** Platform bridge helper. */
    public PacketKey fromPlatform(Object platformHandle) {
        return byPlatform.get(platformHandle);
    }
}