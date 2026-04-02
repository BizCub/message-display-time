package com.bizcub.messageDisplayTime.config;

import com.bizcub.messageDisplayTime.Main;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = Main.MOD_ID)
public class ModClothConfig implements ModConfig, ConfigData {

    public static ModClothConfig getInstance() {
        return AutoConfig.register(ModClothConfig.class, GsonConfigSerializer::new).getConfig();
    }

    @ConfigEntry.BoundedDiscrete(min = 0, max = 30)
    public int sec = ModConfig.super.sec();

    @Override
    public int sec() {
        return this.sec;
    }
}
