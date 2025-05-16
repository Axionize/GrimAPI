package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.manager.PacketTypeFactory;

public final class PacketTypes {

    static PacketTypeFactory TYPE = MCPacket.getAPI().getPacketTypeManager();

    /* ------------------------------------------------------------- */
    /*                   PLAY  →  CLIENT  (C → S)                    */
    /* ------------------------------------------------------------- */
    public static final class Play {
        public static final class Client {
            public static final PacketType ADVANCEMENT_TAB              = PlayC2S("seen_advancements");
            public static final PacketType ANIMATION                    = PlayC2S("swing");
            public static final PacketType CHAT_MESSAGE                 = PlayC2S("chat");
            public static final PacketType CHAT_PREVIEW                 = PlayC2S("chat_preview");
            public static final PacketType CLICK_WINDOW                 = PlayC2S("container_click");
            public static final PacketType CLICK_WINDOW_BUTTON          = PlayC2S("container_button_click");
            public static final PacketType CLIENT_SETTINGS              = PlayC2S("client_settings");
            public static final PacketType CLIENT_STATUS                = PlayC2S("client_command");
            public static final PacketType CLOSE_WINDOW                 = PlayC2S("container_close");
            public static final PacketType CREATIVE_INVENTORY_ACTION    = PlayC2S("set_creative_mode_slot");
            public static final PacketType CRAFT_RECIPE_REQUEST         = PlayC2S("place_recipe");
            public static final PacketType EDIT_BOOK                    = PlayC2S("edit_book");
            public static final PacketType ENTITY_ACTION                = PlayC2S("player_action");
            public static final PacketType GENERATE_STRUCTURE           = PlayC2S("jigsaw_generate");
            public static final PacketType HELD_ITEM_CHANGE             = PlayC2S("set_carried_item");
            public static final PacketType INTERACT_ENTITY              = PlayC2S("interact");
            public static final PacketType KEEP_ALIVE                   = PlayC2S("client_keep_alive");
            public static final PacketType LOCK_DIFFICULTY              = PlayC2S("lock_difficulty");
            public static final PacketType NAME_ITEM                    = PlayC2S("rename_item");
            public static final PacketType PLAYER_ABILITIES             = PlayC2S("player_abilities");
            public static final PacketType PLAYER_BLOCK_PLACEMENT       = PlayC2S("use_item_on");
            public static final PacketType PLAYER_DIGGING               = PlayC2S("player_action");
            public static final PacketType PLAYER_FLYING                = PlayC2S("move_player_status_only");
            public static final PacketType PLAYER_POSITION              = PlayC2S("move_player_pos");
            public static final PacketType PLAYER_POSITION_AND_ROTATION = PlayC2S("move_player_pos_rot");
            public static final PacketType PLAYER_ROTATION              = PlayC2S("player_rotation");
            public static final PacketType PLUGIN_MESSAGE               = PlayC2S("plugin_message");
            public static final PacketType PONG                         = PlayC2S("pong");
            public static final PacketType QUERY_BLOCK_NBT              = PlayC2S("block_entity_tag_query");
            public static final PacketType QUERY_ENTITY_NBT             = PlayC2S("entity_tag_query");
            public static final PacketType RECIPE_BOOK_DATA             = PlayC2S("recipe_book_seen_recipe");
            public static final PacketType RESOURCE_PACK_STATUS         = PlayC2S("resource_pack_status");
            public static final PacketType SELECT_TRADE                 = PlayC2S("select_trade");
            public static final PacketType SET_BEACON_EFFECT            = PlayC2S("set_beacon");
            public static final PacketType SET_DIFFICULTY               = PlayC2S("change_difficulty");
            public static final PacketType SET_DISPLAYED_RECIPE         = PlayC2S("recipe_book_seen_recipe");
            public static final PacketType SET_RECIPE_BOOK_STATE        = PlayC2S("recipe_book_change_settings");
            public static final PacketType SPECTATE                     = PlayC2S("teleport_to_entity");
            public static final PacketType STEER_BOAT                   = PlayC2S("paddle_boat");
            public static final PacketType TAB_COMPLETE                 = PlayC2S("command_suggestion");
            public static final PacketType TELEPORT_CONFIRM             = PlayC2S("accept_teleportation");
            public static final PacketType UPDATE_COMMAND_BLOCK         = PlayC2S("set_command_block");
            public static final PacketType UPDATE_COMMAND_BLOCK_MINECART= PlayC2S("set_command_minecart");
            public static final PacketType UPDATE_JIGSAW_BLOCK          = PlayC2S("set_jigsaw_block");
            public static final PacketType UPDATE_STRUCTURE_BLOCK       = PlayC2S("set_structure_block");
            public static final PacketType UPDATE_SIGN                  = PlayC2S("sign_update");
            public static final PacketType USE_ITEM                     = PlayC2S("use_item");
            public static final PacketType VEHICLE_MOVE                 = PlayC2S("move_vehicle");

            /* ───── Newer packets 1.19 → 1.21.x ───── */
            /** Added in 1.19 */
            public static final PacketType CHAT_COMMAND                 = PlayC2S("chat_command");

            /** Added in 1.19.1 */
            public static final PacketType CHAT_ACK                     = PlayC2S("chat_ack");

            /** Added in 1.19.3 */
            public static final PacketType CHAT_SESSION_UPDATE          = PlayC2S("chat_session_update");

            /** Added in 1.20.2 */
            public static final PacketType CHUNK_BATCH_ACK              = PlayC2S("chunk_batch_received");
            /** Added in 1.20.2 */
            public static final PacketType CONFIGURATION_ACK            = PlayC2S("configuration_acknowledged");
            /** Added in 1.20.2 */
            public static final PacketType DEBUG_PING                   = PlayC2S("debug_ping");

            /** Added in 1.20.3 */
            public static final PacketType SLOT_STATE_CHANGE            = PlayC2S("container_slot_state_changed");

            /** Added in 1.20.5 */
            public static final PacketType CHAT_COMMAND_UNSIGNED        = PlayC2S("chat_command_unsigned");
            /** Added in 1.20.5 */
            public static final PacketType COOKIE_RESPONSE              = PlayC2S("cookie_response");
            /** Added in 1.20.5 */
            public static final PacketType DEBUG_SAMPLE_SUBSCRIPTION    = PlayC2S("debug_sample_subscription");

            /** Added in 1.21.2 */
            public static final PacketType CLIENT_TICK_END              = PlayC2S("client_tick_end");
            /** Added in 1.21.2, similar to {@link #STEER_VEHICLE} */
            public static final PacketType PLAYER_INPUT                 = PlayC2S("player_input");
            /** Added in 1.21.2 */
            public static final PacketType SELECT_BUNDLE_ITEM           = PlayC2S("bundle_item_selected");

            /** Added in 1.21.4 */
            public static final PacketType PICK_ITEM_FROM_BLOCK         = PlayC2S("pick_item_from_block");
            /** Added in 1.21.4 */
            public static final PacketType PICK_ITEM_FROM_ENTITY        = PlayC2S("pick_item_from_entity");
            /** Added in 1.21.4 */
            public static final PacketType PLAYER_LOADED                = PlayC2S("player_loaded");

            /** Added in 1.21.5 */
            public static final PacketType SET_TEST_BLOCK               = PlayC2S("set_test_block");
            /** Added in 1.21.5 */
            public static final PacketType TEST_INSTANCE_BLOCK_ACTION   = PlayC2S("test_instance_block_action");

            // ─────────────────────────────────────────────
            // Obsolete Fields (Ordered by Removal Version Ascending)
            // ─────────────────────────────────────────────
            /** Removed in 1.17. See {@link PONG} */
            public static final PacketType WINDOW_CONFIRMATION          = PlayC2S("window_confirmation");

            /** Removed in 1.21.2 */
            public static final PacketType STEER_VEHICLE                = PlayC2S("steer_vehicle");

            /** Removed in 1.21.4; unsure when added, possibly 1.20.4+ */
            public static final PacketType PICK_ITEM                    = PlayC2S("pick_item");
        }
    }

    public static PacketType PlayC2S(String packetIdentifier) {
        return TYPE.getC2SPacketTypeByString(packetIdentifier);
    }

    public static PacketType PlayS2C(String packetIdentifier) {
        return TYPE.getS2CPacketTypeByString(packetIdentifier);
    }
}
