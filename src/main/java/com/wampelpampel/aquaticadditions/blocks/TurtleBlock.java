package com.wampelpampel.aquaticadditions.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class TurtleBlock extends Block {

    public TurtleBlock() {

        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}