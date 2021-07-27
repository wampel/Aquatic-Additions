package com.wampelpampel.aquaticadditions.blocks;

import com.wampelpampel.aquaticadditions.AquaticAdditions;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {

        super(block, new Item.Properties().tab(AquaticAdditions.TAB));
    }
}
