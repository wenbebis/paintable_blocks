/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paintable_blocks.init;

import paintable_blocks.block.WoolPaneledWarpedPlanksBlock;
import paintable_blocks.block.WoolPaneledSprucePlanksBlock;
import paintable_blocks.block.WoolPaneledPaleOakPlanksBlock;
import paintable_blocks.block.WoolPaneledOakPlanksBlock;
import paintable_blocks.block.WoolPaneledMangrovePlanksBlock;
import paintable_blocks.block.WoolPaneledJunglePlanksBlock;
import paintable_blocks.block.WoolPaneledDarkOakPlanksBlock;
import paintable_blocks.block.WoolPaneledCrimsonPlanksBlock;
import paintable_blocks.block.WoolPaneledCherryPlanksBlock;
import paintable_blocks.block.WoolPaneledBlockBaseBlock;
import paintable_blocks.block.WoolPaneledBirchPlanksBlock;
import paintable_blocks.block.WoolPaneledBambooPlanksBlock;
import paintable_blocks.block.WoolPaneledAcaciaPlanksBlock;
import paintable_blocks.block.ConcretePaneledSmoothStoneBlock;
import paintable_blocks.block.ConcretePaneledSmoothQuartzBlock;
import paintable_blocks.block.ConcretePaneledPolishedTuffBlock;
import paintable_blocks.block.ConcretePaneledPolishedDioriteBlock;
import paintable_blocks.block.ConcretePaneledPolishedDeepslateBlock;
import paintable_blocks.block.ConcretePaneledPolishedBlackstoneBlock;
import paintable_blocks.block.ConcretePaneledPolishedAndesiteBlock;

import paintable_blocks.PaintableBlocksMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class PaintableBlocksModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PaintableBlocksMod.MODID);
	public static final DeferredBlock<Block> WOOL_PANELED_OAK_PLANKS = register("wool_paneled_oak_planks", WoolPaneledOakPlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_SPRUCE_PLANKS = register("wool_paneled_spruce_planks", WoolPaneledSprucePlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_BIRCH_PLANKS = register("wool_paneled_birch_planks", WoolPaneledBirchPlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_JUNGLE_PLANKS = register("wool_paneled_jungle_planks", WoolPaneledJunglePlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_ACACIA_PLANKS = register("wool_paneled_acacia_planks", WoolPaneledAcaciaPlanksBlock::new);
	public static final DeferredBlock<Block> PAINTABLE_BLOCK_BASE = register("paintable_block_base", WoolPaneledBlockBaseBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_DARK_OAK_PLANKS = register("wool_paneled_dark_oak_planks", WoolPaneledDarkOakPlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_MANGROVE_PLANKS = register("wool_paneled_mangrove_planks", WoolPaneledMangrovePlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_CHERRY_PLANKS = register("wool_paneled_cherry_planks", WoolPaneledCherryPlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_PALE_OAK_PLANKS = register("wool_paneled_pale_oak_planks", WoolPaneledPaleOakPlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_BAMBOO_PLANKS = register("wool_paneled_bamboo_planks", WoolPaneledBambooPlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_CRIMSON_PLANKS = register("wool_paneled_crimson_planks", WoolPaneledCrimsonPlanksBlock::new);
	public static final DeferredBlock<Block> WOOL_PANELED_WARPED_PLANKS = register("wool_paneled_warped_planks", WoolPaneledWarpedPlanksBlock::new);
	public static final DeferredBlock<Block> CONCRETE_PANELED_SMOOTH_QUARTZ = register("concrete_paneled_smooth_quartz", ConcretePaneledSmoothQuartzBlock::new);
	public static final DeferredBlock<Block> CONCRETE_PANELED_POLISHED_DIORITE = register("concrete_paneled_polished_diorite", ConcretePaneledPolishedDioriteBlock::new);
	public static final DeferredBlock<Block> CONCRETE_PANELED_SMOOTH_STONE = register("concrete_paneled_smooth_stone", ConcretePaneledSmoothStoneBlock::new);
	public static final DeferredBlock<Block> CONCRETE_PANELED_POLISHED_ANDESITE = register("concrete_paneled_polished_andesite", ConcretePaneledPolishedAndesiteBlock::new);
	public static final DeferredBlock<Block> CONCRETE_PANELED_POLISHED_TUFF = register("concrete_paneled_polished_tuff", ConcretePaneledPolishedTuffBlock::new);
	public static final DeferredBlock<Block> CONCRETE_PANELED_POLISHED_DEEPSLATE = register("concrete_paneled_polished_deepslate", ConcretePaneledPolishedDeepslateBlock::new);
	public static final DeferredBlock<Block> CONCRETE_PANELED_POLISHED_BLACKSTONE = register("concrete_paneled_polished_blackstone", ConcretePaneledPolishedBlackstoneBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			WoolPaneledOakPlanksBlock.blockColorLoad(event);
			WoolPaneledSprucePlanksBlock.blockColorLoad(event);
			WoolPaneledBirchPlanksBlock.blockColorLoad(event);
			WoolPaneledJunglePlanksBlock.blockColorLoad(event);
			WoolPaneledAcaciaPlanksBlock.blockColorLoad(event);
			WoolPaneledBlockBaseBlock.blockColorLoad(event);
			WoolPaneledDarkOakPlanksBlock.blockColorLoad(event);
			WoolPaneledMangrovePlanksBlock.blockColorLoad(event);
			WoolPaneledCherryPlanksBlock.blockColorLoad(event);
			WoolPaneledPaleOakPlanksBlock.blockColorLoad(event);
			WoolPaneledBambooPlanksBlock.blockColorLoad(event);
			WoolPaneledCrimsonPlanksBlock.blockColorLoad(event);
			WoolPaneledWarpedPlanksBlock.blockColorLoad(event);
			ConcretePaneledSmoothQuartzBlock.blockColorLoad(event);
			ConcretePaneledPolishedDioriteBlock.blockColorLoad(event);
			ConcretePaneledSmoothStoneBlock.blockColorLoad(event);
			ConcretePaneledPolishedAndesiteBlock.blockColorLoad(event);
			ConcretePaneledPolishedTuffBlock.blockColorLoad(event);
			ConcretePaneledPolishedDeepslateBlock.blockColorLoad(event);
			ConcretePaneledPolishedBlackstoneBlock.blockColorLoad(event);
		}
	}
}