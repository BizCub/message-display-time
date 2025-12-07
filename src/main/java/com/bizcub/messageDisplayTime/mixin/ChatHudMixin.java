package com.bizcub.messageDisplayTime.mixin;

import com.bizcub.messageDisplayTime.MessageDisplayTime;
import com.bizcub.messageDisplayTime.config.Compat;
import com.bizcub.messageDisplayTime.config.Configs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import net.minecraft.client.gui.components.ChatComponent;

@Mixin(ChatComponent.class)
public class ChatHudMixin {

    @ModifyVariable(method = "render*", at = @At(value = "HEAD"), argsOnly = true, ordinal = 0)
    private int render(int currentTick) {
        if (Compat.isModLoaded(MessageDisplayTime.clothConfigId)) return currentTick + 200 - (20 * Configs.getInstance().sec);
        return currentTick + 100;
    }
}
