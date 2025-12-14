//? neoforge {
/*package com.bizcub.messageDisplayTime.platforms;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(MessageDisplayTime.modId)
public class NeoForge {

    public NeoForge() {
        MessageDisplayTime.init();

        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (container, parent) -> {
            return PlatformInit.getScreen(parent);
        });
    }
}*///?}
