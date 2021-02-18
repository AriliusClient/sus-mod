package me.constantindev.sus.mixin;

import me.constantindev.sus.Config;
import me.constantindev.sus.CustomTexture;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Identifier.class)
public class when_the_bruh_2 {
    @Mutable
    @Shadow @Final protected String namespace;

    @Mutable
    @Shadow @Final protected String path;

    @Inject(method="<init>(Ljava/lang/String;)V",at = @At("TAIL"))
    public void gp(String id, CallbackInfo ci) {
        boolean replace = false;
        String replacement = "amogusCharacter.png";
        CustomTexture full = null;
        for(CustomTexture t : Config.textures2replace) {
            if (id.equals(t.replaces)) {
                replace = true;
                replacement = t.replacement;
                full = t;
                break;
            }
        }
        if (replace) {
            System.out.println(full.replaces + " -> " + full.replacement);
            //net.minecraft.client.gui.screen.TitleScreen
            this.path = replacement;
            this.namespace = "sus";
        }
        //System.out.println("Accessed identifier: "+id);
    }
}
