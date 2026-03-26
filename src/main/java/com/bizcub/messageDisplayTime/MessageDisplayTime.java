package com.bizcub.messageDisplayTime;

import com.bizcub.messageDisplayTime.config.Compat;
import com.bizcub.messageDisplayTime.config.Configs;

public class MessageDisplayTime {

    public static final String modId = /*$ mod_id*/ "message_display_time";

    public static void init() {
        if (Compat.isModLoaded(Compat.clothConfigId)) Configs.init();
    }
}
