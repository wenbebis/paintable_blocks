/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paintable_blocks.init;

import paintable_blocks.PaintableBlocksMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PaintableBlocksModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PaintableBlocksMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAINTABLE_BLOCKS_TAB = REGISTRY.register("paintable_blocks_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.paintable_blocks.paintable_blocks_tab")).icon(() -> new ItemStack(PaintableBlocksModItems.PAINT_ROLLER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PaintableBlocksModItems.PAINT_ROLLER.get());
				tabData.accept(PaintableBlocksModItems.GOLDEN_PAINT_ROLLER.get());
				tabData.accept(PaintableBlocksModItems.WOOL_PANELS.get());
				tabData.accept(PaintableBlocksModItems.CONCRETE_PANELS.get());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_OAK_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_SPRUCE_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_BIRCH_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_JUNGLE_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_ACACIA_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_DARK_OAK_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_MANGROVE_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_CHERRY_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_PALE_OAK_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_BAMBOO_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_CRIMSON_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.WOOL_PANELED_WARPED_PLANKS.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.CONCRETE_PANELED_SMOOTH_QUARTZ.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_DIORITE.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.CONCRETE_PANELED_SMOOTH_STONE.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_ANDESITE.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_TUFF.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_DEEPSLATE.get().asItem());
				tabData.accept(PaintableBlocksModBlocks.CONCRETE_PANELED_POLISHED_BLACKSTONE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PaintableBlocksModItems.PAINT_ROLLER.get());
			tabData.accept(PaintableBlocksModItems.GOLDEN_PAINT_ROLLER.get());
		}
	}
}