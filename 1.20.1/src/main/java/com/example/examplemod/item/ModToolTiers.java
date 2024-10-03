package com.example.examplemod.item;


import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier CORAL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_CORAL_TOOL, () -> Ingredient.of(ModItems.SEA_CORAL.get())),
            new ResourceLocation(ExampleMod.MOD_ID, "coral"), List.of(Tiers.NETHERITE), List.of());

}
