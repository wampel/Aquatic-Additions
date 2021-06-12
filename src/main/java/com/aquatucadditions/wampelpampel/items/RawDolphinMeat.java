package com.aquatucadditions.wampelpampel.items;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class RawDolphinMeat extends Item {
    public RawDolphinMeat() {
        super(new Item.Properties().tab(Turtlecraft.TAB)
                .food(new Food.Builder()
                .nutrition(2)
                                .build()
                ));
    }
}
