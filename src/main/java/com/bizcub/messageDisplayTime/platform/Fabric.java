//? fabric {
package com.bizcub.messageDisplayTime.platform;

import com.bizcub.messageDisplayTime.Main;
import net.fabricmc.api.ModInitializer;

public class Fabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Main.init();
    }
}//?}
