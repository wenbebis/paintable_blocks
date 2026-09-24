package paintable_blocks.block;

import paintable_blocks.init.PaintableBlocksModBlocks;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.util.StringRepresentable;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;

import java.util.List;

public class ConcretePaneledSmoothQuartzBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<SidecolorFrontProperty> SIDECOLOR_FRONT = EnumProperty.create("sidecolor_front", SidecolorFrontProperty.class);
	public static final EnumProperty<SidecolorBackProperty> SIDECOLOR_BACK = EnumProperty.create("sidecolor_back", SidecolorBackProperty.class);

	public ConcretePaneledSmoothQuartzBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2f, 6f).isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASEDRUM));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SIDECOLOR_FRONT, SidecolorFrontProperty.WHITE).setValue(SIDECOLOR_BACK, SidecolorBackProperty.WHITE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("block.paintable_blocks.concrete_paneled_smooth_quartz.description_0"));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, SIDECOLOR_FRONT, SIDECOLOR_BACK);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(SIDECOLOR_FRONT, SidecolorFrontProperty.WHITE).setValue(SIDECOLOR_BACK, SidecolorBackProperty.WHITE);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.register((bs, world, pos, index) -> {
			String dye = "";
			if (index == 1) {
				dye = (bs.getBlock().getStateDefinition().getProperty("sidecolor_front") instanceof EnumProperty _getep1 ? bs.getValue(_getep1).toString() : "");
			} else if (index == 2) {
				dye = (bs.getBlock().getStateDefinition().getProperty("sidecolor_back") instanceof EnumProperty _getep1 ? bs.getValue(_getep1).toString() : "");
			} else {
				return 0xFFFFFFFF;
			}

			return DyeColor.valueOf(dye.toUpperCase()).getTextureDiffuseColor();
		}, PaintableBlocksModBlocks.CONCRETE_PANELED_SMOOTH_QUARTZ.get());
	}

	public enum SidecolorFrontProperty implements StringRepresentable {
		BLACK("black"), BLUE("blue"), BROWN("brown"), CYAN("cyan"), GRAY("gray"), GREEN("green"), LIGHT_BLUE("light_blue"), LIGHT_GRAY("light_gray"), LIME("lime"), MAGENTA("magenta"), ORANGE("orange"), PINK("pink"), PURPLE("purple"), RED(
				"red"), WHITE("white"), YELLOW("yellow");

		private final String name;

		private SidecolorFrontProperty(String name) {
			this.name = name;
		}

		@Override
		public String getSerializedName() {
			return this.name;
		}
	}

	public enum SidecolorBackProperty implements StringRepresentable {
		BLACK("black"), BLUE("blue"), BROWN("brown"), CYAN("cyan"), GRAY("gray"), GREEN("green"), LIGHT_BLUE("light_blue"), LIGHT_GRAY("light_gray"), LIME("lime"), MAGENTA("magenta"), ORANGE("orange"), PINK("pink"), PURPLE("purple"), RED(
				"red"), WHITE("white"), YELLOW("yellow");

		private final String name;

		private SidecolorBackProperty(String name) {
			this.name = name;
		}

		@Override
		public String getSerializedName() {
			return this.name;
		}
	}
}