package com.aquatucadditions.wampelpampel.items;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class cookedDolphinMeat extends Item {
    public cookedDolphinMeat() {
        super(new Item.Properties().tab(Turtlecraft.TAB)
                .food(new Food.Builder()
                        .nutrition(8)
                        .build()
                ));
    }
}