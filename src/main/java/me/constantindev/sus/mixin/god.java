package me.constantindev.sus.mixin;

import net.minecraft.SharedConstants;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DrawableHelper.class)
public class god {
    @Inject(method = "drawStringWithShadow", at = @At("HEAD"), cancellable = true)
    private static void pain(MatrixStack matrices, TextRenderer textRenderer, String text, int x, int y, int color, CallbackInfo ci) {
        if (text.startsWith("Minecraft " + SharedConstants.getGameVersion().getName())) {
            textRenderer.drawWithShadow(matrices, "Minecraft sus edition 1.69.420/Fabric (Sus mod)", (float) x, (float) y, color);
            ci.cancel();
        }
    }
}
