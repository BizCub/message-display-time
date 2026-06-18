package com.bizcub.messageDisplayTime.mixin;

import com.bizcub.messageDisplayTime.Main;
import net.minecraft.client.OptionInstance;
//~ if >=1.20.2 'ChatOptionsScreen' -> 'options.ChatOptionsScreen'
import net.minecraft.client.gui.screens.options.ChatOptionsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(ChatOptionsScreen.class)
public class ChatOptionsScreenMixin {

    @Unique
    private static OptionInstance[] getUpdatedOptionInstance(OptionInstance[] options) {
        ArrayList<OptionInstance> optionsList = new ArrayList<>(Arrays.asList(options));
        optionsList.add(Main.messageDisplayTimeSlider);
        return optionsList.toArray(new OptionInstance[0]);
    }

    //? >=1.21 {
    @Inject(method = "options", at = @At("RETURN"), cancellable = true)
    private static void addTimeDisplayOption(CallbackInfoReturnable<OptionInstance<?>[]> cir) {
        cir.setReturnValue(getUpdatedOptionInstance(cir.getReturnValue()));
    }

    //?} else {
    /*@ModifyArg(method = "<init>", index = 3, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/SimpleOptionsSubScreen;<init>(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/Options;Lnet/minecraft/network/chat/Component;[Lnet/minecraft/client/OptionInstance;)V"))
    private static OptionInstance[] addTimeDisplayOption(OptionInstance[] options) {
        return getUpdatedOptionInstance(options);
    }*///?}
}
