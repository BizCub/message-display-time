package com.bizcub.messageDisplayTime.mixin;

import com.bizcub.messageDisplayTime.config.Compat;
import com.bizcub.messageDisplayTime.config.Configs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import net.minecraft.client.gui.components.ChatComponent;

@Mixin(ChatComponent.class)
public class ChatHudMixin {

    /*? >=1.21.11*/ @ModifyVariable(method = "render(Lnet/minecraft/client/gui/components/ChatComponent$ChatGraphicsAccess;IIZ)V", at = @At("HEAD"), argsOnly = true, ordinal = 1)
    /*? <=1.21.10*/ //@ModifyVariable(method = "render*", at = @At("HEAD"), argsOnly = true, ordinal = 0)
    private int render(int currentTick) {
        if (Compat.isModLoaded(Compat.clothConfigId)) return currentTick + 200 - (20 * Configs.getInstance().sec);
        return currentTick + 100;
    }
}
