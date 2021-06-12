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
import org.antlr.v4.runtime.LexerNoViableAltException;

@Mod.EventBusSubscriber(modid = Turtlecraft.MOD_ID, bus= Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
    //Schwert
    @SubscribeEvent
    public static void boxer(AttackEntityEvent event) {
        if (event.getEntityLiving().getMainHandItem().getItem() == RegistryHandler.TURTLE_SWORD.get()) {
            if (event.getTarget().isAlive()) {

                PlayerEntity player = event.getPlayer();
                LivingEntity target = (LivingEntity) event.getTarget();

                target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 3 * 20, 1));
            }
        }
    }


    //Turtle
    @SubscribeEvent
    public static void conduitPowerWhileWearingTurtleArmor(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        ItemStack chestStack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.CHEST);
        ItemStack headstack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.HEAD);
        ItemStack footstack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.FEET);
        ItemStack legstack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.LEGS);
        if (chestStack.getItem() == RegistryHandler.TURTLE_CHESTPLATE.get()) {
            if (headstack.getItem() == RegistryHandler.TURTLE_HELMET.get()) {
                if (footstack.getItem() == RegistryHandler.TURTLE_BOOTS.get()) {
                    if (legstack.getItem() == RegistryHandler.TURTLE_LEGGINS.get()) {
                        player.addEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 1000000 * 20, 0));
                        player.addEffect(new EffectInstance(Effects.CONDUIT_POWER, 1000000 * 20, 0));
                        player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 100000*20,0));
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void turtleArmorRemoveEfeect(LivingEquipmentChangeEvent event) {
        ItemStack cheststack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.CHEST);
        ItemStack headstack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.HEAD);
        ItemStack legstack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.LEGS);
        ItemStack footstack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.FEET);
        LivingEntity player = event.getEntityLiving();
        if (player.hasEffect(Effects.CONDUIT_POWER)) {
            if (!cheststack.getItem().equals(RegistryHandler.TURTLE_CHESTPLATE.get())) {
                player.removeEffect(Effects.CONDUIT_POWER);
                player.removeEffect(Effects.DOLPHINS_GRACE);
                player.removeEffect(Effects.MOVEMENT_SLOWDOWN);
            }
            if (!headstack.getItem().equals(RegistryHandler.TURTLE_HELMET.get())) {
                player.removeEffect(Effects.CONDUIT_POWER);
                player.removeEffect(Effects.DOLPHINS_GRACE);
                player.removeEffect(Effects.MOVEMENT_SLOWDOWN);         }
            if (!legstack.getItem().equals(RegistryHandler.TURTLE_LEGGINS.get())) {
                player.removeEffect(Effects.CONDUIT_POWER);
                player.removeEffect(Effects.DOLPHINS_GRACE);
                player.removeEffect(Effects.MOVEMENT_SLOWDOWN);
            }
            if (!footstack.getItem().equals(RegistryHandler.TURTLE_BOOTS.get())) {
                player.removeEffect(Effects.CONDUIT_POWER);
                player.removeEffect(Effects.DOLPHINS_GRACE);
                player.removeEffect(Effects.MOVEMENT_SLOWDOWN);
            }
        }
    }

    @SubscribeEvent
    public static void sneakingEffect(TickEvent.PlayerTickEvent event) {
        LivingEntity player = event.player;
        ItemStack chestStack = event.player.getItemBySlot(EquipmentSlotType.CHEST);
        ItemStack headStack = event.player.getItemBySlot(EquipmentSlotType.HEAD);
        ItemStack legStack = event.player.getItemBySlot(EquipmentSlotType.LEGS);
        ItemStack footStack = event.player.getItemBySlot(EquipmentSlotType.FEET);

        if (chestStack.getItem() == RegistryHandler.VTURTLE_CHESTPLATE.get()) {
            if (headStack.getItem() == Items.TURTLE_HELMET) {
                if (footStack.getItem() == RegistryHandler.VTURTLE_BOOTS.get()) {
                    if (legStack.getItem() == RegistryHandler.VTURTLE_LEGGINS.get()) {
                        if (player.isCrouching()) {
                            player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 1, 3));
                            player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1, 4));
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
        ItemStack headStack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.HEAD);
        if (headStack.getItem() == RegistryHandler.FISH_HELMET.get()) {
            if (event.getEntityLiving().getMainHandItem().getItem() == Items.FISHING_ROD) {
                player.addEffect(new EffectInstance(Effects.LUCK, 100000000 * 20, 0));
            }
        }
    }

    @SubscribeEvent
    public static void luckWegenhmen(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        ItemStack headStack = event.getEntityLiving().getItemBySlot(EquipmentSlotType.HEAD);
        if (player.hasEffect(Effects.LUCK)) {
            if (!headStack.getItem().equals(RegistryHandler.FISH_HELMET.get())) {
                if (!player.getMainHandItem().equals(Items.FISHING_ROD)) {
                    player.removeEffect(Effects.LUCK);
                }
            }
        }
    }
}

