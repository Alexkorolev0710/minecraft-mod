package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SEA_VOYAGES_TAB = CREATIVE_MODE_TABS.register("sea_voyages_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SEA_CORAL.get()))
                    .title(Component.translatable("creativetab.sea_voyages_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SEA_CORAL.get());
                        pOutput.accept(ModBlocks.SEA_CORAL_BLOCK.get());
                        pOutput.accept(ModItems.CORAL_AXE.get());
                        pOutput.accept(ModItems.CORAL_PICKAXE.get());
                        pOutput.accept(ModItems.CORAL_SHOVEL.get());
                        pOutput.accept(ModItems.CORAL_SWORD.get());
                        pOutput.accept(ModItems.CORAL_HOE.get());
                        pOutput.accept(ModItems.CORAL_HELMET.get());
                        pOutput.accept(ModItems.CORAL_CHESTPLATE.get());
                        pOutput.accept(ModItems.CORAL_LEGGINGS.get());
                        pOutput.accept(ModItems.CORAL_BOOTS.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EXAMPLEMOD_TAB = CREATIVE_MODE_TABS.register("examplemod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.examplemod_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.METALL_DETECTOR.get());
                        pOutput.accept(ModItems.PEPEHA.get());
                        pOutput.accept(ModItems.CANDY_FROM_SANTA.get());
                        pOutput.accept(ModItems.PINE_CONE.get());
                        //pOutput.accept(ModItems.SAPPHIRE_AXE.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.PEPEHA_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModBlocks.FIREWORK.get());


                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
