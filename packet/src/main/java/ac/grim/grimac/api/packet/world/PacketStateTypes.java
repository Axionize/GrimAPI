package ac.grim.grimac.api.packet.world;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.item.PacketStateType;
import ac.grim.grimac.api.packet.manager.PacketStateTypeManager;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public class PacketStateTypes {
    private static final PacketStateTypeManager TYPE = MCPacket.getAPI().getStateTypeManager();

    public static final PacketStateType SLIME_BLOCK     = TYPE.getStateTypeByString("SLIME_BLOCK");
    public static final PacketStateType HONEY_BLOCK     = TYPE.getStateTypeByString("HONEY_BLOCK");
    public static final PacketStateType BUBBLE_COLUMN   = TYPE.getStateTypeByString("BUBBLE_COLUMN");
    public static final PacketStateType SCAFFOLDING     = TYPE.getStateTypeByString("SCAFFOLDING");
    public static final PacketStateType CHEST           = TYPE.getStateTypeByString("CHEST");
    public static final PacketStateType TRAPPED_CHEST   = TYPE.getStateTypeByString("TRAPPED_CHEST");

    // Additional PacketStateType fields (from CollisionData, ConsumesBlockPlace, etc.)
    public static final PacketStateType ACTIVATOR_RAIL                = TYPE.getStateTypeByString("ACTIVATOR_RAIL");
    public static final PacketStateType AIR                           = TYPE.getStateTypeByString("AIR");
    public static final PacketStateType AMETHYST_CLUSTER              = TYPE.getStateTypeByString("AMETHYST_CLUSTER");
    public static final PacketStateType ATTACHED_MELON_STEM           = TYPE.getStateTypeByString("ATTACHED_MELON_STEM");
    public static final PacketStateType ATTACHED_PUMPKIN_STEM         = TYPE.getStateTypeByString("ATTACHED_PUMPKIN_STEM");
    public static final PacketStateType AZALEA                        = TYPE.getStateTypeByString("AZALEA");
    public static final PacketStateType BAMBOO                        = TYPE.getStateTypeByString("BAMBOO");
    public static final PacketStateType BAMBOO_SAPLING                = TYPE.getStateTypeByString("BAMBOO_SAPLING");
    public static final PacketStateType BEETROOTS                     = TYPE.getStateTypeByString("BEETROOTS");
    public static final PacketStateType BELL                          = TYPE.getStateTypeByString("BELL");
    public static final PacketStateType BIG_DRIPLEAF                  = TYPE.getStateTypeByString("BIG_DRIPLEAF");
    public static final PacketStateType BREWING_STAND                 = TYPE.getStateTypeByString("BREWING_STAND");
    public static final PacketStateType CACTUS                        = TYPE.getStateTypeByString("CACTUS");
    public static final PacketStateType CAKE                          = TYPE.getStateTypeByString("CAKE");
    public static final PacketStateType CALIBRATED_SCULK_SENSOR       = TYPE.getStateTypeByString("CALIBRATED_SCULK_SENSOR");
    public static final PacketStateType CAMPFIRE                      = TYPE.getStateTypeByString("CAMPFIRE");
    public static final PacketStateType CANDLE_CAKE                   = TYPE.getStateTypeByString("CANDLE_CAKE");
    public static final PacketStateType CARROTS                       = TYPE.getStateTypeByString("CARROTS");
    public static final PacketStateType CAVE_AIR                      = TYPE.getStateTypeByString("CAVE_AIR");
    public static final PacketStateType CAVE_VINES                    = TYPE.getStateTypeByString("CAVE_VINES");
    public static final PacketStateType CAVE_VINES_PLANT              = TYPE.getStateTypeByString("CAVE_VINES_PLANT");
    public static final PacketStateType CHAIN                         = TYPE.getStateTypeByString("CHAIN");
    public static final PacketStateType CHAIN_COMMAND_BLOCK           = TYPE.getStateTypeByString("CHAIN_COMMAND_BLOCK");
    public static final PacketStateType CHORUS_PLANT                  = TYPE.getStateTypeByString("CHORUS_PLANT");
    public static final PacketStateType COCOA                         = TYPE.getStateTypeByString("COCOA");
    public static final PacketStateType COMMAND_BLOCK                 = TYPE.getStateTypeByString("COMMAND_BLOCK");
    public static final PacketStateType COMPARATOR                    = TYPE.getStateTypeByString("COMPARATOR");
    public static final PacketStateType COMPOSTER                     = TYPE.getStateTypeByString("COMPOSTER");
    public static final PacketStateType CONDUIT                       = TYPE.getStateTypeByString("CONDUIT");
    public static final PacketStateType CREEPER_HEAD                  = TYPE.getStateTypeByString("CREEPER_HEAD");
    public static final PacketStateType CREEPER_WALL_HEAD             = TYPE.getStateTypeByString("CREEPER_WALL_HEAD");
    public static final PacketStateType CRIMSON_ROOTS                 = TYPE.getStateTypeByString("CRIMSON_ROOTS");
    public static final PacketStateType DAYLIGHT_DETECTOR             = TYPE.getStateTypeByString("DAYLIGHT_DETECTOR");
    public static final PacketStateType DEAD_BRAIN_CORAL              = TYPE.getStateTypeByString("DEAD_BRAIN_CORAL");
    public static final PacketStateType DEAD_BUBBLE_CORAL             = TYPE.getStateTypeByString("DEAD_BUBBLE_CORAL");
    public static final PacketStateType DEAD_BUSH                     = TYPE.getStateTypeByString("DEAD_BUSH");
    public static final PacketStateType DEAD_FIRE_CORAL               = TYPE.getStateTypeByString("DEAD_FIRE_CORAL");
    public static final PacketStateType DEAD_HORN_CORAL               = TYPE.getStateTypeByString("DEAD_HORN_CORAL");
    public static final PacketStateType DEAD_TUBE_CORAL               = TYPE.getStateTypeByString("DEAD_TUBE_CORAL");
    public static final PacketStateType DECORATED_POT                 = TYPE.getStateTypeByString("DECORATED_POT");
    public static final PacketStateType DETECTOR_RAIL                 = TYPE.getStateTypeByString("DETECTOR_RAIL");
    public static final PacketStateType DIRT_PATH                     = TYPE.getStateTypeByString("DIRT_PATH");
    public static final PacketStateType DRAGON_EGG                    = TYPE.getStateTypeByString("DRAGON_EGG");
    public static final PacketStateType DRAGON_HEAD                   = TYPE.getStateTypeByString("DRAGON_HEAD");
    public static final PacketStateType DRAGON_WALL_HEAD              = TYPE.getStateTypeByString("DRAGON_WALL_HEAD");
    public static final PacketStateType ENCHANTING_TABLE              = TYPE.getStateTypeByString("ENCHANTING_TABLE");
    public static final PacketStateType ENDER_CHEST                   = TYPE.getStateTypeByString("ENDER_CHEST");
    public static final PacketStateType END_PORTAL                    = TYPE.getStateTypeByString("END_PORTAL");
    public static final PacketStateType END_PORTAL_FRAME              = TYPE.getStateTypeByString("END_PORTAL_FRAME");
    public static final PacketStateType END_ROD                       = TYPE.getStateTypeByString("END_ROD");
    public static final PacketStateType FARMLAND                      = TYPE.getStateTypeByString("FARMLAND");
    public static final PacketStateType FERN                          = TYPE.getStateTypeByString("FERN");
    public static final PacketStateType FIRE                          = TYPE.getStateTypeByString("FIRE");
    public static final PacketStateType FLOWERING_AZALEA              = TYPE.getStateTypeByString("FLOWERING_AZALEA");
    public static final PacketStateType GRINDSTONE                    = TYPE.getStateTypeByString("GRINDSTONE");
    public static final PacketStateType HANGING_ROOTS                 = TYPE.getStateTypeByString("HANGING_ROOTS");
    public static final PacketStateType HEAVY_CORE                    = TYPE.getStateTypeByString("HEAVY_CORE");
    public static final PacketStateType HEAVY_WEIGHTED_PRESSURE_PLATE = TYPE.getStateTypeByString("HEAVY_WEIGHTED_PRESSURE_PLATE");
    public static final PacketStateType HOPPER                        = TYPE.getStateTypeByString("HOPPER");
    public static final PacketStateType JIGSAW                        = TYPE.getStateTypeByString("JIGSAW");
    public static final PacketStateType JUKEBOX                       = TYPE.getStateTypeByString("JUKEBOX");
    public static final PacketStateType KELP                          = TYPE.getStateTypeByString("KELP");
    public static final PacketStateType LADDER                        = TYPE.getStateTypeByString("LADDER");
    public static final PacketStateType LANTERN                       = TYPE.getStateTypeByString("lantern");
    public static final PacketStateType LARGE_AMETHYST_BUD            = TYPE.getStateTypeByString("LARGE_AMETHYST_BUD");
    public static final PacketStateType LARGE_FERN                    = TYPE.getStateTypeByString("LARGE_FERN");
    public static final PacketStateType LAVA                          = TYPE.getStateTypeByString("LAVA");
    public static final PacketStateType LECTERN                       = TYPE.getStateTypeByString("LECTERN");
    public static final PacketStateType LEVER                         = TYPE.getStateTypeByString("LEVER");
    public static final PacketStateType LIGHT                         = TYPE.getStateTypeByString("LIGHT");
    public static final PacketStateType LIGHTNING_ROD                 = TYPE.getStateTypeByString("LIGHTNING_ROD");
    public static final PacketStateType LIGHT_WEIGHTED_PRESSURE_PLATE = TYPE.getStateTypeByString("LIGHT_WEIGHTED_PRESSURE_PLATE");
    public static final PacketStateType LILY_PAD                      = TYPE.getStateTypeByString("LILY_PAD");
    public static final PacketStateType MANGROVE_PROPAGULE            = TYPE.getStateTypeByString("MANGROVE_PROPAGULE");
    public static final PacketStateType MEDIUM_AMETHYST_BUD           = TYPE.getStateTypeByString("MEDIUM_AMETHYST_BUD");
    public static final PacketStateType MELON_STEM                    = TYPE.getStateTypeByString("MELON_STEM");
    public static final PacketStateType MOSS_CARPET                   = TYPE.getStateTypeByString("MOSS_CARPET");
    public static final PacketStateType MOVING_PISTON                 = TYPE.getStateTypeByString("MOVING_PISTON");
    public static final PacketStateType MUD                           = TYPE.getStateTypeByString("MUD");
    public static final PacketStateType NETHER_PORTAL                 = TYPE.getStateTypeByString("NETHER_PORTAL");
    public static final PacketStateType NETHER_SPROUTS                = TYPE.getStateTypeByString("NETHER_SPROUTS");
    public static final PacketStateType NETHER_WART                   = TYPE.getStateTypeByString("NETHER_WART");
    public static final PacketStateType PALE_MOSS_CARPET              = TYPE.getStateTypeByString("PALE_MOSS_CARPET");
    public static final PacketStateType PIGLIN_HEAD                   = TYPE.getStateTypeByString("PIGLIN_HEAD");
    public static final PacketStateType PIGLIN_WALL_HEAD              = TYPE.getStateTypeByString("PIGLIN_WALL_HEAD");
    public static final PacketStateType PINK_PETALS                   = TYPE.getStateTypeByString("PINK_PETALS");
    public static final PacketStateType PISTON                        = TYPE.getStateTypeByString("PISTON");
    public static final PacketStateType PISTON_HEAD                   = TYPE.getStateTypeByString("PISTON_HEAD");
    public static final PacketStateType PITCHER_CROP                  = TYPE.getStateTypeByString("PITCHER_CROP");
    public static final PacketStateType PLAYER_HEAD                   = TYPE.getStateTypeByString("PLAYER_HEAD");
    public static final PacketStateType PLAYER_WALL_HEAD              = TYPE.getStateTypeByString("PLAYER_WALL_HEAD");
    public static final PacketStateType POINTED_DRIPSTONE             = TYPE.getStateTypeByString("POINTED_DRIPSTONE");
    public static final PacketStateType POTATOES                      = TYPE.getStateTypeByString("POTATOES");
    public static final PacketStateType POWDER_SNOW                   = TYPE.getStateTypeByString("POWDER_SNOW");
    public static final PacketStateType POWERED_RAIL                  = TYPE.getStateTypeByString("POWERED_RAIL");
    public static final PacketStateType PUMPKIN_STEM                  = TYPE.getStateTypeByString("PUMPKIN_STEM");
    public static final PacketStateType RAIL                          = TYPE.getStateTypeByString("RAIL");
    public static final PacketStateType REDSTONE_TORCH                = TYPE.getStateTypeByString("REDSTONE_TORCH");
    public static final PacketStateType REDSTONE_WALL_TORCH           = TYPE.getStateTypeByString("REDSTONE_WALL_TORCH");
    public static final PacketStateType REPEATER                      = TYPE.getStateTypeByString("REPEATER");
    public static final PacketStateType REPEATING_COMMAND_BLOCK       = TYPE.getStateTypeByString("REPEATING_COMMAND_BLOCK");
    public static final PacketStateType RESPAWN_ANCHOR                = TYPE.getStateTypeByString("RESPAWN_ANCHOR");
    public static final PacketStateType SCULK_SENSOR                  = TYPE.getStateTypeByString("SCULK_SENSOR");
    public static final PacketStateType SCULK_SHRIEKER                = TYPE.getStateTypeByString("SCULK_SHRIEKER");
    public static final PacketStateType SEAGRASS                      = TYPE.getStateTypeByString("SEAGRASS");
    public static final PacketStateType SEA_PICKLE                    = TYPE.getStateTypeByString("SEA_PICKLE");
    public static final PacketStateType SHORT_GRASS                   = TYPE.getStateTypeByString("SHORT_GRASS");
    public static final PacketStateType SKELETON_SKULL                = TYPE.getStateTypeByString("SKELETON_SKULL");
    public static final PacketStateType SKELETON_WALL_SKULL           = TYPE.getStateTypeByString("SKELETON_WALL_SKULL");
    public static final PacketStateType SMALL_AMETHYST_BUD            = TYPE.getStateTypeByString("SMALL_AMETHYST_BUD");
    public static final PacketStateType SMALL_DRIPLEAF                = TYPE.getStateTypeByString("SMALL_DRIPLEAF");
    public static final PacketStateType SNIFFER_EGG                   = TYPE.getStateTypeByString("SNIFFER_EGG");
    public static final PacketStateType SNOW                          = TYPE.getStateTypeByString("SNOW");
    public static final PacketStateType SOUL_CAMPFIRE                 = TYPE.getStateTypeByString("SOUL_CAMPFIRE");
    public static final PacketStateType SOUL_LANTERN                  = TYPE.getStateTypeByString("SOUL_LANTERN");
    public static final PacketStateType SOUL_SAND                     = TYPE.getStateTypeByString("SOUL_SAND");
    public static final PacketStateType STICKY_PISTON                 = TYPE.getStateTypeByString("STICKY_PISTON");
    public static final PacketStateType STONE                         = TYPE.getStateTypeByString("STONE");
    public static final PacketStateType STONECUTTER                   = TYPE.getStateTypeByString("STONECUTTER");
    public static final PacketStateType STRUCTURE_BLOCK               = TYPE.getStateTypeByString("STRUCTURE_BLOCK");
    public static final PacketStateType STRUCTURE_VOID                = TYPE.getStateTypeByString("STRUCTURE_VOID");
    public static final PacketStateType SUGAR_CANE                    = TYPE.getStateTypeByString("SUGAR_CANE");
    public static final PacketStateType SWEET_BERRY_BUSH              = TYPE.getStateTypeByString("SWEET_BERRY_BUSH");
    public static final PacketStateType TALL_GRASS                    = TYPE.getStateTypeByString("TALL_GRASS");
    public static final PacketStateType TALL_SEAGRASS                 = TYPE.getStateTypeByString("TALL_SEAGRASS");
    public static final PacketStateType TNT                           = TYPE.getStateTypeByString("TNT");
    public static final PacketStateType TORCH                         = TYPE.getStateTypeByString("TORCH");
    public static final PacketStateType TORCHFLOWER_CROP              = TYPE.getStateTypeByString("TORCHFLOWER_CROP");
    public static final PacketStateType TRIPWIRE                      = TYPE.getStateTypeByString("TRIPWIRE");
    public static final PacketStateType TRIPWIRE_HOOK                 = TYPE.getStateTypeByString("TRIPWIRE_HOOK");
    public static final PacketStateType TURTLE_EGG                    = TYPE.getStateTypeByString("TURTLE_EGG");
    public static final PacketStateType TWISTING_VINES                = TYPE.getStateTypeByString("TWISTING_VINES");
    public static final PacketStateType TWISTING_VINES_PLANT          = TYPE.getStateTypeByString("TWISTING_VINES_PLANT");
    public static final PacketStateType VINE                          = TYPE.getStateTypeByString("VINE");
    public static final PacketStateType VOID_AIR                      = TYPE.getStateTypeByString("VOID_AIR");
    public static final PacketStateType WALL_TORCH                    = TYPE.getStateTypeByString("WALL_TORCH");
    public static final PacketStateType WARPED_ROOTS                  = TYPE.getStateTypeByString("WARPED_ROOTS");
    public static final PacketStateType WATER                         = TYPE.getStateTypeByString("WATER");
    public static final PacketStateType WEEPING_VINES                 = TYPE.getStateTypeByString("WEEPING_VINES");
    public static final PacketStateType WEEPING_VINES_PLANT           = TYPE.getStateTypeByString("WEEPING_VINES_PLANT");
    public static final PacketStateType WHEAT                         = TYPE.getStateTypeByString("WHEAT");
    public static final PacketStateType WITHER_SKELETON_SKULL         = TYPE.getStateTypeByString("WITHER_SKELETON_SKULL");
    public static final PacketStateType WITHER_SKELETON_WALL_SKULL    = TYPE.getStateTypeByString("WITHER_SKELETON_WALL_SKULL");
    public static final PacketStateType ZOMBIE_HEAD                   = TYPE.getStateTypeByString("ZOMBIE_HEAD");
    public static final PacketStateType ZOMBIE_WALL_HEAD              = TYPE.getStateTypeByString("ZOMBIE_WALL_HEAD");

    public static final PacketStateType KELP_PLANT = TYPE.getStateTypeByString("KELP_PLANT");

    // Copper door variants.
    public static final PacketStateType COPPER_DOOR                  = TYPE.getStateTypeByString("COPPER_DOOR");
    public static final PacketStateType EXPOSED_COPPER_DOOR          = TYPE.getStateTypeByString("EXPOSED_COPPER_DOOR");
    public static final PacketStateType WEATHERED_COPPER_DOOR        = TYPE.getStateTypeByString("WEATHERED_COPPER_DOOR");
    public static final PacketStateType OXIDIZED_COPPER_DOOR         = TYPE.getStateTypeByString("OXIDIZED_COPPER_DOOR");
    public static final PacketStateType WAXED_COPPER_DOOR            = TYPE.getStateTypeByString("WAXED_COPPER_DOOR");
    public static final PacketStateType WAXED_EXPOSED_COPPER_DOOR    = TYPE.getStateTypeByString("WAXED_EXPOSED_COPPER_DOOR");
    public static final PacketStateType WAXED_WEATHERED_COPPER_DOOR  = TYPE.getStateTypeByString("WAXED_WEATHERED_COPPER_DOOR");
    public static final PacketStateType WAXED_OXIDIZED_COPPER_DOOR   = TYPE.getStateTypeByString("WAXED_OXIDIZED_COPPER_DOOR");

    // Trapdoor types
    public static final PacketStateType IRON_TRAPDOOR                = TYPE.getStateTypeByString("IRON_TRAPDOOR");
    public static final PacketStateType COPPER_TRAPDOOR              = TYPE.getStateTypeByString("COPPER_TRAPDOOR");
    public static final PacketStateType EXPOSED_COPPER_TRAPDOOR      = TYPE.getStateTypeByString("EXPOSED_COPPER_TRAPDOOR");
    public static final PacketStateType WEATHERED_COPPER_TRAPDOOR    = TYPE.getStateTypeByString("WEATHERED_COPPER_TRAPDOOR");
    public static final PacketStateType OXIDIZED_COPPER_TRAPDOOR     = TYPE.getStateTypeByString("OXIDIZED_COPPER_TRAPDOOR");
    public static final PacketStateType WAXED_COPPER_TRAPDOOR        = TYPE.getStateTypeByString("WAXED_COPPER_TRAPDOOR");
    public static final PacketStateType WAXED_EXPOSED_COPPER_TRAPDOOR= TYPE.getStateTypeByString("WAXED_EXPOSED_COPPER_TRAPDOOR");
    public static final PacketStateType WAXED_WEATHERED_COPPER_TRAPDOOR = TYPE.getStateTypeByString("WAXED_WEATHERED_COPPER_TRAPDOOR");
    public static final PacketStateType WAXED_OXIDIZED_COPPER_TRAPDOOR  = TYPE.getStateTypeByString("WAXED_OXIDIZED_COPPER_TRAPDOOR");

    // Client-side interactable blocks.
    public static final PacketStateType BARREL              = TYPE.getStateTypeByString("BARREL");
    public static final PacketStateType BEACON              = TYPE.getStateTypeByString("BEACON");
    public static final PacketStateType CARTOGRAPHY_TABLE   = TYPE.getStateTypeByString("CARTOGRAPHY_TABLE");
    public static final PacketStateType CRAFTING_TABLE      = TYPE.getStateTypeByString("CRAFTING_TABLE");
    public static final PacketStateType DISPENSER           = TYPE.getStateTypeByString("DISPENSER");
    public static final PacketStateType LOOM                = TYPE.getStateTypeByString("LOOM");
    public static final PacketStateType NOTE_BLOCK          = TYPE.getStateTypeByString("NOTE_BLOCK");
    public static final PacketStateType SMITHING_TABLE      = TYPE.getStateTypeByString("SMITHING_TABLE");
    public static final PacketStateType FURNACE             = TYPE.getStateTypeByString("FURNACE");
    public static final PacketStateType BLAST_FURNACE       = TYPE.getStateTypeByString("BLAST_FURNACE");

    public static final PacketStateType COBWEB = TYPE.getStateTypeByString("COBWEB");
    public static final PacketStateType GLOW_LICHEN = TYPE.getStateTypeByString("GLOW_LICHEN");
    public static final PacketStateType REDSTONE_WIRE = TYPE.getStateTypeByString("REDSTONE_WIRE");

    public static final PacketStateType IRON_DOOR = TYPE.getStateTypeByString("IRON_DOOR");
    public static final PacketStateType ICE = TYPE.getStateTypeByString("ICE");
    public static final PacketStateType FROSTED_ICE = TYPE.getStateTypeByString("FROSTED_ICE");

    public static final PacketStateType DIRT = TYPE.getStateTypeByString("DIRT");
    public static final PacketStateType GRASS_BLOCK = TYPE.getStateTypeByString("GRASS_BLOCK");
    public static final PacketStateType PODZOL = TYPE.getStateTypeByString("PODZOL");
    public static final PacketStateType COARSE_DIRT = TYPE.getStateTypeByString("COARSE_DIRT");
    public static final PacketStateType MYCELIUM = TYPE.getStateTypeByString("MYCELIUM");
    public static final PacketStateType ROOTED_DIRT = TYPE.getStateTypeByString("ROOTED_DIRT");
    public static final PacketStateType MOSS_BLOCK = TYPE.getStateTypeByString("MOSS_BLOCK");
    public static final PacketStateType REDSTONE_BLOCK = TYPE.getStateTypeByString("REDSTONE_BLOCK");
    public static final PacketStateType OBSERVER = TYPE.getStateTypeByString("OBSERVER");

    public static final PacketStateType GLOWSTONE = TYPE.getStateTypeByString("GLOWSTONE");
    public static final PacketStateType SEA_LANTERN = TYPE.getStateTypeByString("SEA_LANTERN");
    public static final PacketStateType BARRIER = TYPE.getStateTypeByString("BARRIER");
    public static final PacketStateType FIRE_CORAL_WALL_FAN = TYPE.getStateTypeByString("FIRE_CORAL_WALL_FAN");
    public static final PacketStateType MAGMA_BLOCK = TYPE.getStateTypeByString("MAGMA_BLOCK");
    public static final PacketStateType CLAY = TYPE.getStateTypeByString("CLAY");
    public static final PacketStateType SAND = TYPE.getStateTypeByString("SAND");
    public static final PacketStateType RED_SAND = TYPE.getStateTypeByString("RED_SAND");
    public static final PacketStateType CRIMSON_NYLIUM = TYPE.getStateTypeByString("CRIMSON_NYLIUM");
    public static final PacketStateType WARPED_NYLIUM = TYPE.getStateTypeByString("WARPED_NYLIUM");
    public static final PacketStateType SOUL_SOIL = TYPE.getStateTypeByString("SOUL_SOIL");
    public static final PacketStateType NETHERRACK = TYPE.getStateTypeByString("NETHERRACK");
    public static final PacketStateType OAK_WALL_SIGN = TYPE.getStateTypeByString("OAK_WALL_SIGN");
    public static final PacketStateType BIG_DRIPLEAF_STEM = TYPE.getStateTypeByString("BIG_DRIPLEAF_STEM");
    public static final PacketStateType JUNGLE_LOG = TYPE.getStateTypeByString("JUNGLE_LOG");
    public static final PacketStateType STRIPPED_JUNGLE_LOG = TYPE.getStateTypeByString("STRIPPED_JUNGLE_LOG");
    public static final PacketStateType JUNGLE_WOOD = TYPE.getStateTypeByString("JUNGLE_WOOD");
    public static final PacketStateType END_STONE = TYPE.getStateTypeByString("END_STONE");
    public static final PacketStateType BLACK_WALL_BANNER = TYPE.getStateTypeByString("BLACK_WALL_BANNER");

    // Banner blocks
    public static final PacketStateType WHITE_BANNER = TYPE.getStateTypeByString("WHITE_BANNER");
    public static final PacketStateType ORANGE_BANNER = TYPE.getStateTypeByString("ORANGE_BANNER");
    public static final PacketStateType MAGENTA_BANNER = TYPE.getStateTypeByString("MAGENTA_BANNER");
    public static final PacketStateType LIGHT_BLUE_BANNER = TYPE.getStateTypeByString("LIGHT_BLUE_BANNER");
    public static final PacketStateType YELLOW_BANNER = TYPE.getStateTypeByString("YELLOW_BANNER");
    public static final PacketStateType LIME_BANNER = TYPE.getStateTypeByString("LIME_BANNER");
    public static final PacketStateType PINK_BANNER = TYPE.getStateTypeByString("PINK_BANNER");
    public static final PacketStateType GRAY_BANNER = TYPE.getStateTypeByString("GRAY_BANNER");
    public static final PacketStateType LIGHT_GRAY_BANNER = TYPE.getStateTypeByString("LIGHT_GRAY_BANNER");
    public static final PacketStateType CYAN_BANNER = TYPE.getStateTypeByString("CYAN_BANNER");
    public static final PacketStateType PURPLE_BANNER = TYPE.getStateTypeByString("PURPLE_BANNER");
    public static final PacketStateType BLUE_BANNER = TYPE.getStateTypeByString("BLUE_BANNER");
    public static final PacketStateType BROWN_BANNER = TYPE.getStateTypeByString("BROWN_BANNER");
    public static final PacketStateType GREEN_BANNER = TYPE.getStateTypeByString("GREEN_BANNER");
    public static final PacketStateType RED_BANNER = TYPE.getStateTypeByString("RED_BANNER");
    public static final PacketStateType BLACK_BANNER = TYPE.getStateTypeByString("BLACK_BANNER");

    // Wall banners
    public static final PacketStateType WHITE_WALL_BANNER = TYPE.getStateTypeByString("WHITE_WALL_BANNER");
    public static final PacketStateType ORANGE_WALL_BANNER = TYPE.getStateTypeByString("ORANGE_WALL_BANNER");
    public static final PacketStateType MAGENTA_WALL_BANNER = TYPE.getStateTypeByString("MAGENTA_WALL_BANNER");
    public static final PacketStateType LIGHT_BLUE_WALL_BANNER = TYPE.getStateTypeByString("LIGHT_BLUE_WALL_BANNER");
    public static final PacketStateType YELLOW_WALL_BANNER = TYPE.getStateTypeByString("YELLOW_WALL_BANNER");
    public static final PacketStateType LIME_WALL_BANNER = TYPE.getStateTypeByString("LIME_WALL_BANNER");
    public static final PacketStateType PINK_WALL_BANNER = TYPE.getStateTypeByString("PINK_WALL_BANNER");
    public static final PacketStateType GRAY_WALL_BANNER = TYPE.getStateTypeByString("GRAY_WALL_BANNER");
    public static final PacketStateType LIGHT_GRAY_WALL_BANNER = TYPE.getStateTypeByString("LIGHT_GRAY_WALL_BANNER");
    public static final PacketStateType CYAN_WALL_BANNER = TYPE.getStateTypeByString("CYAN_WALL_BANNER");
    public static final PacketStateType PURPLE_WALL_BANNER = TYPE.getStateTypeByString("PURPLE_WALL_BANNER");
    public static final PacketStateType BLUE_WALL_BANNER = TYPE.getStateTypeByString("BLUE_WALL_BANNER");
    public static final PacketStateType BROWN_WALL_BANNER = TYPE.getStateTypeByString("BROWN_WALL_BANNER");
    public static final PacketStateType GREEN_WALL_BANNER = TYPE.getStateTypeByString("GREEN_WALL_BANNER");
    public static final PacketStateType RED_WALL_BANNER = TYPE.getStateTypeByString("RED_WALL_BANNER");

    // Additional block states referenced in HitboxData
    public static final PacketStateType SCULK_VEIN = TYPE.getStateTypeByString("SCULK_VEIN");
    public static final PacketStateType RESIN_CLUMP = TYPE.getStateTypeByString("RESIN_CLUMP");
    public static final PacketStateType SPORE_BLOSSOM = TYPE.getStateTypeByString("SPORE_BLOSSOM");
    public static final PacketStateType PALE_HANGING_MOSS = TYPE.getStateTypeByString("PALE_HANGING_MOSS");
    public static final PacketStateType FROGSPAWN = TYPE.getStateTypeByString("FROGSPAWN");
    public static final PacketStateType BUSH = TYPE.getStateTypeByString("BUSH");
    public static final PacketStateType SHORT_DRY_GRASS = TYPE.getStateTypeByString("SHORT_DRY_GRASS");
    public static final PacketStateType TALL_DRY_GRASS = TYPE.getStateTypeByString("TALL_DRY_GRASS");
    public static final PacketStateType LEAF_LITTER = TYPE.getStateTypeByString("LEAF_LITTER");

    // Missing block states for various mechanics:
    public static final PacketStateType TARGET = TYPE.getStateTypeByString("TARGET");
    public static final PacketStateType PACKED_ICE = TYPE.getStateTypeByString("PACKED_ICE");
    public static final PacketStateType BLUE_ICE = TYPE.getStateTypeByString("BLUE_ICE");
    public static final PacketStateType CARVED_PUMPKIN = TYPE.getStateTypeByString("CARVED_PUMPKIN");
    public static final PacketStateType JACK_O_LANTERN = TYPE.getStateTypeByString("JACK_O_LANTERN");
    public static final PacketStateType PUMPKIN = TYPE.getStateTypeByString("PUMPKIN");
    public static final PacketStateType MELON = TYPE.getStateTypeByString("MELON");
    public static final PacketStateType NETHER_BRICK_FENCE = TYPE.getStateTypeByString("NETHER_BRICK_FENCE");
    public static final PacketStateType CHORUS_FLOWER = TYPE.getStateTypeByString("CHORUS_FLOWER");
    public static final PacketStateType MANGROVE_LEAVES = TYPE.getStateTypeByString("MANGROVE_LEAVES");

    // Additional ones referenced in collision/placement:
    public static final PacketStateType WILDFLOWERS = TYPE.getStateTypeByString("WILDFLOWERS");
    public static final PacketStateType CACTUS_FLOWER = TYPE.getStateTypeByString("CACTUS_FLOWER");
    public static final PacketStateType IRON_BARS = TYPE.getStateTypeByString("iron_bars");

    public static PacketStateType getById(PacketClientVersion clientVersion, int id) {
        return TYPE.getByID(clientVersion, id);
    }
}