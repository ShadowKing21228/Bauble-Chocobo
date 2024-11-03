package net.shadowking21.baublechocobo.mixin.chococraft;

import net.chococraft.common.entity.AbstractChocobo;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = AbstractChocobo.class)
public class ChococraftMixin {

    @Redirect(method = "mobInteract", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;isEmpty()Z"))
    private boolean mobInteractMixin (ItemStack instance)
    {
        return true;
    }
}
