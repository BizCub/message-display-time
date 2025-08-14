package com.bizcub.template.mixin;

import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ChatHud.class)
public class ChatHudMixin {

    @ModifyVariable(method = "render", at = @At(value = "HEAD"), ordinal = 0, argsOnly = true)
    private int render(int currentTick) {
        return currentTick + 200 - (20 * 10);
    }
}
