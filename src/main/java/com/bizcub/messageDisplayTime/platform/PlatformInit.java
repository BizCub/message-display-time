package com.bizcub.messageDisplayTime.platform;

//~ auto_config
import com.bizcub.messageDisplayTime.config.Configs;
import me.shedaniel.autoconfig.AutoConfigClient;
import net.minecraft.client.gui.screens.Screen;

public class PlatformInit {

    //? is_cloth_config_available {
    public static Screen getScreen(Screen parent) {
        return AutoConfigClient.getConfigScreen(Configs.class, parent).get();
    }//?}
}
