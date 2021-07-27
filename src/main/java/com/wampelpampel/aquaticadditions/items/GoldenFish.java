package com.wampelpampel.aquaticadditions.items;

import com.wampelpampel.aquaticadditions.AquaticAdditions;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GoldenFish extends Item {
    public GoldenFish() {
        super(new Item.Properties().tab(AquaticAdditions.TAB)
        .food
                (new FoodProperties.Builder()
                .nutrition(10)
                        .build()));
    }
}
