package me.constantindev.sus.mixin;

import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerListEntry.class)
public class When_the_bruh {
    @Inject(method = "getSkinTexture", cancellable = true, at = @At("HEAD"))
    public void replaceSkin(CallbackInfoReturnable<Identifier> cir) {
        cir.setReturnValue(new Identifier("sus", "amogus.png"));
    }
}
