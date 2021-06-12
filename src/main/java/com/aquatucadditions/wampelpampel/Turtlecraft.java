package com.aquatucadditions.wampelpampel;

import com.aquatucadditions.wampelpampel.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("aq")
public class Turtlecraft {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "aq";

    public Turtlecraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    //TAB
    public static final ItemGroup TAB = new ItemGroup("aquatic") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.TURTLE_CHESTPLATE.get());
        }


        //@Override
        //public ItemStack createIcon() { return new ItemStack(RegistryHandler.TURTLE_CHESTPLATE.get()); }
    };
}