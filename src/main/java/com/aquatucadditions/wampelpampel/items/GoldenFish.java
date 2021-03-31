package com.aquatucadditions.wampelpampel.items;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class GoldenFish extends Item {
    public GoldenFish() {
        super(new Item.Properties().group(Turtlecraft.TAB)
        .food
                (new Food.Builder()
                        .hunger(6)
                        .saturation(14.4F)
                        .build()));
    }
}
