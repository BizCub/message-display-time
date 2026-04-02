package com.bizcub.messageDisplayTime.config;

public interface ModConfig {
    ModConfig CONFIG = Compat.isClothConfigLoaded() ? ModClothConfig.getInstance() : new ModConfig() { };

    default int sec() {
        return 5;
    }
}
