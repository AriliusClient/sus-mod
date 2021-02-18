package me.constantindev.sus.mixin;

import net.minecraft.client.resource.SplashTextResourceSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashTextResourceSupplier.class)
public class custom_splashes {
    @Inject(method = "get", at = @At("HEAD"), cancellable = true)
    public void retCustomSplash(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("§camogus");
    }
}
