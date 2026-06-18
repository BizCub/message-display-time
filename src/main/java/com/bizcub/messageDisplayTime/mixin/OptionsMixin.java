package com.bizcub.messageDisplayTime.mixin;

import com.bizcub.messageDisplayTime.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Options.class)
public class OptionsMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void sliderInit(CallbackInfo ci) {
        Main.messageDisplayTimeSlider = new OptionInstance<>(
                "options.messageDisplayTime",
                OptionInstance.cachedConstantTooltip(Component.translatable("options.messageDisplayTime.tooltip")),
                (caption, value) -> Options.genericValueLabel(caption, Component.literal(String.valueOf(value))),
                new OptionInstance.IntRange(0, 30),
                10,
                value -> Minecraft.getInstance().options.save()
        );
    }

    @Inject(method = "processOptions", at = @At("TAIL"))
    private void processOptions(Options.FieldAccess access, CallbackInfo ci) {
        access.process("messageDisplayTime", Main.messageDisplayTimeSlider);
    }
}
