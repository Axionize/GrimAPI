package ac.grim.grimac.api.platform.sender;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Factory class to make a thread-safe sender instance
 *
 * @param <T> the command sender type
 */
@ApiStatus.Experimental
public interface SenderFactory<T> {
    UUID getUniqueId(T sender);

    String getName(T sender);

    void sendMessage(T sender, String message);

    void sendMessage(T sender, Component message);

    boolean hasPermission(T sender, String node);

    boolean hasPermission(T sender, String node, boolean defaultIfUnset);

    void performCommand(T sender, String command);

    boolean isConsole(T sender);

    boolean isPlayer(T sender);

    @NotNull Sender wrap(@NotNull T sender);

    @SuppressWarnings("unchecked")
    @NotNull T unwrap(@NotNull Sender sender);
}
