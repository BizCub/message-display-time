//? fabric {
package com.bizcub.messageDisplayTime.platforms;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import net.fabricmc.api.ModInitializer;

public class Fabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MessageDisplayTime.init();
    }
}//?}
