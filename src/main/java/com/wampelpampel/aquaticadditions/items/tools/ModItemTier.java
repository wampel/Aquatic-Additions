package com.wampelpampel.aquaticadditions.items.tools;

import com.wampelpampel.aquaticadditions.util.RegistryHandler;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements Tier {

    TURTLE(3, 1756, 6, 3, 10, () -> {
        return Ingredient.of(RegistryHandler.TURTLE_SWORD.get());
    });
    private final int harvestLevel;
    private final int maxUses;
    private final int efficieny;
    private final int attackDamage; // vanilla damage +1 dann dazu damage
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, int efficieny, int attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficieny = efficieny;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficieny;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}