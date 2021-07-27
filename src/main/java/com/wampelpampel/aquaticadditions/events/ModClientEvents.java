package com.wampelpampel.aquaticadditions.events;

import com.wampelpampel.aquaticadditions.AquaticAdditions;
import com.wampelpampel.aquaticadditions.util.RegistryHandler;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AquaticAdditions.MOD_ID, bus= Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
    //Sword
    @SubscribeEvent
    public static void boxer(AttackEntityEvent event) {
        if (event.getEntityLiving().getMainHandItem().getItem() == RegistryHandler.TURTLE_SWORD.get()) {
            if (event.getTarget().isAlive()) {

                Player player = event.getPlayer();
                LivingEntity target = (LivingEntity) event.getTarget();

                target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3 * 20, 1));
            }
        }
    }


    //Turtle
    @SubscribeEvent
    public static void conduitPowerWhileWearingTurtleArmor(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        ItemStack chestStack = event.getEntityLiving().getItemBySlot(EquipmentSlot.CHEST);
        ItemStack headstack = event.getEntityLiving().getItemBySlot(EquipmentSlot.HEAD);
        ItemStack footstack = event.getEntityLiving().getItemBySlot(EquipmentSlot.FEET);
        ItemStack legstack = event.getEntityLiving().getItemBySlot(EquipmentSlot.LEGS);
        if (chestStack.getItem() == RegistryHandler.TURTLE_CHESTPLATE.get()) {
            if (headstack.getItem() == RegistryHandler.TURTLE_HELMET.get()) {
                if (footstack.getItem() == RegistryHandler.TURTLE_BOOTS.get()) {
                    if (legstack.getItem() == RegistryHandler.TURTLE_LEGGINS.get()) {
                        player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1000000 * 20, 0));
                        player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 1000000 * 20, 0));
                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100000*20,0));
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void turtleArmorRemoveEfeect(LivingEquipmentChangeEvent event) {
        ItemStack cheststack = event.getEntityLiving().getItemBySlot(EquipmentSlot.CHEST);
        ItemStack headstack = event.getEntityLiving().getItemBySlot(EquipmentSlot.HEAD);
        ItemStack legstack = event.getEntityLiving().getItemBySlot(EquipmentSlot.LEGS);
        ItemStack footstack = event.getEntityLiving().getItemBySlot(EquipmentSlot.FEET);
        LivingEntity player = event.getEntityLiving();
        if (player.hasEffect(MobEffects.CONDUIT_POWER)) {
            if (!cheststack.getItem().equals(RegistryHandler.TURTLE_CHESTPLATE.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
            if (!headstack.getItem().equals(RegistryHandler.TURTLE_HELMET.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);         }

            if (!legstack.getItem().equals(RegistryHandler.TURTLE_LEGGINS.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
            if (!footstack.getItem().equals(RegistryHandler.TURTLE_BOOTS.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
        }
    }

    @SubscribeEvent
    public static void sneakingEffect(TickEvent.PlayerTickEvent event) {
        LivingEntity player = event.player;
        ItemStack chestStack = event.player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack headStack = event.player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack legStack = event.player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack footStack = event.player.getItemBySlot(EquipmentSlot.FEET);

        if (chestStack.getItem() == RegistryHandler.VTURTLE_CHESTPLATE.get()) {
            if (headStack.getItem() == Items.TURTLE_HELMET) {
                if (footStack.getItem() == RegistryHandler.VTURTLE_BOOTS.get()) {
                    if (legStack.getItem() == RegistryHandler.VTURTLE_LEGGINS.get()) {
                        if (player.isCrouching()) {
                            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 3));
                            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 4));
                        }
                        if (!player.isCrouching()) {
                            player.removeEffect(MobEffects.DAMAGE_RESISTANCE);
                            player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
                        }
                    }
                }
            }
        }
    }

    // Fish Hut
    @SubscribeEvent
    public static void luckWhenWearingBucketHatAndUsingFishingRod(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        ItemStack headStack = event.getEntityLiving().getItemBySlot(EquipmentSlot.HEAD);
        if (headStack.getItem() == RegistryHandler.FISH_HELMET.get()) {
            if (event.getEntityLiving().getMainHandItem().getItem() == Items.FISHING_ROD) {
                player.addEffect(new MobEffectInstance(MobEffects.LUCK, 100000000 * 20, 0));
            }
        }
    }

    @SubscribeEvent
    public static void luckWegenhmen(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        ItemStack headStack = event.getEntityLiving().getItemBySlot(EquipmentSlot.HEAD);
        if (player.hasEffect(MobEffects.LUCK)) {
            if (!headStack.getItem().equals(RegistryHandler.FISH_HELMET.get())) {
                if (!player.getMainHandItem().equals(Items.FISHING_ROD)) {
                    player.removeEffect(MobEffects.LUCK);
                }
            }
        }
    }
}

