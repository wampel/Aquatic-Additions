package com.aquatucadditions.wampelpampel.items;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class GoldenFish extends Item {
    public GoldenFish() {
        super(new Item.Properties().tab(Turtlecraft.TAB)
        .food
                (new Food.Builder()
                .nutrition(10)
                        .build()));
    }
}
