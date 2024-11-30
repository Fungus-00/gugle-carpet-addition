package dev.dubhe.gugle.carpet.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.dubhe.gugle.carpet.GcaSetting;
import net.minecraft.core.Holder;
import net.minecraft.recipebook.ServerPlaceRecipe;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.entity.player.StackedItemContents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ServerPlaceRecipe.class)
abstract class ServerPlaceRecipeMixin {
    @WrapOperation(method = "placeRecipe(Lnet/minecraft/world/item/crafting/RecipeHolder;Lnet/minecraft/world/entity/player/StackedItemContents;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/StackedItemContents;getBiggestCraftableStack(Lnet/minecraft/world/item/crafting/Recipe;Lnet/minecraft/world/entity/player/StackedContents$Output;)I"))
    private int handleRecipeClicked(StackedItemContents instance, Recipe<?> recipe, @Nullable StackedContents.Output<Holder<Item>> output, Operation<Integer> original) {
        int i = original.call(instance, recipe, output);
        return GcaSetting.betterQuickCrafting ? i - 1 : i;
    }
}
