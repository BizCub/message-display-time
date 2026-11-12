package io.github.bizcub.messageDisplayTime.mixin;

import io.github.bizcub.messageDisplayTime.Main;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.gui.screens.options.ChatOptionsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
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

    @Inject(method = "options", at = @At("RETURN"), cancellable = true)
    private static void addTimeDisplayOption(CallbackInfoReturnable<OptionInstance<?>[]> cir) {
        cir.setReturnValue(getUpdatedOptionInstance(cir.getReturnValue()));
    }

}
