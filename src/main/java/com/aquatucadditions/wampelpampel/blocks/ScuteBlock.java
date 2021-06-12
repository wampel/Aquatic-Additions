package com.aquatucadditions.wampelpampel.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ScuteBlock extends Block {


    public ScuteBlock() {
        super(AbstractBlock.Properties.of(Material.NETHER_WOOD)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1));
    }


    }
