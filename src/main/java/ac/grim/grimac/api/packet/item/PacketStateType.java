package ac.grim.grimac.api.packet.item;

public interface PacketStateType {
    boolean isAir();
    float getHardness();

    PacketItemType getTypePlacingState();
}
