package ac.grim.grimac.api.packet.protocol.potion;

/**
 * Defines standard vanilla potion effect types.
 * <p>
 * This class provides static final fields for common potion effects. The actual
 * {@link PotionType} instances are intended to be fetched by an underlying,
 * platform-specific implementation via their string identifiers.
 * <p>
 * For items representing brewable potions (e.g., "Potion of Swiftness"),
 * a {@link ac.grim.grimac.api.packet.item.PacketItemType} or {@link ac.grim.grimac.api.packet.item.PacketItemStack} would be used
 */
public final class PotionTypes {

    private PotionTypes() {

    }

    /**
     * Method to retrieve a PotionType instance by its key.
     * The actual implementation of this fetching logic is platform-dependent
     * and should be provided by the consumers of this API.
     *
     * @param key The unique string identifier for the potion type (e.g., "speed").
     * @return The {@link PotionType} instance, or null if not found/implemented.
     */
    private static PotionType getPotionTypeByKey(String key) {
        // TODO: User will implement the fetching logic here.
        // This method would typically look up the potion type in a
        // platform-specific registry or mapping.
        return null;
    }

    /**
     * Increases entity movement speed.
     * <br>Identifier: {@code minecraft:speed}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType SPEED = getPotionTypeByKey("speed");
    /**
     * Decreases entity movement speed.
     * <br>Identifier: {@code minecraft:slowness}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType SLOWNESS = getPotionTypeByKey("slowness");
    /**
     * Increases entity mining and attack speed.
     * <br>Identifier: {@code minecraft:haste}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType HASTE = getPotionTypeByKey("haste");
    /**
     * Decreases entity mining and attack speed.
     * <br>Identifier: {@code minecraft:mining_fatigue}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType MINING_FATIGUE = getPotionTypeByKey("mining_fatigue");
    /**
     * Increases entity melee attack damage.
     * <br>Identifier: {@code minecraft:strength}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType STRENGTH = getPotionTypeByKey("strength");
    /**
     * Instantly heals the target entity.
     * <br>Identifier: {@code minecraft:instant_health}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType INSTANT_HEALTH = getPotionTypeByKey("instant_health");
    /**
     * Instantly damages the target entity.
     * <br>Identifier: {@code minecraft:instant_damage}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType INSTANT_DAMAGE = getPotionTypeByKey("instant_damage");
    /**
     * Increases entity jump height and slightly reduces fall damage.
     * <br>Identifier: {@code minecraft:jump_boost}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType JUMP_BOOST = getPotionTypeByKey("jump_boost");
    /**
     * Distorts the entity's vision with a wobbly screen effect (often referred to as Confusion).
     * <br>Identifier: {@code minecraft:nausea}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType NAUSEA = getPotionTypeByKey("nausea");
    /**
     * Restores entity health gradually over time.
     * <br>Identifier: {@code minecraft:regeneration}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType REGENERATION = getPotionTypeByKey("regeneration");
    /**
     * Reduces incoming damage from most sources.
     * <br>Identifier: {@code minecraft:resistance}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType RESISTANCE = getPotionTypeByKey("resistance");
    /**
     * Grants immunity to damage from fire, lava, and magma blocks.
     * <br>Identifier: {@code minecraft:fire_resistance}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType FIRE_RESISTANCE = getPotionTypeByKey("fire_resistance");
    /**
     * Allows the entity to breathe underwater without drowning.
     * <br>Identifier: {@code minecraft:water_breathing}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType WATER_BREATHING = getPotionTypeByKey("water_breathing");
    /**
     * Renders the entity invisible to other players and most mobs.
     * <br>Identifier: {@code minecraft:invisibility}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType INVISIBILITY = getPotionTypeByKey("invisibility");
    /**
     * Severely impairs vision by overlaying a black fog effect, making it difficult to see.
     * <br>Identifier: {@code minecraft:blindness}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType BLINDNESS = getPotionTypeByKey("blindness");
    /**
     * Allows the entity to see clearly in dark areas as if it were brightly lit.
     * <br>Identifier: {@code minecraft:night_vision}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType NIGHT_VISION = getPotionTypeByKey("night_vision");
    /**
     * Increases the rate at which the entity's hunger bar depletes.
     * <br>Identifier: {@code minecraft:hunger}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType HUNGER = getPotionTypeByKey("hunger");
    /**
     * Decreases entity melee attack damage.
     * <br>Identifier: {@code minecraft:weakness}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType WEAKNESS = getPotionTypeByKey("weakness");
    /**
     * Deals damage over time, typically not lethal on its own (can leave target at 1 health point).
     * <br>Identifier: {@code minecraft:poison}
     * <br>Added in Beta 1.8.
     */
    public static final PotionType POISON = getPotionTypeByKey("poison");

    /**
     * Deals damage over time, can be lethal, and turns the health bar black. Associated with Wither Skeletons and the Wither boss.
     * <br>Identifier: {@code minecraft:wither}
     * <br>Added in 1.4.2 (The Pretty Scary Update).
     */
    public static final PotionType WITHER = getPotionTypeByKey("wither");

    /**
     * Increases the entity's maximum health by adding temporary extra hearts.
     * <br>Identifier: {@code minecraft:health_boost}
     * <br>Added in 1.6.1 (Horse Update).
     */
    public static final PotionType HEALTH_BOOST = getPotionTypeByKey("health_boost");
    /**
     * Adds temporary "golden" hearts that absorb incoming damage before normal health is affected.
     * <br>Identifier: {@code minecraft:absorption}
     * <br>Added in 1.6.1 (Horse Update).
     */
    public static final PotionType ABSORPTION = getPotionTypeByKey("absorption");
    /**
     * Rapidly replenishes hunger and saturation levels, effectively preventing hunger loss.
     * <br>Identifier: {@code minecraft:saturation}
     * <br>Added in 1.6.1 (Horse Update).
     */
    public static final PotionType SATURATION = getPotionTypeByKey("saturation");

    /**
     * Makes the entity's outline visible to players, even through solid blocks.
     * <br>Identifier: {@code minecraft:glowing}
     * <br>Added in 1.9 (Combat Update).
     */
    public static final PotionType GLOWING = getPotionTypeByKey("glowing");
    /**
     * Causes the entity to float upwards, counteracting gravity.
     * <br>Identifier: {@code minecraft:levitation}
     * <br>Added in 1.9 (Combat Update).
     */
    public static final PotionType LEVITATION = getPotionTypeByKey("levitation");
    /**
     * Increases the chance of obtaining better quality loot from certain sources (e.g., fishing, mob drops with Looting).
     * <br>Identifier: {@code minecraft:luck}
     * <br>Added in 1.9 (Combat Update).
     */
    public static final PotionType LUCK = getPotionTypeByKey("luck");
    /**
     * Decreases the chance of obtaining better quality loot from certain sources.
     * <br>Identifier: {@code minecraft:unluck}
     * <br>Added in 1.9 (Combat Update).
     */
    public static final PotionType UNLUCK = getPotionTypeByKey("unluck");

    /**
     * Causes the entity to fall slowly, negating or reducing fall damage.
     * <br>Identifier: {@code minecraft:slow_falling}
     * <br>Added in 1.13 (Update Aquatic).
     */
    public static final PotionType SLOW_FALLING = getPotionTypeByKey("slow_falling");
    /**
     * Grants underwater night vision, haste, and water breathing when the entity is near an active conduit structure.
     * <br>Identifier: {@code minecraft:conduit_power}
     * <br>Added in 1.13 (Update Aquatic).
     */
    public static final PotionType CONDUIT_POWER = getPotionTypeByKey("conduit_power");
    /**
     * Grants increased swimming speed when the entity is near a dolphin.
     * <br>Identifier: {@code minecraft:dolphins_grace}
     * <br>Added in 1.13 (Update Aquatic).
     */
    public static final PotionType DOLPHINS_GRACE = getPotionTypeByKey("dolphins_grace");

    /**
     * An omen effect. Prior to Minecraft 1.20.5, it triggered a raid upon entering a village.
     * Its primary function changed in 1.20.5, with more specific omen variants like
     * {@code RAID_OMEN} and {@code TRIAL_OMEN} introduced for distinct behaviors.
     * <br>Identifier: {@code minecraft:bad_omen}
     * <br>Added in 1.14 (Village & Pillage).
     */
    public static final PotionType BAD_OMEN = getPotionTypeByKey("bad_omen");
    /**
     * Grants discounted trades with villagers and causes them to gift items to the player
     * after successfully defending a village from a raid.
     * <br>Identifier: {@code minecraft:hero_of_the_village}
     * <br>Added in 1.14 (Village & Pillage).
     */
    public static final PotionType HERO_OF_THE_VILLAGE = getPotionTypeByKey("hero_of_the_village");

    /**
     * Periodically dims the player's vision, creating a pulsing darkness effect.
     * Notably associated with the Warden mob.
     * <br>Identifier: {@code minecraft:darkness}
     * <br>Added in 1.19 (The Wild Update).
     */
    public static final PotionType DARKNESS = getPotionTypeByKey("darkness");

    /**
     * An omen variant that transforms regular Trial Spawners into Ominous Trial Spawners
     * when an afflicted player is nearby, leading to more challenging encounters.
     * <br>Identifier: {@code minecraft:trial_omen}
     * <br>Added in 1.20.5.
     */
    public static final PotionType TRIAL_OMEN = getPotionTypeByKey("trial_omen");
    /**
     * An omen variant that triggers a raid when an afflicted player enters a village.
     * This effect takes over the raid-triggering functionality previously associated with Bad Omen.
     * <br>Identifier: {@code minecraft:raid_omen}
     * <br>Added in 1.20.5.
     */
    public static final PotionType RAID_OMEN = getPotionTypeByKey("raid_omen");
    /**
     * Causes affected entities to emit a burst of wind upon death, knocking back nearby entities.
     * Associated with Ominous Trial Spawners spawning entities with this effect.
     * <br>Identifier: {@code minecraft:wind_charged}
     * <br>Added in 1.20.5.
     */
    public static final PotionType WIND_CHARGED = getPotionTypeByKey("wind_charged");
    /**
     * Causes affected entities to spread cobwebs in a small area upon death.
     * Associated with Ominous Trial Spawners spawning entities with this effect.
     * <br>Identifier: {@code minecraft:weaving}
     * <br>Added in 1.20.5.
     */
    public static final PotionType WEAVING = getPotionTypeByKey("weaving");
    /**
     * Causes affected entities to spawn two Slimes upon death.
     * Associated with Ominous Trial Spawners spawning entities with this effect.
     * <br>Identifier: {@code minecraft:oozing}
     * <br>Added in 1.20.5.
     */
    public static final PotionType OOZING = getPotionTypeByKey("oozing");
    /**
     * Causes affected entities to have a chance to spawn Silverfish when damaged.
     * Associated with Ominous Trial Spawners spawning entities with this effect.
     * <br>Identifier: {@code minecraft:infested}
     * <br>Added in 1.20.5.
     */
    public static final PotionType INFESTED = getPotionTypeByKey("infested");
}