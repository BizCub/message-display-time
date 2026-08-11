//? fabric {
package io.github.bizcub.messageDisplayTime.platform;

import io.github.bizcub.messageDisplayTime.Main;
import net.fabricmc.api.ModInitializer;

public class Fabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Main.init();
    }
}//?}
