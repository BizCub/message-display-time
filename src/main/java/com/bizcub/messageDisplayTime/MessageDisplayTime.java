package com.bizcub.messageDisplayTime;

import com.bizcub.messageDisplayTime.config.Compat;
import com.bizcub.messageDisplayTime.config.Configs;

public class MessageDisplayTime {

    public static final String modId = "message_display_time";
    //? if (fabric && >=1.18) || (forge && <1.17) {
    /*public static final String clothConfigId = "cloth-config";
    *///?} elif fabric {
    public static final String clothConfigId = "cloth-config2";
    //?} elif (forge && >=1.17) || neoforge {
    /*public static final String clothConfigId = "cloth_config";*///?}

    public static final int DEF_SEC = 5;
    public static final int MIN_SEC = 0;
    public static final int MAX_SEC = 30;

    public static void init() {
        if (Compat.isModLoaded(clothConfigId)) Configs.init();
    }
}
