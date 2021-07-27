package com.wampelpampel.aquaticadditions.armor;

import com.wampelpampel.aquaticadditions.AquaticAdditions;
import com.wampelpampel.aquaticadditions.util.RegistryHandler;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    TURTLE(AquaticAdditions.MOD_ID + ":turtle", 22, new int[]{3, 6, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_TURTLE, 1, 0.3F, () -> {
        return Ingredient.of(RegistryHandler.TURTLE_INGOT.get());
    }),
    TURTLEV(AquaticAdditions.MOD_ID + ":turtlev", 22, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0, 0.1F,() -> {
        return Ingredient.of(Items.SCUTE);
    }),
    FISH(AquaticAdditions.MOD_ID + ":fish", 22, new int[]{2, 5, 6, 1}, 10, SoundEvents.ARMOR_EQUIP_TURTLE, 1, 0, () -> {
        return Ingredient.of(RegistryHandler.TURTLE_INGOT.get());
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
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return MAX_DAMAGE_ARRAY[equipmentSlot.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
        return this.damageReductionArray[equipmentSlot.getIndex()];
    }

    @Override
        public int getEnchantmentValue () {
            return this.enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repairMaterial.get();
        }

        @Override
        public String getName () {
            return this.name;
        }

        @Override
        public float getToughness () {
            return this.toughness;
        }

        @Override
        public float getKnockbackResistance() {
        return this.knockbackRessistance;
        }
}
