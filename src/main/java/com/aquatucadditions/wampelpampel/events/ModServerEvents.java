package com.aquatucadditions.wampelpampel.events;

import com.aquatucadditions.wampelpampel.Turtlecraft;
import com.aquatucadditions.wampelpampel.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Turtlecraft.MOD_ID, bus= Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class ModServerEvents {

    //Schwert
    @SubscribeEvent
    public static void boxer(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == RegistryHandler.TURTLE_SWORD.get()) {
            if (event.getTarget().isAlive()) {

                PlayerEntity player = event.getPlayer();
                LivingEntity target = (LivingEntity) event.getTarget();

                target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 3 * 20, 1));
            }
        }
    }


    //Turtle
    @SubscribeEvent
    public static void conduitPowerWhileWearingTurtleArmor(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        ItemStack chestStack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.CHEST);
        ItemStack headstack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.HEAD);
        ItemStack footstack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.FEET);
        ItemStack legstack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.LEGS);
        if (chestStack.getItem() == RegistryHandler.TURTLE_CHESTPLATE.get()) {
            if (headstack.getItem() == RegistryHandler.TURTLE_HELMET.get()) {
                if (footstack.getItem() == RegistryHandler.TURTLE_BOOTS.get()) {
                    if (legstack.getItem() == RegistryHandler.TURTLE_LEGGINS.get()) {
                        player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 1000000 * 20, 0));
                        player.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 1000000 * 20, 0));
                        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100000*20,0));
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void turtleArmorRemoveEfeect(LivingEquipmentChangeEvent event) {
        ItemStack cheststack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.CHEST);
        ItemStack headstack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.HEAD);
        ItemStack legstack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.LEGS);
        ItemStack footstack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.FEET);
        LivingEntity player = event.getEntityLiving();
        if (player.isPotionActive(Effects.CONDUIT_POWER)) {
            if (!cheststack.getItem().equals(RegistryHandler.TURTLE_CHESTPLATE.get())) {
                player.clearActivePotions();
            }
            if (!headstack.getItem().equals(RegistryHandler.TURTLE_HELMET.get())) {
                player.clearActivePotions();
            }
            if (!legstack.getItem().equals(RegistryHandler.TURTLE_LEGGINS.get())) {
                player.clearActivePotions();
            }
            if (!footstack.getItem().equals(RegistryHandler.TURTLE_BOOTS.get())) {
                player.clearActivePotions();
            }
        }
    }

    @SubscribeEvent
    public static void sneakingEffect(TickEvent.PlayerTickEvent event) {
        LivingEntity player = event.player;
        float playerHeight = event.player.getHeight();
        ItemStack chestStack = event.player.getItemStackFromSlot(EquipmentSlotType.CHEST);
        ItemStack headStack = event.player.getItemStackFromSlot(EquipmentSlotType.HEAD);
        ItemStack legStack = event.player.getItemStackFromSlot(EquipmentSlotType.LEGS);
        ItemStack footStack = event.player.getItemStackFromSlot(EquipmentSlotType.FEET);

        if (chestStack.getItem() == RegistryHandler.VTURTLE_CHESTPLATE.get()) {
            if (headStack.getItem() == Items.TURTLE_HELMET) {
                if (footStack.getItem() == RegistryHandler.VTURTLE_BOOTS.get()) {
                    if (legStack.getItem() == RegistryHandler.VTURTLE_LEGGINS.get()) {
                        if (playerHeight == 1.5) {
                            player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 1, 3));
                            player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 1, 4));
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
        ItemStack headStack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.HEAD);
        if (headStack.getItem() == RegistryHandler.FISH_HELMET.get()) {
            if (event.getEntityLiving().getHeldItemMainhand().getItem() == Items.FISHING_ROD) {
                player.addPotionEffect(new EffectInstance(Effects.LUCK, 100000000 * 20, 0));
            }
        }
    }

    @SubscribeEvent
    public static void luckWegenhmen(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        ItemStack headStack = event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.HEAD);
        if (player.isPotionActive(Effects.LUCK)) {
            if (!headStack.getItem().equals(RegistryHandler.FISH_HELMET.get())) {
                if (!player.getHeldItemMainhand().equals(Items.FISHING_ROD)) {
                    player.clearActivePotions();
                }
            }
        }
    }
}