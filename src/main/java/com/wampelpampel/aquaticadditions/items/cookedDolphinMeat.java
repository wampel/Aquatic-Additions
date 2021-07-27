package com.wampelpampel.aquaticadditions.items;

import com.wampelpampel.aquaticadditions.AquaticAdditions;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class cookedDolphinMeat extends Item {
    public cookedDolphinMeat() {
        super(new Item.Properties().tab(AquaticAdditions.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(8)
                        .build()
                ));
    }
}