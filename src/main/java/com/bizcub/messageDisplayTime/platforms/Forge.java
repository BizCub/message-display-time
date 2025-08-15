//? if forge {
/*package com.bizcub.messageDisplayTime.platforms;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import com.bizcub.messageDisplayTime.config.Configs;
import me.shedaniel.autoconfig.AutoConfig;
//? if >=1.19 {
/^import net.minecraftforge.client.ConfigScreenHandler;
^///?} elif >=1.18 {
/^import net.minecraftforge.client.ConfigGuiHandler;
^///?} elif >=1.17 {
/^import net.minecraftforge.fmlclient.ConfigGuiHandler;
^///?} else {
import net.minecraftforge.fml.ExtensionPoint;//?}
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(MessageDisplayTime.modId)
public class Forge {

    public Forge() {
        MessageDisplayTime.init();

        //? if >=1.19 {
        /^ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> {
            return new ConfigScreenHandler.ConfigScreenFactory((minecraft, screen) -> {
                return AutoConfig.getConfigScreen(Configs.class, screen).get();
            });
        });

        ^///?} elif >=1.17 {
        /^ModLoadingContext.get().registerExtensionPoint(ConfigGuiHandler.ConfigGuiFactory.class,
                () -> new ConfigGuiHandler.ConfigGuiFactory((client, parent) ->
                        AutoConfig.getConfigScreen(Configs.class, parent).get())
        );

        ^///?} else {
        ModLoadingContext.get().registerExtensionPoint(
                ExtensionPoint.CONFIGGUIFACTORY,
                () -> (mc, screen) -> AutoConfig.getConfigScreen(Configs.class, screen).get()
        );//?}
    }
}*///?}
