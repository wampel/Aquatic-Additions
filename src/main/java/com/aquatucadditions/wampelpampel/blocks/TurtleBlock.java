package com.aquatucadditions.wampelpampel.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TurtleBlock extends Block {

    public TurtleBlock() {

        super(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0f, 1.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}