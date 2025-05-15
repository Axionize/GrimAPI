package ac.grim.grimac.api.packet.registry;

import ac.grim.grimac.api.packet.registry.ctx.DefaultContext;
import ac.grim.grimac.api.packet.registry.ctx.PacketContext;
import ac.grim.grimac.api.packet.registry.map.PacketTypeMapper;
import ac.grim.grimac.api.packet.registry.map.PacketWrapperFactory;
import ac.grim.grimac.api.packet.types.RecievablePacket;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Cross-platform dispatcher.  Thread-safe.
 *
 * RAW   = handler receives only PacketContext.          (Consumer<PacketContext>)
 * WRAP  = handler also receives an API wrapper instance (BiConsumer<PacketContext,T>).
 */
public final class PacketRegistry {

    /* 1. handler entry keeps registration order */
    private static final class Entry {
        final boolean raw;
        final Class<? extends RecievablePacket> apiClass;
        final BiConsumer<PacketContext, Object> invoke;
        Entry(boolean raw,
              Class<? extends RecievablePacket> apiClass,
              BiConsumer<PacketContext, Object> invoke) {
            this.raw     = raw;
            this.apiClass= apiClass;
            this.invoke  = invoke;
        }
    }

    /* 2. table : one ordered list per PacketKey */
    private final Map<PacketKey, List<Entry>> table = new ConcurrentHashMap<>();

    /* ------------  public registration API  ------------ */

    public void onRaw(PacketKey key, final Consumer<PacketContext> consumer) {
        table.computeIfAbsent(key, k -> new ArrayList<Entry>())
             .add(new Entry(true, null,
                 new BiConsumer<PacketContext, Object>() {
                     @Override public void accept(PacketContext ctx, Object __) {
                         consumer.accept(ctx);
                     }}));
    }
    public <T extends RecievablePacket> void onWrapped(
            PacketKey key,
            final Class<T> apiClass,
            final BiConsumer<PacketContext, T> consumer) {

        table.computeIfAbsent(key, k -> new ArrayList<Entry>())
             .add(new Entry(false, apiClass,
                 new BiConsumer<PacketContext, Object>() {
                     @SuppressWarnings("unchecked")
                     @Override public void accept(PacketContext ctx, Object w) {
                         consumer.accept(ctx, (T) w);
                     }}));
    }

    /* helpers for multiple keys */
    public void onRaw(Collection<PacketKey> keys, Consumer<PacketContext> c) {
        for (PacketKey k : keys) onRaw(k, c);
    }
    public <T extends RecievablePacket> void onWrapped(
            Collection<PacketKey> keys,
            Class<T> apiClass,
            BiConsumer<PacketContext,T> c) {
        for (PacketKey k : keys) onWrapped(k, apiClass, c);
    }

    /* ------------  dispatch, called by bridge  ---------- */

    public void dispatch(Object platformHandle,
                         Object event,
                         PacketTypeMapper mapper,
                         PacketWrapperFactory factory) {

        PacketKey key = mapper.map(platformHandle);
        if (key == null) return;                      // not recognised

        List<Entry> list = table.get(key);
        if (list == null) return;                     // nobody registered

        PacketContext ctx = new DefaultContext(key, event, factory);

        for (Entry e : list) {
            Object wrapper = e.raw ? null : ctx.wrapper(e.apiClass);
            e.invoke.accept(ctx, wrapper);
        }
    }
}