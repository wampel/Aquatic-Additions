package com.wampelpampel.aquaticadditions.util;


import com.wampelpampel.aquaticadditions.AquaticAdditions;
import com.wampelpampel.aquaticadditions.armor.ModArmorMaterial;
import com.wampelpampel.aquaticadditions.blocks.BlockItemBase;
import com.wampelpampel.aquaticadditions.blocks.ScuteBlock;
import com.wampelpampel.aquaticadditions.blocks.TurtleBlock;
import com.wampelpampel.aquaticadditions.items.*;
import com.wampelpampel.aquaticadditions.items.tools.ModItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AquaticAdditions.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AquaticAdditions.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    // Items
    public static final RegistryObject<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot", ItemBase::new);
    public static final RegistryObject<Item> TURTLE_APPLE = ITEMS.register("turtle_apple", turtleApple::new);
    public static final RegistryObject<Item> RAW_DOLPHIN_MEAT = ITEMS.register("raw_dolphin_meat", RawDolphinMeat::new);
    public static final RegistryObject<Item> COOKED_DOLPHIN_MEAT = ITEMS.register("cooked_dolphin_meat", RawDolphinMeat::new);
    public static final RegistryObject<Item> DOLPHIN_FINN = ITEMS.register("dolphin_finn", ItemBase::new);
    public static final RegistryObject<Item> IRON_FISH = ITEMS.register("iron_fish", OreFishBase::new);
    public static final RegistryObject<Item> GOLD_FISH = ITEMS.register("gold_fish", OreFishBase::new);
    public static final RegistryObject<Item> DIAMOND_FISH = ITEMS.register("diamond_fish",OreFishBase::new);
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", ItemBase::new);
    public static final RegistryObject<Item> GOLDEN_FISH = ITEMS.register("golden_fish", GoldenFish::new);

    //Tools
    public static final RegistryObject<SwordItem> TURTLE_SWORD = ITEMS.register("turtle_sword", () ->
            new SwordItem(ModItemTier.TURTLE, 3, -2.6F, new Item.Properties().tab(AquaticAdditions.TAB)));

    public static final RegistryObject<PickaxeItem> TURTLE_PICKAXE = ITEMS.register("turtle_pickaxe", () ->
            new PickaxeItem(ModItemTier.TURTLE, 1, -2.8F, new Item.Properties().tab(AquaticAdditions.TAB)));

    public static final RegistryObject<AxeItem> TURTLE_AXE = ITEMS.register("turtle_axe", () ->
            new AxeItem(ModItemTier.TURTLE, 5F, -3F, new Item.Properties().tab(AquaticAdditions.TAB)));

    public static final RegistryObject<ShovelItem> TURTLE_SHOVEL = ITEMS.register("turtle_shovel", () ->
            new ShovelItem(ModItemTier.TURTLE, 1F, -3F, new Item.Properties().tab(AquaticAdditions.TAB)));

    public static final RegistryObject<HoeItem> TURTLE_HOE = ITEMS.register("turtle_hoe", () ->
            new HoeItem(ModItemTier.TURTLE, -3, 0, new Item.Properties().tab(AquaticAdditions.TAB)));

    //Blocks
    public static final RegistryObject<Block> TURTLE_BLOCK = BLOCKS.register("turtle_block", TurtleBlock::new);
    public static final RegistryObject<Block> SCUTE_BLOCK = BLOCKS.register("scute_block", ScuteBlock::new);
   // public static final RegistryObject<Block> PRISMARINE_PILLAR = BLOCKS.register("prismarine_pillar", PrismarinePillar::new);

    //Block Items
    public static final RegistryObject<Item> TURTLE_BLOCK_ITEM = ITEMS.register("turtle_block", () -> new BlockItemBase(TURTLE_BLOCK.get()));
    public static final RegistryObject<Item> SCUTE_BLOCK_ITEM = ITEMS.register("scute_block", () -> new BlockItemBase(SCUTE_BLOCK.get()));
  //  public static final RegistryObject<Item> PRISMARINE_PILLAR_ITEM = ITEMS.register("prismarine_pillar", () -> new BlockItemBase(PRISMARINE_PILLAR.get()));

    //Armor
    public static final RegistryObject<Item> TURTLE_CHESTPLATE = ITEMS.register("turtle_chestplate", () ->
            new ArmorItem(ModArmorMaterial.TURTLE, EquipmentSlot.CHEST, new Item.Properties().tab(AquaticAdditions.TAB)));
    public static final RegistryObject<Item> TURTLE_LEGGINS = ITEMS.register("turtle_leggins", () ->
            new ArmorItem(ModArmorMaterial.TURTLE, EquipmentSlot.LEGS, new Item.Properties().tab(AquaticAdditions.TAB)));
    public static final RegistryObject<Item> TURTLE_BOOTS = ITEMS.register("turtle_boots", () ->
            new ArmorItem(ModArmorMaterial.TURTLE, EquipmentSlot.FEET, new Item.Properties().tab(AquaticAdditions.TAB)));
    public static final RegistryObject<Item> TURTLE_HELMET = ITEMS.register("turtle_helmet", () ->
            new ArmorItem(ModArmorMaterial.TURTLE, EquipmentSlot.HEAD, new Item.Properties().tab(AquaticAdditions.TAB)));

    public static final RegistryObject<Item> VTURTLE_CHESTPLATE = ITEMS.register("scute_chestplate", () ->
            new ArmorItem(ModArmorMaterial.TURTLEV, EquipmentSlot.CHEST, new Item.Properties().tab(AquaticAdditions.TAB)));
    public static final RegistryObject<Item> VTURTLE_LEGGINS = ITEMS.register("scute_leggings", () ->
            new ArmorItem(ModArmorMaterial.TURTLEV, EquipmentSlot.LEGS, new Item.Properties().tab(AquaticAdditions.TAB)));
    public static final RegistryObject<Item> VTURTLE_BOOTS = ITEMS.register("scute_boots", () ->
            new ArmorItem(ModArmorMaterial.TURTLEV, EquipmentSlot.FEET, new Item.Properties().tab(AquaticAdditions.TAB)));

    public static final RegistryObject<Item> FISH_HELMET = ITEMS.register("fishing_hat", () ->
            new ArmorItem(ModArmorMaterial.FISH, EquipmentSlot.HEAD, new Item.Properties().tab(AquaticAdditions.TAB)));
}
