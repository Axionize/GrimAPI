package ac.grim.grimac.api.packet.protocol.teleport;

public interface RelativeFlag {
    // TODO (Packet Rewrite)
    RelativeFlag X = null;
    RelativeFlag Y = null;
    RelativeFlag Z = null;
    RelativeFlag DELTA_X = null;
    RelativeFlag DELTA_Y = null;
    RelativeFlag DELTA_Z = null;

    static RelativeFlag from(int mask) {
        return null; // TODO (Packet Rewrite)
    }

    boolean has(RelativeFlag flag);

    boolean has(int flags);

    byte getMask();
}
