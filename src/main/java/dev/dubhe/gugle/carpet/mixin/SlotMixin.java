package dev.dubhe.gugle.carpet.mixin;

import dev.dubhe.gugle.carpet.tools.SlotIcon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("AddedMixinMembersNamePattern")
@Mixin(Slot.class)
public class SlotMixin implements SlotIcon {
    @Unique
    private ResourceLocation noItemIcon = null;

    @Inject(method = "getNoItemIcon", at = @At("HEAD"), cancellable = true)
    private void getNoItemIcon(CallbackInfoReturnable<ResourceLocation> cir) {
        if (this.noItemIcon != null) {
            cir.setReturnValue(this.noItemIcon);
        }
    }

    @Override
    public void setIcon(ResourceLocation resource) {
        if (resource != null) {
            this.noItemIcon = resource;
        }
    }
}
