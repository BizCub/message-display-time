package com.bizcub.messageDisplayTime.config;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = MessageDisplayTime.modId)
public class Configs implements ConfigData {

    @ConfigEntry.BoundedDiscrete(min = 0, max = 30)
    public int sec = 5;

    public static Configs getInstance() {
        return AutoConfig.getConfigHolder(Configs.class).getConfig();
    }

    public static void init() {
        AutoConfig.register(Configs.class, GsonConfigSerializer::new);
    }
}
