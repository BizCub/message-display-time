//? fabric {
package com.bizcub.messageDisplayTime.platforms;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.fabricmc.api.ModInitializer;

public class Fabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MessageDisplayTime.init();
    }

    public static class ModMenu implements ModMenuApi {

        @Override
        public ConfigScreenFactory<?> getModConfigScreenFactory() {
            return PlatformInit::getScreen;
        }
    }
}//?}
