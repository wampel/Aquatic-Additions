package com.aquatucadditions.wampelpampel.items;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class cookedDolphinMeat extends Item {
    public cookedDolphinMeat() {
        super(new Item.Properties().group(Turtlecraft.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(12.8F)
                        .build()
                ));
    }
}