package com.aquatucadditions.wampelpampel.items;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class turtleApple extends Item {
    public turtleApple() {
        super(new Properties().tab(Turtlecraft.TAB)
                .food(new Food.Builder()
                .nutrition(4)
                        .effect(new EffectInstance(Effects.ABSORPTION, 60*20, 2, true, true), 1)
                        .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 5*20, 0, true, true), 1)
                        .effect(new EffectInstance(Effects.NIGHT_VISION, 10*20, 2, true, true), 1)
                        .effect(new EffectInstance(Effects.DOLPHINS_GRACE, 3*20, 0, true, true), 1)
                        .effect(new EffectInstance(Effects.WATER_BREATHING, 10*20, 0, true, true), 1)
                        .alwaysEat()
                        .build()

        ));
    }
}
