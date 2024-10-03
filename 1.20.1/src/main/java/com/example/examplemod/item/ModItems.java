package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.item.custom.FuelItem;
import com.example.examplemod.item.custom.MetalDetectorItem;
import com.example.examplemod.item.custom.ModArmorItem;
import com.example.examplemod.item.custom.ModFoods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> SEA_CORAL= ITEMS.register("sea_coral",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SAPPHIRE= ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BANANA= ITEMS.register("banana",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEPEHA= ITEMS.register("pepeha",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE= ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METALL_DETECTOR= ITEMS.register("metall_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> CANDY_FROM_SANTA= ITEMS.register("candy_from_santa",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_FROM_SANTA)));
    public static final RegistryObject<Item> PINE_CONE= ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(),400));
    public static final RegistryObject<Item> WHEATUSH_CROP_BLOCK_SEEDS= ITEMS.register("wheatush_crop_block_seeds",
            () -> new ItemNameBlockItem(ModBlocks.WHEATUSH_CROP_BLOCK.get(), new Item.Properties()));
            
    public static final RegistryObject<Item> CORAL_SWORD = ITEMS.register("coral_sword",
            () -> new SwordItem(ModToolTiers.CORAL, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> CORAL_PICKAXE = ITEMS.register("coral_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CORAL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> CORAL_AXE = ITEMS.register("coral_axe",
            () -> new AxeItem(ModToolTiers.CORAL, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> CORAL_SHOVEL = ITEMS.register("coral_shovel",
            () -> new ShovelItem(ModToolTiers.CORAL, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> CORAL_HOE = ITEMS.register("coral_hoe",
            () -> new HoeItem(ModToolTiers.CORAL, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> CORAL_HELMET = ITEMS.register("coral_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SEA_CORAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CORAL_CHESTPLATE = ITEMS.register("coral_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SEA_CORAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CORAL_LEGGINGS = ITEMS.register("coral_leggings",
            () -> new ArmorItem(ModArmorMaterials.SEA_CORAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CORAL_BOOTS = ITEMS.register("coral_boots",
            () -> new ArmorItem(ModArmorMaterials.SEA_CORAL, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }




}
