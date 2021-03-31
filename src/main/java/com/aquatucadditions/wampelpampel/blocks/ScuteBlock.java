package com.aquatucadditions.wampelpampel.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ScuteBlock extends Block {


    public ScuteBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
                .hardnessAndResistance(10F,10F))
                ;
    }


    }
