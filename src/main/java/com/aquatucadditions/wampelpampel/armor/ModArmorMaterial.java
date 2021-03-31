package com.aquatucadditions.wampelpampel.armor;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import com.aquatucadditions.wampelpampel.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    TURTLE(Turtlecraft.MOD_ID + ":turtle", 22, new int[]{3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 1, 0.3F, () -> {
        return Ingredient.fromItems(RegistryHandler.TURTLE_INGOT.get());
    }),
    TURTLEV(Turtlecraft.MOD_ID + ":turtlev", 22, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0, 0.1F,() -> {
        return Ingredient.fromItems(Items.SCUTE);
    }),
    FISH(Turtlecraft.MOD_ID + ":fish", 22, new int[]{2, 5, 6, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 1, 0, () -> {
        return Ingredient.fromItems(RegistryHandler.TURTLE_INGOT.get());
    });




    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackRessistance;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackRessistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionArray = damageReductionArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackRessistance = knockbackRessistance;
    }

        @Override
        public int getDurability (EquipmentSlotType slotIn){
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }


        @Override
        public int getDamageReductionAmount (EquipmentSlotType slotIn){
            return this.damageReductionArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability () {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent () {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial () {
            return this.repairMaterial.get();
        }

        @Override
        public String getName () {
            return this.name;
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public float getToughness () {
            return this.toughness;
        }

        @Override
        public float getKnockbackResistance() {
        return this.knockbackRessistance;
        }
}