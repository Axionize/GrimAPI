package ac.grim.grimac.api.packet.player.enums;

public enum GameMode {
    SURVIVAL,
    CREATIVE,
    ADVENTURE,
    SPECTATOR;

    public int getId() {
        return ordinal();
    }
}