package com.wampelpampel.aquaticadditions.items;

import com.mojang.blaze3d.shaders.Effect;
import com.wampelpampel.aquaticadditions.AquaticAdditions;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class OreFishBase extends Item {
    public OreFishBase() {
        super(new Item.Properties().tab(AquaticAdditions.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(1)
                        /*
                        .effect(new EffectInstance(MobEffects.HUNGER, 60*20,1),1)
                        .effect(new EffectInstance(Effects.CONFUSION,10*20,3),1)
                        .alwaysEat()
                        .effect(new EffectInstance(MobEffects.HUNGER, 60*20, 1), 1)

                         */
                        .build()
                ));
    }
}