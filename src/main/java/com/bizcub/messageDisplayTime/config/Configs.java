package com.bizcub.messageDisplayTime.config;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = MessageDisplayTime.modId)
public class Configs implements ConfigData {

    @ConfigEntry.BoundedDiscrete(min = MessageDisplayTime.MIN_SEC, max = MessageDisplayTime.MAX_SEC)
    public int sec = MessageDisplayTime.DEF_SEC;

    public static Configs getInstance() {
        return AutoConfig.getConfigHolder(Configs.class).getConfig();
    }

    public static void init() {
        AutoConfig.register(Configs.class, GsonConfigSerializer::new);
    }
}
