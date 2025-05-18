package ac.grim.grimac.api.packet.world.chunk.palette;

/**
 * Represents a mapping between global block states and compact, palette-specific storage IDs.
 * Palettes are used within chunk sections to efficiently store block data. Instead of storing
 * the full global ID for each block, a chunk section can define a palette of block states
 * present within it, and then store smaller, palette-local IDs.
 */
public interface Palette {

    /**
     * Gets the number of distinct block states currently mapped by this palette.
     * This indicates how many unique block types the palette can currently resolve.
     *
     * @return The number of unique block states in the palette.
     */
    int size();

    /**
     * Converts a global block state (an integer representing a unique block type and its properties)
     * to a palette-specific storage ID.
     * <p>
     * If the given {@code state} is not already known to this palette, the palette
     * may attempt to add it. If the palette is full and cannot accommodate the new state,
     * or if the state is otherwise unmappable by this palette type, this method returns -1.
     * </p>
     *
     * @param state The global block state to convert.
     * @return The palette-specific storage ID for the given state, or -1 if the state
     *         cannot be mapped by this palette (e.g., palette is full).
     */
    int stateToId(int state);

    /**
     * Converts a palette-specific storage ID back to its corresponding global block state.
     * <p>
     * If the provided {@code id} is not valid for this palette (e.g., out of bounds or
     * not currently mapped to any state), a default block state (conventionally 0,
     * often representing 'air') is returned.
     * </p>
     *
     * @param id The palette-specific storage ID to convert.
     * @return The global block state corresponding to the ID, or a default state (e.g., 0)
     *         if the ID is invalid.
     */
    int idToState(int id);

    /**
     * Gets the number of bits required to represent any storage ID produced by this palette.
     * <p>
     * This value is crucial for serializing and deserializing block data within a chunk.
     * For example, if {@code getBits()} returns 4, it means this palette can hold up to
     * 2<sup>4</sup> = 16 distinct block states, and each storage ID will be a number
     * between 0 and 15, fitting within 4 bits.
     * </p>
     * <p>
     * A value of 0 typically indicates a special case, such as a {@code SingletonPalette}
     * where only one block state exists, and its ID is implicitly 0, requiring no bits
     * to store the ID itself within the packed block data array (as the palette type itself
     * implies the single state).
     * </p>
     *
     * @return The number of bits per storage ID for this palette.
     */
    int getBits();
}