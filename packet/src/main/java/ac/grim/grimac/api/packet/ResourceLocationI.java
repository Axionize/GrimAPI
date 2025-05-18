package ac.grim.grimac.api.packet;

public interface ResourceLocationI {
    static ResourceLocationI minecraft(String climbable) {
        return null; // TODO (Packet Rewrite)
    }

    String getKey();
    String getNamespace();
}
