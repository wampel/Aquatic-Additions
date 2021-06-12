package com.aquatucadditions.wampelpampel.items;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class OreFishBase extends Item {
    public OreFishBase() {
        super(new Item.Properties().tab(Turtlecraft.TAB)
                .food(new Food.Builder()
                        .nutrition(1)
                        .effect(new EffectInstance(Effects.HUNGER, 60*20,1),1)
                        .effect(new EffectInstance(Effects.CONFUSION,10*20,3),1)
                        .alwaysEat()
                        .build()
                ));
    }
}