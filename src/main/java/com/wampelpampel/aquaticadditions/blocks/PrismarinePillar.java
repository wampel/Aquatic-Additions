package com.wampelpampel.aquaticadditions.blocks;

/*
public class PrismarinePillar extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
            Block.makeCuboidShape(3, 0, 1, 5, 16, 2),
            Block.makeCuboidShape(1, 0, 3, 2, 16, 4),
            Block.makeCuboidShape(13, 0, 2, 14, 16, 3),
            Block.makeCuboidShape(14, 0, 3, 15, 16, 5),
            Block.makeCuboidShape(5, 0, 15, 11, 16, 16),
            Block.makeCuboidShape(3, 0, 14, 5, 16, 15),
            Block.makeCuboidShape(13, 0, 13, 14, 16, 14),
            Block.makeCuboidShape(14, 0, 11, 15, 16, 12),
            Block.makeCuboidShape(14, 0, 12, 15, 16, 13),
            Block.makeCuboidShape(2, 0, 2, 3, 16, 3),
            Block.makeCuboidShape(11, 0, 14, 13, 16, 15),
            Block.makeCuboidShape(11, 0, 1, 13, 16, 2),
            Block.makeCuboidShape(1, 0, 4, 2, 16, 5),
            Block.makeCuboidShape(0, 0, 5, 1, 16, 11),
            Block.makeCuboidShape(1, 0, 11, 2, 16, 13),
            Block.makeCuboidShape(2, 0, 13, 3, 16, 14),
            Block.makeCuboidShape(5, 0, 0, 11, 16, 1),
            Block.makeCuboidShape(15, 0, 5, 16, 16, 11),
            Block.makeCuboidShape(3, 15, 2, 13, 16, 14),
            Block.makeCuboidShape(1, 15, 5, 2, 16, 11),
            Block.makeCuboidShape(5, 15, 1, 11, 16, 2),
            Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
            Block.makeCuboidShape(3, 0, 2, 13, 1, 14),
            Block.makeCuboidShape(5, 0, 14, 11, 1, 15),
            Block.makeCuboidShape(14, 0, 5, 15, 1, 11),
            Block.makeCuboidShape(13, 0, 3, 14, 1, 13),
            Block.makeCuboidShape(5, 0, 1, 11, 1, 2),
            Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
            Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
            Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
            Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
            Block.makeCuboidShape(13, 15, 3, 14, 16, 13),
            Block.makeCuboidShape(14, 15, 5, 15, 16, 11),
            Block.makeCuboidShape(2, 15, 3, 3, 16, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
                    Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
                    Block.makeCuboidShape(3, 0, 1, 5, 16, 2),
                    Block.makeCuboidShape(1, 0, 3, 2, 16, 4),
                    Block.makeCuboidShape(13, 0, 2, 14, 16, 3),
                    Block.makeCuboidShape(14, 0, 3, 15, 16, 5),
                    Block.makeCuboidShape(5, 0, 15, 11, 16, 16),
                    Block.makeCuboidShape(3, 0, 14, 5, 16, 15),
                    Block.makeCuboidShape(13, 0, 13, 14, 16, 14),
                    Block.makeCuboidShape(14, 0, 11, 15, 16, 12),
                    Block.makeCuboidShape(14, 0, 12, 15, 16, 13),
                    Block.makeCuboidShape(2, 0, 2, 3, 16, 3),
                    Block.makeCuboidShape(11, 0, 14, 13, 16, 15),
                    Block.makeCuboidShape(11, 0, 1, 13, 16, 2),
                    Block.makeCuboidShape(1, 0, 4, 2, 16, 5),
                    Block.makeCuboidShape(0, 0, 5, 1, 16, 11),
                    Block.makeCuboidShape(1, 0, 11, 2, 16, 13),
                    Block.makeCuboidShape(2, 0, 13, 3, 16, 14),
                    Block.makeCuboidShape(5, 0, 0, 11, 16, 1),
                    Block.makeCuboidShape(15, 0, 5, 16, 16, 11),
                    Block.makeCuboidShape(3, 15, 2, 13, 16, 14),
                    Block.makeCuboidShape(1, 15, 5, 2, 16, 11),
                    Block.makeCuboidShape(5, 15, 1, 11, 16, 2),
                    Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
                    Block.makeCuboidShape(3, 0, 2, 13, 1, 14),
                    Block.makeCuboidShape(5, 0, 14, 11, 1, 15),
                    Block.makeCuboidShape(14, 0, 5, 15, 1, 11),
                    Block.makeCuboidShape(13, 0, 3, 14, 1, 13),
                    Block.makeCuboidShape(5, 0, 1, 11, 1, 2),
                    Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
                    Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
                    Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
                    Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
                    Block.makeCuboidShape(13, 15, 3, 14, 16, 13),
                    Block.makeCuboidShape(14, 15, 5, 15, 16, 11),
                    Block.makeCuboidShape(2, 15, 3, 3, 16, 13)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
            Block.makeCuboidShape(3, 0, 1, 5, 16, 2),
            Block.makeCuboidShape(1, 0, 3, 2, 16, 4),
            Block.makeCuboidShape(13, 0, 2, 14, 16, 3),
            Block.makeCuboidShape(14, 0, 3, 15, 16, 5),
            Block.makeCuboidShape(5, 0, 15, 11, 16, 16),
            Block.makeCuboidShape(3, 0, 14, 5, 16, 15),
            Block.makeCuboidShape(13, 0, 13, 14, 16, 14),
            Block.makeCuboidShape(14, 0, 11, 15, 16, 12),
            Block.makeCuboidShape(14, 0, 12, 15, 16, 13),
            Block.makeCuboidShape(2, 0, 2, 3, 16, 3),
            Block.makeCuboidShape(11, 0, 14, 13, 16, 15),
            Block.makeCuboidShape(11, 0, 1, 13, 16, 2),
            Block.makeCuboidShape(1, 0, 4, 2, 16, 5),
            Block.makeCuboidShape(0, 0, 5, 1, 16, 11),
            Block.makeCuboidShape(1, 0, 11, 2, 16, 13),
            Block.makeCuboidShape(2, 0, 13, 3, 16, 14),
            Block.makeCuboidShape(5, 0, 0, 11, 16, 1),
            Block.makeCuboidShape(15, 0, 5, 16, 16, 11),
            Block.makeCuboidShape(3, 15, 2, 13, 16, 14),
            Block.makeCuboidShape(1, 15, 5, 2, 16, 11),
            Block.makeCuboidShape(5, 15, 1, 11, 16, 2),
            Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
            Block.makeCuboidShape(3, 0, 2, 13, 1, 14),
            Block.makeCuboidShape(5, 0, 14, 11, 1, 15),
            Block.makeCuboidShape(14, 0, 5, 15, 1, 11),
            Block.makeCuboidShape(13, 0, 3, 14, 1, 13),
            Block.makeCuboidShape(5, 0, 1, 11, 1, 2),
            Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
            Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
            Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
            Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
            Block.makeCuboidShape(13, 15, 3, 14, 16, 13),
            Block.makeCuboidShape(14, 15, 5, 15, 16, 11),
            Block.makeCuboidShape(2, 15, 3, 3, 16, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
            Block.makeCuboidShape(3, 0, 1, 5, 16, 2),
            Block.makeCuboidShape(1, 0, 3, 2, 16, 4),
            Block.makeCuboidShape(13, 0, 2, 14, 16, 3),
            Block.makeCuboidShape(14, 0, 3, 15, 16, 5),
            Block.makeCuboidShape(5, 0, 15, 11, 16, 16),
            Block.makeCuboidShape(3, 0, 14, 5, 16, 15),
            Block.makeCuboidShape(13, 0, 13, 14, 16, 14),
            Block.makeCuboidShape(14, 0, 11, 15, 16, 12),
            Block.makeCuboidShape(14, 0, 12, 15, 16, 13),
            Block.makeCuboidShape(2, 0, 2, 3, 16, 3),
            Block.makeCuboidShape(11, 0, 14, 13, 16, 15),
            Block.makeCuboidShape(11, 0, 1, 13, 16, 2),
            Block.makeCuboidShape(1, 0, 4, 2, 16, 5),
            Block.makeCuboidShape(0, 0, 5, 1, 16, 11),
            Block.makeCuboidShape(1, 0, 11, 2, 16, 13),
            Block.makeCuboidShape(2, 0, 13, 3, 16, 14),
            Block.makeCuboidShape(5, 0, 0, 11, 16, 1),
            Block.makeCuboidShape(15, 0, 5, 16, 16, 11),
            Block.makeCuboidShape(3, 15, 2, 13, 16, 14),
            Block.makeCuboidShape(1, 15, 5, 2, 16, 11),
            Block.makeCuboidShape(5, 15, 1, 11, 16, 2),
            Block.makeCuboidShape(5, 15, 14, 11, 16, 15),
            Block.makeCuboidShape(3, 0, 2, 13, 1, 14),
            Block.makeCuboidShape(5, 0, 14, 11, 1, 15),
            Block.makeCuboidShape(14, 0, 5, 15, 1, 11),
            Block.makeCuboidShape(13, 0, 3, 14, 1, 13),
            Block.makeCuboidShape(5, 0, 1, 11, 1, 2),
            Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
            Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
            Block.makeCuboidShape(2, 0, 3, 3, 1, 13),
            Block.makeCuboidShape(1, 0, 5, 2, 1, 11),
            Block.makeCuboidShape(13, 15, 3, 14, 16, 13),
            Block.makeCuboidShape(14, 15, 5, 15, 16, 11),
            Block.makeCuboidShape(2, 15, 3, 3, 16, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();



    public PrismarinePillar() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3F, 3F)
                .harvestLevel(1));

    }
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            case SOUTH:
                return SHAPE_S;
            default:
                return SHAPE_N;
        }
    }
    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING,rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6f;
    }
}

 */
