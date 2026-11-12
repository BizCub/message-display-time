package io.github.bizcub.messageDisplayTime.mixin;

import io.github.bizcub.messageDisplayTime.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import net.minecraft.client.gui.components.ChatComponent;

@Mixin(ChatComponent.class)
public class ChatHudMixin {

    @ModifyVariable(method = "extractRenderState(Lnet/minecraft/client/gui/components/ChatComponent$ChatGraphicsAccess;IILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;)V", at = @At("HEAD"), argsOnly = true, ordinal = 1)
    private int render(int ticks) {
        return ticks + 200 - (20 * Main.messageDisplayTimeSlider.get());
    }
}
