package net.sander.modxz.item;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sander.modxz.ModXz;

import net.sander.modxz.item.costum.AmethystArmorItem;
import net.sander.modxz.item.costum.AmethystArmorMaterials;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModXz.MOD_ID);


    public static RegistryObject<Item> AMBER = ITEMS.register("amber",
        () -> new Item(new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));
    public static RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
            () -> new PickaxeItem(ModTiers.AMBER, 2,3.5f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword",
            () -> new SwordItem(ModTiers.AMBER, 10, 8f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));


    public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe",
            () -> new AxeItem(ModTiers.AMBER, 8,7f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMBER_SHOVEL = ITEMS.register("amber_shovel",
            () -> new ShovelItem(ModTiers.AMBER, 7,6.5f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe",
            () -> new HoeItem(ModTiers.AMBER, 4,5f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));



    public static final RegistryObject<Item> ADIDAS_HELMET = ITEMS.register("adidas_helmet",
            () -> new AmethystArmorItem(AmethystArmorMaterials.AMETHYST, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> ADIDAS_CHESTPLATE = ITEMS.register("adidas_chestplate",
            () -> new AmethystArmorItem(AmethystArmorMaterials.AMETHYST, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));
    public static final RegistryObject<Item> ADIDAS_LEGGINGS = ITEMS.register("adidas_leggings",
            () -> new AmethystArmorItem(AmethystArmorMaterials.AMETHYST, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));
    public static final RegistryObject<Item> ADIDAS_BOOTS = ITEMS.register("adidas_boots",
            () -> new AmethystArmorItem(AmethystArmorMaterials.AMETHYST, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    }








