package com.bizcub.messageDisplayTime;

import com.bizcub.messageDisplayTime.config.ModConfig;

public class Main {
    public static final String MOD_ID = /*$ mod_id*/ "message_display_time";

    public static ModConfig getConfig() {
        return ModConfig.CONFIG;
    }

    public static void init() {
        getConfig();
    }
}
