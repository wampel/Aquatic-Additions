package com.wampelpampel.aquaticadditions.items;

import com.wampelpampel.aquaticadditions.AquaticAdditions;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class RawDolphinMeat extends Item {
    public RawDolphinMeat() {
        super(new Item.Properties().tab(AquaticAdditions.TAB)
                .food(new FoodProperties.Builder()
                .nutrition(2)
                                .build()
                ));
    }
}
