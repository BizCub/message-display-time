//? forge {
/*package com.bizcub.messageDisplayTime.platforms;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import com.bizcub.messageDisplayTime.config.Configs;
import me.shedaniel.autoconfig.AutoConfig;
/^? >=1.19^/ /^import net.minecraftforge.client.ConfigScreenHandler;^/
/^? >=1.18 && <=1.18.2^/ /^import net.minecraftforge.client.ConfigGuiHandler;^/
/^? >=1.17 && <=1.17.1^/ /^import net.minecraftforge.fmlclient.ConfigGuiHandler;^/
/^? <=1.16.5^/ import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(MessageDisplayTime.modId)
public class Forge {

    public Forge() {
        MessageDisplayTime.init();

        //? >=1.19 {
        /^ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> {
            return new ConfigScreenHandler.ConfigScreenFactory((minecraft, screen) -> {
                return PlatformInit.getScreen(screen);
            });
        });

        ^///?} >=1.17 {
        /^ModLoadingContext.get().registerExtensionPoint(ConfigGuiHandler.ConfigGuiFactory.class,
                () -> new ConfigGuiHandler.ConfigGuiFactory((client, parent) ->
                        PlatformInit.getScreen(parent))
        );

        ^///?} else {
        ModLoadingContext.get().registerExtensionPoint(
                ExtensionPoint.CONFIGGUIFACTORY, () -> (mc, screen) ->
                        PlatformInit.getScreen(screen)
        );//?}
    }
}*///?}
