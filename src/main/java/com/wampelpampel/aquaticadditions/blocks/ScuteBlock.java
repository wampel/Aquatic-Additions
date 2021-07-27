package com.wampelpampel.aquaticadditions.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class ScuteBlock extends Block {


    public ScuteBlock() {
        //super(AbstractBlock.Properties.of(Material.NETHER_WOOD)
        super(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1));
    }


    }
