/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paintable_blocks.init;

import paintable_blocks.item.WoolPanelsItem;
import paintable_blocks.item.PaintRollerItem;
import paintable_blocks.item.GoldenPaintRollerItem;
import paintable_blocks.item.ConcretePanelsItem;

import paintable_blocks.PaintableBlocksMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

public class PaintableBlocksModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PaintableBlocksMod.MODID);
	public static final DeferredItem<Item> PAINT_ROLLER = register("paint_roller", PaintRollerItem::new);
	public static final DeferredItem<Item> WOOL_PANELED_OAK_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_OAK_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_SPRUCE_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_SPRUCE_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_BIRCH_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_BIRCH_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_JUNGLE_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_JUNGLE_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_ACACIA_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_ACACIA_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_DARK_OAK_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_DARK_OAK_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_MANGROVE_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_MANGROVE_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_CHERRY_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_CHERRY_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_PALE_OAK_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_PALE_OAK_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_BAMBOO_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_BAMBOO_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_CRIMSON_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_CRIMSON_PLANKS);
	public static final DeferredItem<Item> WOOL_PANELED_WARPED_PLANKS = block(PaintableBlocksModBlocks.WOOL_PANELED_WARPED_PLANKS);
	public static final DeferredItem<Item> CONCRETE_PANELED_SMOOTH_QUARTZ = block(PaintableBlocksModBlocks.CONCRETE_PANELED_SMOOTH_QUARTZ);
	public static final DeferredItem<Item> CONCRETE_PANELED_POLISHED_DIORITE = block(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_DIORITE);
	public static final DeferredItem<Item> CONCRETE_PANELED_SMOOTH_STONE = block(PaintableBlocksModBlocks.CONCRETE_PANELED_SMOOTH_STONE);
	public static final DeferredItem<Item> CONCRETE_PANELED_POLISHED_ANDESITE = block(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_ANDESITE);
	public static final DeferredItem<Item> CONCRETE_PANELED_POLISHED_TUFF = block(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_TUFF);
	public static final DeferredItem<Item> CONCRETE_PANELED_POLISHED_DEEPSLATE = block(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_DEEPSLATE);
	public static final DeferredItem<Item> CONCRETE_PANELED_POLISHED_BLACKSTONE = block(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_BLACKSTONE);
	public static final DeferredItem<Item> WOOL_PANELS = register("wool_panels", WoolPanelsItem::new);
	public static final DeferredItem<Item> CONCRETE_PANELS = register("concrete_panels", ConcretePanelsItem::new);
	public static final DeferredItem<Item> GOLDEN_PAINT_ROLLER = register("golden_paint_roller", GoldenPaintRollerItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}