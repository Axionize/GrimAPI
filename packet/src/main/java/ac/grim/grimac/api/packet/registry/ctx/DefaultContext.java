package ac.grim.grimac.api.packet.registry.ctx;

import ac.grim.grimac.api.packet.registry.PacketKey;
import ac.grim.grimac.api.packet.registry.map.PacketWrapperFactory;
import ac.grim.grimac.api.packet.types.RecievablePacket;

import java.util.HashMap;
import java.util.Map;

public final class DefaultContext implements PacketContext {

    private final PacketKey key;
    private final Object event;
    private final PacketWrapperFactory factory;
    private final Map<Class<?>, Object> cache = new HashMap<>();

    public DefaultContext(PacketKey key, Object event, PacketWrapperFactory factory) {
        this.key = key;
        this.event = event;
        this.factory = factory;
    }
    @Override public PacketKey key()  { return key; }

    @Override
    public Object raw() {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends RecievablePacket> T wrapper(Class<T> type) {
        Object w = cache.get(type);
        if (w == null) {
            w = factory.wrap(event, type);
            cache.put(type, w);
        }
        return (T) w;
    }
}