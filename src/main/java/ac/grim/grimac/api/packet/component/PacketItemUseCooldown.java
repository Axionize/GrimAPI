package ac.grim.grimac.api.packet.component;

import ac.grim.grimac.api.packet.ResourceLocationI;

import java.util.Optional;

public interface PacketItemUseCooldown {
    Optional<ResourceLocationI> getCooldownGroup();
}
