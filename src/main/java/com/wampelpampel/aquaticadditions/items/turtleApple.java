package com.wampelpampel.aquaticadditions.items;

import com.wampelpampel.aquaticadditions.AquaticAdditions;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class turtleApple extends Item {
    public turtleApple() {
        super(new Properties().tab(AquaticAdditions.TAB)
                .food(new FoodProperties.Builder()
                .nutrition(4)
                        /*
                        .effect(new EffectInstance(Effects.ABSORPTION, 60*20, 2, true, true), 1)
                        .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 5*20, 0, true, true), 1)
                        .effect(new EffectInstance(Effects.NIGHT_VISION, 10*20, 2, true, true), 1)
                        .effect(new EffectInstance(Effects.DOLPHINS_GRACE, 3*20, 0, true, true), 1)
                        .effect(new EffectInstance(Effects.WATER_BREATHING, 10*20, 0, true, true), 1)
                         */
                        .alwaysEat()
                        .build()

        ));
    }
}
