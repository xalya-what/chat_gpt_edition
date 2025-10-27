
package net.mcreator.chatgptedition.enchantment;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class InstakillEnchantment extends Enchantment {
	public InstakillEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 64000;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 1000;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench == Enchantments.ALL_DAMAGE_PROTECTION || ench == Enchantments.FIRE_PROTECTION || ench == Enchantments.FALL_PROTECTION
				|| ench == Enchantments.BLAST_PROTECTION || ench == Enchantments.PROJECTILE_PROTECTION || ench == Enchantments.RESPIRATION
				|| ench == Enchantments.AQUA_AFFINITY || ench == Enchantments.THORNS || ench == Enchantments.DEPTH_STRIDER
				|| ench == Enchantments.FROST_WALKER || ench == Enchantments.BINDING_CURSE || ench == Enchantments.SHARPNESS
				|| ench == Enchantments.SMITE || ench == Enchantments.BANE_OF_ARTHROPODS || ench == Enchantments.KNOCKBACK
				|| ench == Enchantments.FIRE_ASPECT || ench == Enchantments.MOB_LOOTING || ench == Enchantments.SWEEPING_EDGE
				|| ench == Enchantments.BLOCK_EFFICIENCY || ench == Enchantments.SILK_TOUCH || ench == Enchantments.UNBREAKING
				|| ench == Enchantments.BLOCK_FORTUNE || ench == Enchantments.POWER_ARROWS || ench == Enchantments.PUNCH_ARROWS
				|| ench == Enchantments.FLAMING_ARROWS || ench == Enchantments.INFINITY_ARROWS || ench == Enchantments.FISHING_LUCK
				|| ench == Enchantments.FISHING_SPEED || ench == Enchantments.LOYALTY || ench == Enchantments.IMPALING || ench == Enchantments.RIPTIDE
				|| ench == Enchantments.CHANNELING || ench == Enchantments.MULTISHOT || ench == Enchantments.QUICK_CHARGE
				|| ench == Enchantments.PIERCING || ench == Enchantments.MENDING || ench == Enchantments.VANISHING_CURSE
				|| ench == Enchantments.SOUL_SPEED;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return item == Blocks.AIR.asItem() || item == Blocks.VOID_AIR.asItem() || item == Blocks.CAVE_AIR.asItem() || item == Blocks.STONE.asItem()
				|| item == Blocks.STONE_STAIRS.asItem() || item == Blocks.STONE_SLAB.asItem() || item == Blocks.GRANITE.asItem()
				|| item == Blocks.POLISHED_GRANITE.asItem() || item == Blocks.GRANITE_STAIRS.asItem()
				|| item == Blocks.POLISHED_GRANITE_STAIRS.asItem() || item == Blocks.GRANITE_SLAB.asItem()
				|| item == Blocks.POLISHED_GRANITE_SLAB.asItem() || item == Blocks.GRANITE_WALL.asItem() || item == Blocks.DIORITE.asItem()
				|| item == Blocks.DIORITE_STAIRS.asItem() || item == Blocks.DIORITE_SLAB.asItem() || item == Blocks.DIORITE_WALL.asItem()
				|| item == Blocks.POLISHED_DIORITE.asItem() || item == Blocks.POLISHED_DIORITE_SLAB.asItem()
				|| item == Blocks.POLISHED_DIORITE_STAIRS.asItem() || item == Blocks.ANDESITE.asItem() || item == Blocks.ANDESITE_STAIRS.asItem()
				|| item == Blocks.ANDESITE_SLAB.asItem() || item == Blocks.ANDESITE_WALL.asItem() || item == Blocks.POLISHED_ANDESITE.asItem()
				|| item == Blocks.POLISHED_ANDESITE_STAIRS.asItem() || item == Blocks.POLISHED_ANDESITE_SLAB.asItem()
				|| item == Blocks.SMOOTH_STONE.asItem() || item == Blocks.DEEPSLATE.asItem() || item == Blocks.COBBLED_DEEPSLATE.asItem()
				|| item == Blocks.COBBLED_DEEPSLATE_STAIRS.asItem() || item == Blocks.COBBLED_DEEPSLATE_SLAB.asItem()
				|| item == Blocks.COBBLED_DEEPSLATE_WALL.asItem() || item == Blocks.POLISHED_DEEPSLATE.asItem()
				|| item == Blocks.POLISHED_DEEPSLATE_STAIRS.asItem() || item == Blocks.POLISHED_DEEPSLATE_SLAB.asItem()
				|| item == Blocks.POLISHED_DEEPSLATE_WALL.asItem() || item == Blocks.DEEPSLATE_TILES.asItem()
				|| item == Blocks.DEEPSLATE_TILE_STAIRS.asItem() || item == Blocks.DEEPSLATE_TILE_SLAB.asItem()
				|| item == Blocks.DEEPSLATE_TILE_WALL.asItem() || item == Blocks.DEEPSLATE_BRICKS.asItem()
				|| item == Blocks.DEEPSLATE_BRICK_STAIRS.asItem() || item == Blocks.DEEPSLATE_BRICK_SLAB.asItem()
				|| item == Blocks.DEEPSLATE_BRICK_WALL.asItem() || item == Blocks.CHISELED_DEEPSLATE.asItem()
				|| item == Blocks.CRACKED_DEEPSLATE_BRICKS.asItem() || item == Blocks.CRACKED_DEEPSLATE_TILES.asItem() || item == Blocks.TUFF.asItem()
				|| item == Blocks.CALCITE.asItem() || item == Blocks.DRIPSTONE_BLOCK.asItem() || item == Blocks.POINTED_DRIPSTONE.asItem()
				|| item == Blocks.GRASS_BLOCK.asItem() || item == Blocks.DIRT_PATH.asItem() || item == Blocks.MYCELIUM.asItem()
				|| item == Blocks.DIRT.asItem() || item == Blocks.COARSE_DIRT.asItem() || item == Blocks.PODZOL.asItem()
				|| item == Blocks.ROOTED_DIRT.asItem() || item == Blocks.COBBLESTONE.asItem() || item == Blocks.MOSSY_COBBLESTONE.asItem()
				|| item == Blocks.MOSSY_COBBLESTONE_STAIRS.asItem() || item == Blocks.MOSSY_COBBLESTONE_SLAB.asItem()
				|| item == Blocks.MOSS_BLOCK.asItem() || item == Blocks.MOSS_CARPET.asItem() || item == Blocks.OAK_PLANKS.asItem()
				|| item == Blocks.SPRUCE_PLANKS.asItem() || item == Blocks.BIRCH_PLANKS.asItem() || item == Blocks.JUNGLE_PLANKS.asItem()
				|| item == Blocks.ACACIA_PLANKS.asItem() || item == Blocks.DARK_OAK_PLANKS.asItem() || item == Blocks.CRIMSON_PLANKS.asItem()
				|| item == Blocks.WARPED_PLANKS.asItem() || item == Blocks.OAK_SAPLING.asItem() || item == Blocks.SPRUCE_SAPLING.asItem()
				|| item == Blocks.BIRCH_SAPLING.asItem() || item == Blocks.JUNGLE_SAPLING.asItem() || item == Blocks.ACACIA_SAPLING.asItem()
				|| item == Blocks.DARK_OAK_SAPLING.asItem() || item == Blocks.SUGAR_CANE.asItem() || item == Blocks.BEDROCK.asItem()
				|| item == Blocks.SAND.asItem() || item == Blocks.RED_SAND.asItem() || item == Blocks.GRAVEL.asItem() || item == Blocks.WATER.asItem()
				|| item == Blocks.WATER.asItem() || item == Blocks.BUBBLE_COLUMN.asItem() || item == Blocks.LAVA.asItem()
				|| item == Blocks.LAVA.asItem() || item == Blocks.MAGMA_BLOCK.asItem() || item == Blocks.OBSIDIAN.asItem()
				|| item == Blocks.CRYING_OBSIDIAN.asItem() || item == Blocks.BLACKSTONE.asItem() || item == Blocks.BLACKSTONE_STAIRS.asItem()
				|| item == Blocks.BLACKSTONE_WALL.asItem() || item == Blocks.BLACKSTONE_SLAB.asItem() || item == Blocks.POLISHED_BLACKSTONE.asItem()
				|| item == Blocks.POLISHED_BLACKSTONE_BRICKS.asItem() || item == Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.asItem()
				|| item == Blocks.CHISELED_POLISHED_BLACKSTONE.asItem() || item == Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.asItem()
				|| item == Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.asItem() || item == Blocks.POLISHED_BLACKSTONE_BRICK_WALL.asItem()
				|| item == Blocks.POLISHED_BLACKSTONE_STAIRS.asItem() || item == Blocks.POLISHED_BLACKSTONE_SLAB.asItem()
				|| item == Blocks.POLISHED_BLACKSTONE_WALL.asItem() || item == Blocks.COAL_ORE.asItem() || item == Blocks.IRON_ORE.asItem()
				|| item == Blocks.REDSTONE_ORE.asItem() || item == Blocks.REDSTONE_ORE.asItem() || item == Blocks.GOLD_ORE.asItem()
				|| item == Blocks.LAPIS_ORE.asItem() || item == Blocks.DIAMOND_ORE.asItem() || item == Blocks.EMERALD_ORE.asItem()
				|| item == Blocks.COPPER_ORE.asItem() || item == Blocks.DEEPSLATE_COAL_ORE.asItem() || item == Blocks.DEEPSLATE_IRON_ORE.asItem()
				|| item == Blocks.DEEPSLATE_REDSTONE_ORE.asItem() || item == Blocks.DEEPSLATE_GOLD_ORE.asItem()
				|| item == Blocks.DEEPSLATE_LAPIS_ORE.asItem() || item == Blocks.DEEPSLATE_DIAMOND_ORE.asItem()
				|| item == Blocks.DEEPSLATE_EMERALD_ORE.asItem() || item == Blocks.DEEPSLATE_COPPER_ORE.asItem()
				|| item == Blocks.NETHER_QUARTZ_ORE.asItem() || item == Blocks.NETHER_GOLD_ORE.asItem() || item == Blocks.GILDED_BLACKSTONE.asItem()
				|| item == Blocks.RAW_IRON_BLOCK.asItem() || item == Blocks.RAW_GOLD_BLOCK.asItem() || item == Blocks.RAW_COPPER_BLOCK.asItem()
				|| item == Blocks.COAL_BLOCK.asItem() || item == Blocks.IRON_BLOCK.asItem() || item == Blocks.COPPER_BLOCK.asItem()
				|| item == Blocks.EXPOSED_COPPER.asItem() || item == Blocks.WEATHERED_COPPER.asItem() || item == Blocks.OXIDIZED_COPPER.asItem()
				|| item == Blocks.CUT_COPPER.asItem() || item == Blocks.EXPOSED_CUT_COPPER.asItem() || item == Blocks.WEATHERED_CUT_COPPER.asItem()
				|| item == Blocks.OXIDIZED_CUT_COPPER.asItem() || item == Blocks.CUT_COPPER_STAIRS.asItem()
				|| item == Blocks.EXPOSED_CUT_COPPER_STAIRS.asItem() || item == Blocks.WEATHERED_CUT_COPPER_STAIRS.asItem()
				|| item == Blocks.OXIDIZED_CUT_COPPER_STAIRS.asItem() || item == Blocks.CUT_COPPER_SLAB.asItem()
				|| item == Blocks.EXPOSED_CUT_COPPER_SLAB.asItem() || item == Blocks.WEATHERED_CUT_COPPER_SLAB.asItem()
				|| item == Blocks.OXIDIZED_CUT_COPPER_SLAB.asItem() || item == Blocks.WAXED_COPPER_BLOCK.asItem()
				|| item == Blocks.WAXED_EXPOSED_COPPER.asItem() || item == Blocks.WAXED_WEATHERED_COPPER.asItem()
				|| item == Blocks.WAXED_OXIDIZED_COPPER.asItem() || item == Blocks.WAXED_CUT_COPPER.asItem()
				|| item == Blocks.WAXED_EXPOSED_CUT_COPPER.asItem() || item == Blocks.WAXED_WEATHERED_CUT_COPPER.asItem()
				|| item == Blocks.WAXED_OXIDIZED_CUT_COPPER.asItem() || item == Blocks.WAXED_CUT_COPPER_STAIRS.asItem()
				|| item == Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS.asItem() || item == Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS.asItem()
				|| item == Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS.asItem() || item == Blocks.WAXED_CUT_COPPER_SLAB.asItem()
				|| item == Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB.asItem() || item == Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB.asItem()
				|| item == Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem() || item == Blocks.REDSTONE_BLOCK.asItem()
				|| item == Blocks.GOLD_BLOCK.asItem() || item == Blocks.LAPIS_BLOCK.asItem() || item == Blocks.DIAMOND_BLOCK.asItem()
				|| item == Blocks.EMERALD_BLOCK.asItem() || item == Blocks.NETHERITE_BLOCK.asItem() || item == Blocks.SMOOTH_QUARTZ.asItem()
				|| item == Blocks.CHISELED_QUARTZ_BLOCK.asItem() || item == Blocks.QUARTZ_PILLAR.asItem() || item == Blocks.QUARTZ_BLOCK.asItem()
				|| item == Blocks.QUARTZ_BRICKS.asItem() || item == Blocks.SMOOTH_QUARTZ_STAIRS.asItem() || item == Blocks.SMOOTH_QUARTZ_SLAB.asItem()
				|| item == Blocks.SLIME_BLOCK.asItem() || item == Blocks.ANCIENT_DEBRIS.asItem() || item == Blocks.AMETHYST_BLOCK.asItem()
				|| item == Blocks.BUDDING_AMETHYST.asItem() || item == Blocks.AMETHYST_CLUSTER.asItem() || item == Blocks.LARGE_AMETHYST_BUD.asItem()
				|| item == Blocks.MEDIUM_AMETHYST_BUD.asItem() || item == Blocks.SMALL_AMETHYST_BUD.asItem() || item == Blocks.OAK_LOG.asItem()
				|| item == Blocks.OAK_LOG.asItem() || item == Blocks.SPRUCE_LOG.asItem() || item == Blocks.BIRCH_LOG.asItem()
				|| item == Blocks.JUNGLE_LOG.asItem() || item == Blocks.ACACIA_LOG.asItem() || item == Blocks.ACACIA_LOG.asItem()
				|| item == Blocks.DARK_OAK_LOG.asItem() || item == Blocks.WARPED_STEM.asItem() || item == Blocks.CRIMSON_STEM.asItem()
				|| item == Blocks.STRIPPED_OAK_LOG.asItem() || item == Blocks.STRIPPED_SPRUCE_LOG.asItem()
				|| item == Blocks.STRIPPED_BIRCH_LOG.asItem() || item == Blocks.STRIPPED_JUNGLE_LOG.asItem()
				|| item == Blocks.STRIPPED_ACACIA_LOG.asItem() || item == Blocks.STRIPPED_DARK_OAK_LOG.asItem()
				|| item == Blocks.STRIPPED_WARPED_STEM.asItem() || item == Blocks.STRIPPED_CRIMSON_STEM.asItem() || item == Blocks.OAK_WOOD.asItem()
				|| item == Blocks.SPRUCE_WOOD.asItem() || item == Blocks.BIRCH_WOOD.asItem() || item == Blocks.JUNGLE_WOOD.asItem()
				|| item == Blocks.ACACIA_WOOD.asItem() || item == Blocks.DARK_OAK_WOOD.asItem() || item == Blocks.WARPED_HYPHAE.asItem()
				|| item == Blocks.CRIMSON_HYPHAE.asItem() || item == Blocks.STRIPPED_OAK_WOOD.asItem() || item == Blocks.STRIPPED_SPRUCE_WOOD.asItem()
				|| item == Blocks.STRIPPED_BIRCH_WOOD.asItem() || item == Blocks.STRIPPED_JUNGLE_WOOD.asItem()
				|| item == Blocks.STRIPPED_ACACIA_WOOD.asItem() || item == Blocks.STRIPPED_DARK_OAK_WOOD.asItem()
				|| item == Blocks.STRIPPED_WARPED_HYPHAE.asItem() || item == Blocks.STRIPPED_CRIMSON_HYPHAE.asItem()
				|| item == Blocks.OAK_LEAVES.asItem() || item == Blocks.OAK_LEAVES.asItem() || item == Blocks.SPRUCE_LEAVES.asItem()
				|| item == Blocks.BIRCH_LEAVES.asItem() || item == Blocks.JUNGLE_LEAVES.asItem() || item == Blocks.ACACIA_LEAVES.asItem()
				|| item == Blocks.ACACIA_LEAVES.asItem() || item == Blocks.DARK_OAK_LEAVES.asItem() || item == Blocks.AZALEA_LEAVES.asItem()
				|| item == Blocks.FLOWERING_AZALEA_LEAVES.asItem() || item == Blocks.SPONGE.asItem() || item == Blocks.WET_SPONGE.asItem()
				|| item == Blocks.SANDSTONE.asItem() || item == Blocks.CHISELED_SANDSTONE.asItem() || item == Blocks.CUT_SANDSTONE.asItem()
				|| item == Blocks.SANDSTONE_STAIRS.asItem() || item == Blocks.SMOOTH_SANDSTONE.asItem()
				|| item == Blocks.SMOOTH_SANDSTONE_STAIRS.asItem() || item == Blocks.SMOOTH_SANDSTONE_SLAB.asItem()
				|| item == Blocks.CUT_SANDSTONE_SLAB.asItem() || item == Blocks.SANDSTONE_WALL.asItem() || item == Blocks.RED_SANDSTONE.asItem()
				|| item == Blocks.CHISELED_RED_SANDSTONE.asItem() || item == Blocks.CUT_RED_SANDSTONE.asItem()
				|| item == Blocks.RED_SANDSTONE_STAIRS.asItem() || item == Blocks.SMOOTH_RED_SANDSTONE.asItem()
				|| item == Blocks.SMOOTH_RED_SANDSTONE_STAIRS.asItem() || item == Blocks.SMOOTH_RED_SANDSTONE_SLAB.asItem()
				|| item == Blocks.CUT_RED_SANDSTONE_SLAB.asItem() || item == Blocks.RED_SANDSTONE_WALL.asItem() || item == Blocks.NOTE_BLOCK.asItem()
				|| item == Blocks.RAIL.asItem() || item == Blocks.POWERED_RAIL.asItem() || item == Blocks.DETECTOR_RAIL.asItem()
				|| item == Blocks.ACTIVATOR_RAIL.asItem() || item == Blocks.WHITE_BED.asItem() || item == Blocks.ORANGE_BED.asItem()
				|| item == Blocks.MAGENTA_BED.asItem() || item == Blocks.LIGHT_BLUE_BED.asItem() || item == Blocks.YELLOW_BED.asItem()
				|| item == Blocks.LIME_BED.asItem() || item == Blocks.PINK_BED.asItem() || item == Blocks.GRAY_BED.asItem()
				|| item == Blocks.LIGHT_GRAY_BED.asItem() || item == Blocks.CYAN_BED.asItem() || item == Blocks.PURPLE_BED.asItem()
				|| item == Blocks.BLUE_BED.asItem() || item == Blocks.BROWN_BED.asItem() || item == Blocks.GREEN_BED.asItem()
				|| item == Blocks.RED_BED.asItem() || item == Blocks.BLACK_BED.asItem() || item == Blocks.COBWEB.asItem()
				|| item == Blocks.DEAD_BUSH.asItem() || item == Blocks.GRASS.asItem() || item == Blocks.DEAD_BUSH.asItem()
				|| item == Blocks.GRASS.asItem() || item == Blocks.FERN.asItem() || item == Blocks.PISTON.asItem()
				|| item == Blocks.STICKY_PISTON.asItem() || item == Blocks.PISTON_HEAD.asItem() || item == Blocks.MOVING_PISTON.asItem()
				|| item == Blocks.DANDELION.asItem() || item == Blocks.POPPY.asItem() || item == Blocks.BLUE_ORCHID.asItem()
				|| item == Blocks.ALLIUM.asItem() || item == Blocks.AZURE_BLUET.asItem() || item == Blocks.RED_TULIP.asItem()
				|| item == Blocks.ORANGE_TULIP.asItem() || item == Blocks.WHITE_TULIP.asItem() || item == Blocks.PINK_TULIP.asItem()
				|| item == Blocks.OXEYE_DAISY.asItem() || item == Blocks.CORNFLOWER.asItem() || item == Blocks.LILY_OF_THE_VALLEY.asItem()
				|| item == Blocks.WITHER_ROSE.asItem() || item == Blocks.SUNFLOWER.asItem() || item == Blocks.LILAC.asItem()
				|| item == Blocks.TALL_GRASS.asItem() || item == Blocks.LARGE_FERN.asItem() || item == Blocks.ROSE_BUSH.asItem()
				|| item == Blocks.PEONY.asItem() || item == Blocks.BROWN_MUSHROOM.asItem() || item == Blocks.RED_MUSHROOM.asItem()
				|| item == Blocks.WARPED_FUNGUS.asItem() || item == Blocks.CRIMSON_FUNGUS.asItem() || item == Blocks.BROWN_MUSHROOM_BLOCK.asItem()
				|| item == Blocks.RED_MUSHROOM_BLOCK.asItem() || item == Blocks.WARPED_WART_BLOCK.asItem() || item == Blocks.MUSHROOM_STEM.asItem()
				|| item == Blocks.BRICKS.asItem() || item == Blocks.BRICK_WALL.asItem() || item == Blocks.TNT.asItem()
				|| item == Blocks.BOOKSHELF.asItem() || item == Blocks.TORCH.asItem() || item == Blocks.WALL_TORCH.asItem()
				|| item == Blocks.SOUL_TORCH.asItem() || item == Blocks.SOUL_WALL_TORCH.asItem() || item == Blocks.FIRE.asItem()
				|| item == Blocks.SOUL_FIRE.asItem() || item == Blocks.LANTERN.asItem() || item == Blocks.SOUL_LANTERN.asItem()
				|| item == Blocks.CHAIN.asItem() || item == Blocks.CAMPFIRE.asItem() || item == Blocks.SOUL_CAMPFIRE.asItem()
				|| item == Blocks.CANDLE.asItem() || item == Blocks.WHITE_CANDLE.asItem() || item == Blocks.ORANGE_CANDLE.asItem()
				|| item == Blocks.MAGENTA_CANDLE.asItem() || item == Blocks.LIGHT_BLUE_CANDLE.asItem() || item == Blocks.YELLOW_CANDLE.asItem()
				|| item == Blocks.LIME_CANDLE.asItem() || item == Blocks.PINK_CANDLE.asItem() || item == Blocks.GRAY_CANDLE.asItem()
				|| item == Blocks.LIGHT_GRAY_CANDLE.asItem() || item == Blocks.CYAN_CANDLE.asItem() || item == Blocks.PURPLE_CANDLE.asItem()
				|| item == Blocks.BLUE_CANDLE.asItem() || item == Blocks.BROWN_CANDLE.asItem() || item == Blocks.GREEN_CANDLE.asItem()
				|| item == Blocks.RED_CANDLE.asItem() || item == Blocks.BLACK_CANDLE.asItem() || item == Blocks.LIGHT.asItem()
				|| item == Blocks.SPAWNER.asItem() || item == Blocks.OAK_STAIRS.asItem() || item == Blocks.SPRUCE_STAIRS.asItem()
				|| item == Blocks.BIRCH_STAIRS.asItem() || item == Blocks.JUNGLE_STAIRS.asItem() || item == Blocks.ACACIA_STAIRS.asItem()
				|| item == Blocks.DARK_OAK_STAIRS.asItem() || item == Blocks.CRIMSON_STAIRS.asItem() || item == Blocks.WARPED_STAIRS.asItem()
				|| item == Blocks.COBBLESTONE_STAIRS.asItem() || item == Blocks.BRICK_STAIRS.asItem() || item == Blocks.STONE_BRICK_STAIRS.asItem()
				|| item == Blocks.NETHER_BRICK_STAIRS.asItem() || item == Blocks.QUARTZ_STAIRS.asItem() || item == Blocks.PURPUR_STAIRS.asItem()
				|| item == Blocks.CHEST.asItem() || item == Blocks.TRAPPED_CHEST.asItem() || item == Blocks.ENDER_CHEST.asItem()
				|| item == Blocks.CRAFTING_TABLE.asItem() || item == Blocks.WHEAT.asItem() || item == Blocks.FARMLAND.asItem()
				|| item == Blocks.FURNACE.asItem() || item == Blocks.OAK_SIGN.asItem() || item == Blocks.SPRUCE_SIGN.asItem()
				|| item == Blocks.BIRCH_SIGN.asItem() || item == Blocks.ACACIA_SIGN.asItem() || item == Blocks.JUNGLE_SIGN.asItem()
				|| item == Blocks.DARK_OAK_SIGN.asItem() || item == Blocks.CRIMSON_SIGN.asItem() || item == Blocks.WARPED_SIGN.asItem()
				|| item == Blocks.OAK_WALL_SIGN.asItem() || item == Blocks.SPRUCE_WALL_SIGN.asItem() || item == Blocks.BIRCH_WALL_SIGN.asItem()
				|| item == Blocks.ACACIA_WALL_SIGN.asItem() || item == Blocks.JUNGLE_WALL_SIGN.asItem() || item == Blocks.DARK_OAK_WALL_SIGN.asItem()
				|| item == Blocks.CRIMSON_WALL_SIGN.asItem() || item == Blocks.WARPED_WALL_SIGN.asItem() || item == Blocks.OAK_DOOR.asItem()
				|| item == Blocks.SPRUCE_DOOR.asItem() || item == Blocks.BIRCH_DOOR.asItem() || item == Blocks.JUNGLE_DOOR.asItem()
				|| item == Blocks.ACACIA_DOOR.asItem() || item == Blocks.DARK_OAK_DOOR.asItem() || item == Blocks.CRIMSON_DOOR.asItem()
				|| item == Blocks.WARPED_DOOR.asItem() || item == Blocks.IRON_DOOR.asItem() || item == Blocks.OAK_TRAPDOOR.asItem()
				|| item == Blocks.SPRUCE_TRAPDOOR.asItem() || item == Blocks.BIRCH_TRAPDOOR.asItem() || item == Blocks.JUNGLE_TRAPDOOR.asItem()
				|| item == Blocks.ACACIA_TRAPDOOR.asItem() || item == Blocks.DARK_OAK_TRAPDOOR.asItem() || item == Blocks.CRIMSON_TRAPDOOR.asItem()
				|| item == Blocks.WARPED_TRAPDOOR.asItem() || item == Blocks.IRON_TRAPDOOR.asItem() || item == Blocks.LADDER.asItem()
				|| item == Blocks.LEVER.asItem() || item == Blocks.STONE_BUTTON.asItem() || item == Blocks.POLISHED_BLACKSTONE_BUTTON.asItem()
				|| item == Blocks.OAK_BUTTON.asItem() || item == Blocks.SPRUCE_BUTTON.asItem() || item == Blocks.BIRCH_BUTTON.asItem()
				|| item == Blocks.JUNGLE_BUTTON.asItem() || item == Blocks.ACACIA_BUTTON.asItem() || item == Blocks.DARK_OAK_BUTTON.asItem()
				|| item == Blocks.CRIMSON_BUTTON.asItem() || item == Blocks.WARPED_BUTTON.asItem() || item == Blocks.OAK_PRESSURE_PLATE.asItem()
				|| item == Blocks.SPRUCE_PRESSURE_PLATE.asItem() || item == Blocks.BIRCH_PRESSURE_PLATE.asItem()
				|| item == Blocks.JUNGLE_PRESSURE_PLATE.asItem() || item == Blocks.ACACIA_PRESSURE_PLATE.asItem()
				|| item == Blocks.DARK_OAK_PRESSURE_PLATE.asItem() || item == Blocks.CRIMSON_PRESSURE_PLATE.asItem()
				|| item == Blocks.WARPED_PRESSURE_PLATE.asItem() || item == Blocks.STONE_PRESSURE_PLATE.asItem()
				|| item == Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE.asItem() || item == Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE.asItem()
				|| item == Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE.asItem() || item == Blocks.TRIPWIRE_HOOK.asItem() || item == Blocks.TRIPWIRE.asItem()
				|| item == Blocks.DAYLIGHT_DETECTOR.asItem() || item == Blocks.DAYLIGHT_DETECTOR.asItem() || item == Blocks.REDSTONE_TORCH.asItem()
				|| item == Blocks.REDSTONE_WALL_TORCH.asItem() || item == Blocks.REDSTONE_TORCH.asItem() || item == Blocks.REDSTONE_WIRE.asItem()
				|| item == Blocks.REPEATER.asItem() || item == Blocks.REPEATER.asItem() || item == Blocks.COMPARATOR.asItem()
				|| item == Blocks.COMPARATOR.asItem() || item == Blocks.REDSTONE_LAMP.asItem() || item == Blocks.REDSTONE_LAMP.asItem()
				|| item == Blocks.DISPENSER.asItem() || item == Blocks.DROPPER.asItem() || item == Blocks.OBSERVER.asItem()
				|| item == Blocks.HOPPER.asItem() || item == Blocks.TARGET.asItem() || item == Blocks.LIGHTNING_ROD.asItem()
				|| item == Blocks.SCULK_SENSOR.asItem() || item == Blocks.COMMAND_BLOCK.asItem() || item == Blocks.REPEATING_COMMAND_BLOCK.asItem()
				|| item == Blocks.CHAIN_COMMAND_BLOCK.asItem() || item == Blocks.SNOW.asItem() || item == Blocks.SNOW_BLOCK.asItem()
				|| item == Blocks.POWDER_SNOW.asItem() || item == Blocks.ICE.asItem() || item == Blocks.PACKED_ICE.asItem()
				|| item == Blocks.FROSTED_ICE.asItem() || item == Blocks.BLUE_ICE.asItem() || item == Blocks.CACTUS.asItem()
				|| item == Blocks.CLAY.asItem() || item == Blocks.JUKEBOX.asItem() || item == Blocks.OAK_FENCE.asItem()
				|| item == Blocks.SPRUCE_FENCE.asItem() || item == Blocks.BIRCH_FENCE.asItem() || item == Blocks.JUNGLE_FENCE.asItem()
				|| item == Blocks.ACACIA_FENCE.asItem() || item == Blocks.DARK_OAK_FENCE.asItem() || item == Blocks.CRIMSON_FENCE.asItem()
				|| item == Blocks.WARPED_FENCE.asItem() || item == Blocks.OAK_FENCE_GATE.asItem() || item == Blocks.SPRUCE_FENCE_GATE.asItem()
				|| item == Blocks.BIRCH_FENCE_GATE.asItem() || item == Blocks.JUNGLE_FENCE_GATE.asItem() || item == Blocks.ACACIA_FENCE_GATE.asItem()
				|| item == Blocks.DARK_OAK_FENCE_GATE.asItem() || item == Blocks.CRIMSON_FENCE_GATE.asItem()
				|| item == Blocks.WARPED_FENCE_GATE.asItem() || item == Blocks.NETHER_BRICK_FENCE.asItem() || item == Blocks.NETHER_BRICKS.asItem()
				|| item == Blocks.CHISELED_NETHER_BRICKS.asItem() || item == Blocks.CRACKED_NETHER_BRICKS.asItem()
				|| item == Blocks.RED_NETHER_BRICKS.asItem() || item == Blocks.NETHER_BRICK_WALL.asItem()
				|| item == Blocks.RED_NETHER_BRICK_STAIRS.asItem() || item == Blocks.RED_NETHER_BRICK_SLAB.asItem()
				|| item == Blocks.RED_NETHER_BRICK_WALL.asItem() || item == Blocks.NETHERRACK.asItem() || item == Blocks.WARPED_NYLIUM.asItem()
				|| item == Blocks.CRIMSON_NYLIUM.asItem() || item == Blocks.SOUL_SAND.asItem() || item == Blocks.SOUL_SOIL.asItem()
				|| item == Blocks.GLOWSTONE.asItem() || item == Blocks.SHROOMLIGHT.asItem() || item == Blocks.BONE_BLOCK.asItem()
				|| item == Blocks.NETHER_WART.asItem() || item == Blocks.NETHER_WART_BLOCK.asItem() || item == Blocks.CAKE.asItem()
				|| item == Blocks.STONE_BRICKS.asItem() || item == Blocks.STONE_BRICK_WALL.asItem() || item == Blocks.MOSSY_STONE_BRICKS.asItem()
				|| item == Blocks.MOSSY_STONE_BRICK_STAIRS.asItem() || item == Blocks.MOSSY_STONE_BRICK_SLAB.asItem()
				|| item == Blocks.MOSSY_STONE_BRICK_WALL.asItem() || item == Blocks.CRACKED_STONE_BRICKS.asItem()
				|| item == Blocks.CHISELED_STONE_BRICKS.asItem() || item == Blocks.IRON_BARS.asItem() || item == Blocks.MELON.asItem()
				|| item == Blocks.MELON_STEM.asItem() || item == Blocks.ATTACHED_MELON_STEM.asItem() || item == Blocks.PUMPKIN.asItem()
				|| item == Blocks.CARVED_PUMPKIN.asItem() || item == Blocks.JACK_O_LANTERN.asItem() || item == Blocks.PUMPKIN_STEM.asItem()
				|| item == Blocks.ATTACHED_PUMPKIN_STEM.asItem() || item == Blocks.SWEET_BERRY_BUSH.asItem() || item == Blocks.VINE.asItem()
				|| item == Blocks.GLOW_LICHEN.asItem() || item == Blocks.LILY_PAD.asItem() || item == Blocks.ENCHANTING_TABLE.asItem()
				|| item == Blocks.BREWING_STAND.asItem() || item == Blocks.CAULDRON.asItem() || item == Blocks.WATER_CAULDRON.asItem()
				|| item == Blocks.LAVA_CAULDRON.asItem() || item == Blocks.POWDER_SNOW_CAULDRON.asItem() || item == Blocks.END_PORTAL.asItem()
				|| item == Blocks.END_PORTAL_FRAME.asItem() || item == Blocks.END_GATEWAY.asItem() || item == Blocks.END_STONE.asItem()
				|| item == Blocks.END_STONE_BRICKS.asItem() || item == Blocks.END_STONE_BRICK_STAIRS.asItem()
				|| item == Blocks.END_STONE_BRICK_SLAB.asItem() || item == Blocks.END_STONE_BRICK_WALL.asItem() || item == Blocks.END_ROD.asItem()
				|| item == Blocks.PURPUR_BLOCK.asItem() || item == Blocks.PURPUR_PILLAR.asItem() || item == Blocks.PURPUR_SLAB.asItem()
				|| item == Blocks.PURPUR_SLAB.asItem() || item == Blocks.BEETROOTS.asItem() || item == Blocks.CHORUS_PLANT.asItem()
				|| item == Blocks.CHORUS_FLOWER.asItem() || item == Blocks.DRAGON_EGG.asItem() || item == Blocks.INFESTED_STONE.asItem()
				|| item == Blocks.INFESTED_COBBLESTONE.asItem() || item == Blocks.INFESTED_STONE_BRICKS.asItem()
				|| item == Blocks.INFESTED_MOSSY_STONE_BRICKS.asItem() || item == Blocks.INFESTED_CRACKED_STONE_BRICKS.asItem()
				|| item == Blocks.INFESTED_CHISELED_STONE_BRICKS.asItem() || item == Blocks.INFESTED_DEEPSLATE.asItem()
				|| item == Blocks.OAK_SLAB.asItem() || item == Blocks.SPRUCE_SLAB.asItem() || item == Blocks.BIRCH_SLAB.asItem()
				|| item == Blocks.JUNGLE_SLAB.asItem() || item == Blocks.ACACIA_SLAB.asItem() || item == Blocks.DARK_OAK_SLAB.asItem()
				|| item == Blocks.CRIMSON_SLAB.asItem() || item == Blocks.WARPED_SLAB.asItem() || item == Blocks.SMOOTH_STONE_SLAB.asItem()
				|| item == Blocks.SANDSTONE_SLAB.asItem() || item == Blocks.PETRIFIED_OAK_SLAB.asItem() || item == Blocks.COBBLESTONE_SLAB.asItem()
				|| item == Blocks.BRICK_SLAB.asItem() || item == Blocks.STONE_BRICK_SLAB.asItem() || item == Blocks.NETHER_BRICK_SLAB.asItem()
				|| item == Blocks.QUARTZ_SLAB.asItem() || item == Blocks.RED_SANDSTONE_SLAB.asItem() || item == Blocks.COCOA.asItem()
				|| item == Blocks.NETHER_PORTAL.asItem() || item == Blocks.ANVIL.asItem() || item == Blocks.CHIPPED_ANVIL.asItem()
				|| item == Blocks.DAMAGED_ANVIL.asItem() || item == Blocks.BEACON.asItem() || item == Blocks.COBBLESTONE_WALL.asItem()
				|| item == Blocks.MOSSY_COBBLESTONE_WALL.asItem() || item == Blocks.FLOWER_POT.asItem() || item == Blocks.POTTED_OAK_SAPLING.asItem()
				|| item == Blocks.POTTED_SPRUCE_SAPLING.asItem() || item == Blocks.POTTED_BIRCH_SAPLING.asItem()
				|| item == Blocks.POTTED_JUNGLE_SAPLING.asItem() || item == Blocks.POTTED_ACACIA_SAPLING.asItem()
				|| item == Blocks.POTTED_DARK_OAK_SAPLING.asItem() || item == Blocks.POTTED_FERN.asItem() || item == Blocks.POTTED_DANDELION.asItem()
				|| item == Blocks.POTTED_POPPY.asItem() || item == Blocks.POTTED_BLUE_ORCHID.asItem() || item == Blocks.POTTED_ALLIUM.asItem()
				|| item == Blocks.POTTED_AZURE_BLUET.asItem() || item == Blocks.POTTED_RED_TULIP.asItem()
				|| item == Blocks.POTTED_ORANGE_TULIP.asItem() || item == Blocks.POTTED_WHITE_TULIP.asItem()
				|| item == Blocks.POTTED_PINK_TULIP.asItem() || item == Blocks.POTTED_OXEYE_DAISY.asItem()
				|| item == Blocks.POTTED_CORNFLOWER.asItem() || item == Blocks.POTTED_LILY_OF_THE_VALLEY.asItem()
				|| item == Blocks.POTTED_WITHER_ROSE.asItem() || item == Blocks.POTTED_RED_MUSHROOM.asItem()
				|| item == Blocks.POTTED_BROWN_MUSHROOM.asItem() || item == Blocks.POTTED_DEAD_BUSH.asItem() || item == Blocks.POTTED_CACTUS.asItem()
				|| item == Blocks.POTTED_BAMBOO.asItem() || item == Blocks.POTTED_CRIMSON_FUNGUS.asItem()
				|| item == Blocks.POTTED_WARPED_FUNGUS.asItem() || item == Blocks.POTTED_CRIMSON_ROOTS.asItem()
				|| item == Blocks.POTTED_WARPED_ROOTS.asItem() || item == Blocks.POTTED_AZALEA.asItem()
				|| item == Blocks.POTTED_FLOWERING_AZALEA.asItem() || item == Blocks.CARROTS.asItem() || item == Blocks.POTATOES.asItem()
				|| item == Blocks.HAY_BLOCK.asItem() || item == Blocks.SKELETON_SKULL.asItem() || item == Blocks.WITHER_SKELETON_SKULL.asItem()
				|| item == Blocks.ZOMBIE_HEAD.asItem() || item == Blocks.PLAYER_HEAD.asItem() || item == Blocks.CREEPER_HEAD.asItem()
				|| item == Blocks.DRAGON_HEAD.asItem() || item == Blocks.SKELETON_WALL_SKULL.asItem()
				|| item == Blocks.WITHER_SKELETON_WALL_SKULL.asItem() || item == Blocks.ZOMBIE_WALL_HEAD.asItem()
				|| item == Blocks.PLAYER_WALL_HEAD.asItem() || item == Blocks.CREEPER_WALL_HEAD.asItem() || item == Blocks.DRAGON_WALL_HEAD.asItem()
				|| item == Blocks.WHITE_WOOL.asItem() || item == Blocks.ORANGE_WOOL.asItem() || item == Blocks.MAGENTA_WOOL.asItem()
				|| item == Blocks.LIGHT_BLUE_WOOL.asItem() || item == Blocks.YELLOW_WOOL.asItem() || item == Blocks.LIME_WOOL.asItem()
				|| item == Blocks.PINK_WOOL.asItem() || item == Blocks.GRAY_WOOL.asItem() || item == Blocks.LIGHT_GRAY_WOOL.asItem()
				|| item == Blocks.CYAN_WOOL.asItem() || item == Blocks.PURPLE_WOOL.asItem() || item == Blocks.BLUE_WOOL.asItem()
				|| item == Blocks.BROWN_WOOL.asItem() || item == Blocks.GREEN_WOOL.asItem() || item == Blocks.RED_WOOL.asItem()
				|| item == Blocks.BLACK_WOOL.asItem() || item == Blocks.TERRACOTTA.asItem() || item == Blocks.WHITE_TERRACOTTA.asItem()
				|| item == Blocks.ORANGE_TERRACOTTA.asItem() || item == Blocks.MAGENTA_TERRACOTTA.asItem()
				|| item == Blocks.LIGHT_BLUE_TERRACOTTA.asItem() || item == Blocks.YELLOW_TERRACOTTA.asItem()
				|| item == Blocks.LIME_TERRACOTTA.asItem() || item == Blocks.PINK_TERRACOTTA.asItem() || item == Blocks.GRAY_TERRACOTTA.asItem()
				|| item == Blocks.LIGHT_GRAY_TERRACOTTA.asItem() || item == Blocks.CYAN_TERRACOTTA.asItem()
				|| item == Blocks.PURPLE_TERRACOTTA.asItem() || item == Blocks.BLUE_TERRACOTTA.asItem() || item == Blocks.BROWN_TERRACOTTA.asItem()
				|| item == Blocks.GREEN_TERRACOTTA.asItem() || item == Blocks.RED_TERRACOTTA.asItem() || item == Blocks.BLACK_TERRACOTTA.asItem()
				|| item == Blocks.WHITE_GLAZED_TERRACOTTA.asItem() || item == Blocks.ORANGE_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.MAGENTA_GLAZED_TERRACOTTA.asItem() || item == Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.YELLOW_GLAZED_TERRACOTTA.asItem() || item == Blocks.LIME_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.PINK_GLAZED_TERRACOTTA.asItem() || item == Blocks.GRAY_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.asItem() || item == Blocks.CYAN_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.PURPLE_GLAZED_TERRACOTTA.asItem() || item == Blocks.BLUE_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.BROWN_GLAZED_TERRACOTTA.asItem() || item == Blocks.GREEN_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.RED_GLAZED_TERRACOTTA.asItem() || item == Blocks.BLACK_GLAZED_TERRACOTTA.asItem()
				|| item == Blocks.WHITE_CONCRETE_POWDER.asItem() || item == Blocks.ORANGE_CONCRETE_POWDER.asItem()
				|| item == Blocks.MAGENTA_CONCRETE_POWDER.asItem() || item == Blocks.LIGHT_BLUE_CONCRETE_POWDER.asItem()
				|| item == Blocks.YELLOW_CONCRETE_POWDER.asItem() || item == Blocks.LIME_CONCRETE_POWDER.asItem()
				|| item == Blocks.PINK_CONCRETE_POWDER.asItem() || item == Blocks.GRAY_CONCRETE_POWDER.asItem()
				|| item == Blocks.LIGHT_GRAY_CONCRETE_POWDER.asItem() || item == Blocks.CYAN_CONCRETE_POWDER.asItem()
				|| item == Blocks.PURPLE_CONCRETE_POWDER.asItem() || item == Blocks.BLUE_CONCRETE_POWDER.asItem()
				|| item == Blocks.BROWN_CONCRETE_POWDER.asItem() || item == Blocks.GREEN_CONCRETE_POWDER.asItem()
				|| item == Blocks.RED_CONCRETE_POWDER.asItem() || item == Blocks.BLACK_CONCRETE_POWDER.asItem()
				|| item == Blocks.WHITE_CONCRETE.asItem() || item == Blocks.ORANGE_CONCRETE.asItem() || item == Blocks.MAGENTA_CONCRETE.asItem()
				|| item == Blocks.LIGHT_BLUE_CONCRETE.asItem() || item == Blocks.YELLOW_CONCRETE.asItem() || item == Blocks.LIME_CONCRETE.asItem()
				|| item == Blocks.PINK_CONCRETE.asItem() || item == Blocks.GRAY_CONCRETE.asItem() || item == Blocks.LIGHT_GRAY_CONCRETE.asItem()
				|| item == Blocks.CYAN_CONCRETE.asItem() || item == Blocks.PURPLE_CONCRETE.asItem() || item == Blocks.BLUE_CONCRETE.asItem()
				|| item == Blocks.BROWN_CONCRETE.asItem() || item == Blocks.GREEN_CONCRETE.asItem() || item == Blocks.RED_CONCRETE.asItem()
				|| item == Blocks.BLACK_CONCRETE.asItem() || item == Blocks.WHITE_CARPET.asItem() || item == Blocks.ORANGE_CARPET.asItem()
				|| item == Blocks.MAGENTA_CARPET.asItem() || item == Blocks.LIGHT_BLUE_CARPET.asItem() || item == Blocks.YELLOW_CARPET.asItem()
				|| item == Blocks.LIME_CARPET.asItem() || item == Blocks.PINK_CARPET.asItem() || item == Blocks.GRAY_CARPET.asItem()
				|| item == Blocks.LIGHT_GRAY_CARPET.asItem() || item == Blocks.CYAN_CARPET.asItem() || item == Blocks.PURPLE_CARPET.asItem()
				|| item == Blocks.BLUE_CARPET.asItem() || item == Blocks.BROWN_CARPET.asItem() || item == Blocks.GREEN_CARPET.asItem()
				|| item == Blocks.RED_CARPET.asItem() || item == Blocks.BLACK_CARPET.asItem() || item == Blocks.GLASS.asItem()
				|| item == Blocks.TINTED_GLASS.asItem() || item == Blocks.WHITE_STAINED_GLASS.asItem() || item == Blocks.ORANGE_STAINED_GLASS.asItem()
				|| item == Blocks.MAGENTA_STAINED_GLASS.asItem() || item == Blocks.LIGHT_BLUE_STAINED_GLASS.asItem()
				|| item == Blocks.YELLOW_STAINED_GLASS.asItem() || item == Blocks.LIME_STAINED_GLASS.asItem()
				|| item == Blocks.PINK_STAINED_GLASS.asItem() || item == Blocks.GRAY_STAINED_GLASS.asItem()
				|| item == Blocks.LIGHT_GRAY_STAINED_GLASS.asItem() || item == Blocks.CYAN_STAINED_GLASS.asItem()
				|| item == Blocks.PURPLE_STAINED_GLASS.asItem() || item == Blocks.BLUE_STAINED_GLASS.asItem()
				|| item == Blocks.BROWN_STAINED_GLASS.asItem() || item == Blocks.GREEN_STAINED_GLASS.asItem()
				|| item == Blocks.RED_STAINED_GLASS.asItem() || item == Blocks.BLACK_STAINED_GLASS.asItem() || item == Blocks.GLASS_PANE.asItem()
				|| item == Blocks.WHITE_STAINED_GLASS_PANE.asItem() || item == Blocks.ORANGE_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.MAGENTA_STAINED_GLASS_PANE.asItem() || item == Blocks.LIGHT_BLUE_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.YELLOW_STAINED_GLASS_PANE.asItem() || item == Blocks.LIME_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.PINK_STAINED_GLASS_PANE.asItem() || item == Blocks.GRAY_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.LIGHT_GRAY_STAINED_GLASS_PANE.asItem() || item == Blocks.CYAN_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.PURPLE_STAINED_GLASS_PANE.asItem() || item == Blocks.BLUE_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.BROWN_STAINED_GLASS_PANE.asItem() || item == Blocks.GREEN_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.RED_STAINED_GLASS_PANE.asItem() || item == Blocks.BLACK_STAINED_GLASS_PANE.asItem()
				|| item == Blocks.SEA_LANTERN.asItem() || item == Blocks.PRISMARINE.asItem() || item == Blocks.PRISMARINE_BRICKS.asItem()
				|| item == Blocks.DARK_PRISMARINE.asItem() || item == Blocks.PRISMARINE_STAIRS.asItem()
				|| item == Blocks.PRISMARINE_BRICK_STAIRS.asItem() || item == Blocks.DARK_PRISMARINE_STAIRS.asItem()
				|| item == Blocks.PRISMARINE_SLAB.asItem() || item == Blocks.PRISMARINE_BRICK_SLAB.asItem()
				|| item == Blocks.DARK_PRISMARINE_SLAB.asItem() || item == Blocks.PRISMARINE_WALL.asItem() || item == Blocks.SHULKER_BOX.asItem()
				|| item == Blocks.WHITE_SHULKER_BOX.asItem() || item == Blocks.ORANGE_SHULKER_BOX.asItem()
				|| item == Blocks.MAGENTA_SHULKER_BOX.asItem() || item == Blocks.LIGHT_BLUE_SHULKER_BOX.asItem()
				|| item == Blocks.YELLOW_SHULKER_BOX.asItem() || item == Blocks.LIME_SHULKER_BOX.asItem() || item == Blocks.PINK_SHULKER_BOX.asItem()
				|| item == Blocks.GRAY_SHULKER_BOX.asItem() || item == Blocks.LIGHT_GRAY_SHULKER_BOX.asItem()
				|| item == Blocks.CYAN_SHULKER_BOX.asItem() || item == Blocks.PURPLE_SHULKER_BOX.asItem() || item == Blocks.BLUE_SHULKER_BOX.asItem()
				|| item == Blocks.BROWN_SHULKER_BOX.asItem() || item == Blocks.GREEN_SHULKER_BOX.asItem() || item == Blocks.RED_SHULKER_BOX.asItem()
				|| item == Blocks.BLACK_SHULKER_BOX.asItem() || item == Blocks.WHITE_BANNER.asItem() || item == Blocks.WHITE_BANNER.asItem()
				|| item == Blocks.ORANGE_BANNER.asItem() || item == Blocks.MAGENTA_BANNER.asItem() || item == Blocks.LIGHT_BLUE_BANNER.asItem()
				|| item == Blocks.YELLOW_BANNER.asItem() || item == Blocks.LIME_BANNER.asItem() || item == Blocks.PINK_BANNER.asItem()
				|| item == Blocks.GRAY_BANNER.asItem() || item == Blocks.LIGHT_GRAY_BANNER.asItem() || item == Blocks.CYAN_BANNER.asItem()
				|| item == Blocks.PURPLE_BANNER.asItem() || item == Blocks.BLUE_BANNER.asItem() || item == Blocks.BROWN_BANNER.asItem()
				|| item == Blocks.GREEN_BANNER.asItem() || item == Blocks.RED_BANNER.asItem() || item == Blocks.BLACK_BANNER.asItem()
				|| item == Blocks.WHITE_WALL_BANNER.asItem() || item == Blocks.WHITE_WALL_BANNER.asItem()
				|| item == Blocks.ORANGE_WALL_BANNER.asItem() || item == Blocks.MAGENTA_WALL_BANNER.asItem()
				|| item == Blocks.LIGHT_BLUE_WALL_BANNER.asItem() || item == Blocks.YELLOW_WALL_BANNER.asItem()
				|| item == Blocks.LIME_WALL_BANNER.asItem() || item == Blocks.PINK_WALL_BANNER.asItem() || item == Blocks.GRAY_WALL_BANNER.asItem()
				|| item == Blocks.LIGHT_GRAY_WALL_BANNER.asItem() || item == Blocks.CYAN_WALL_BANNER.asItem()
				|| item == Blocks.PURPLE_WALL_BANNER.asItem() || item == Blocks.BLUE_WALL_BANNER.asItem() || item == Blocks.BROWN_WALL_BANNER.asItem()
				|| item == Blocks.GREEN_WALL_BANNER.asItem() || item == Blocks.RED_WALL_BANNER.asItem() || item == Blocks.BLACK_WALL_BANNER.asItem()
				|| item == Blocks.BARRIER.asItem() || item == Blocks.STRUCTURE_VOID.asItem() || item == Blocks.STRUCTURE_BLOCK.asItem()
				|| item == Blocks.STRUCTURE_BLOCK.asItem() || item == Blocks.STRUCTURE_BLOCK.asItem() || item == Blocks.STRUCTURE_BLOCK.asItem()
				|| item == Blocks.STRUCTURE_BLOCK.asItem() || item == Blocks.JIGSAW.asItem() || item == Blocks.KELP.asItem()
				|| item == Blocks.KELP_PLANT.asItem() || item == Blocks.SEAGRASS.asItem() || item == Blocks.TALL_SEAGRASS.asItem()
				|| item == Blocks.SEA_PICKLE.asItem() || item == Blocks.TURTLE_EGG.asItem() || item == Blocks.BAMBOO_SAPLING.asItem()
				|| item == Blocks.BAMBOO.asItem() || item == Blocks.DEAD_TUBE_CORAL_BLOCK.asItem() || item == Blocks.DEAD_BRAIN_CORAL_BLOCK.asItem()
				|| item == Blocks.DEAD_BUBBLE_CORAL_BLOCK.asItem() || item == Blocks.DEAD_FIRE_CORAL_BLOCK.asItem()
				|| item == Blocks.DEAD_HORN_CORAL_BLOCK.asItem() || item == Blocks.TUBE_CORAL_BLOCK.asItem()
				|| item == Blocks.BRAIN_CORAL_BLOCK.asItem() || item == Blocks.BUBBLE_CORAL_BLOCK.asItem() || item == Blocks.FIRE_CORAL_BLOCK.asItem()
				|| item == Blocks.HORN_CORAL_BLOCK.asItem() || item == Blocks.DEAD_TUBE_CORAL.asItem() || item == Blocks.DEAD_BRAIN_CORAL.asItem()
				|| item == Blocks.DEAD_BUBBLE_CORAL.asItem() || item == Blocks.DEAD_FIRE_CORAL.asItem() || item == Blocks.DEAD_HORN_CORAL.asItem()
				|| item == Blocks.TUBE_CORAL.asItem() || item == Blocks.BRAIN_CORAL.asItem() || item == Blocks.BUBBLE_CORAL.asItem()
				|| item == Blocks.FIRE_CORAL.asItem() || item == Blocks.HORN_CORAL.asItem() || item == Blocks.DEAD_TUBE_CORAL_FAN.asItem()
				|| item == Blocks.DEAD_BRAIN_CORAL_FAN.asItem() || item == Blocks.DEAD_BUBBLE_CORAL_FAN.asItem()
				|| item == Blocks.DEAD_FIRE_CORAL_FAN.asItem() || item == Blocks.DEAD_HORN_CORAL_FAN.asItem()
				|| item == Blocks.TUBE_CORAL_FAN.asItem() || item == Blocks.BRAIN_CORAL_FAN.asItem() || item == Blocks.BUBBLE_CORAL_FAN.asItem()
				|| item == Blocks.FIRE_CORAL_FAN.asItem() || item == Blocks.HORN_CORAL_FAN.asItem()
				|| item == Blocks.DEAD_TUBE_CORAL_WALL_FAN.asItem() || item == Blocks.DEAD_BRAIN_CORAL_WALL_FAN.asItem()
				|| item == Blocks.DEAD_BUBBLE_CORAL_WALL_FAN.asItem() || item == Blocks.DEAD_FIRE_CORAL_WALL_FAN.asItem()
				|| item == Blocks.DEAD_HORN_CORAL_WALL_FAN.asItem() || item == Blocks.TUBE_CORAL_WALL_FAN.asItem()
				|| item == Blocks.BRAIN_CORAL_WALL_FAN.asItem() || item == Blocks.BUBBLE_CORAL_WALL_FAN.asItem()
				|| item == Blocks.FIRE_CORAL_WALL_FAN.asItem() || item == Blocks.HORN_CORAL_WALL_FAN.asItem()
				|| item == Blocks.DRIED_KELP_BLOCK.asItem() || item == Blocks.CONDUIT.asItem() || item == Blocks.SCAFFOLDING.asItem()
				|| item == Blocks.BELL.asItem() || item == Blocks.LOOM.asItem() || item == Blocks.BARREL.asItem() || item == Blocks.SMOKER.asItem()
				|| item == Blocks.BLAST_FURNACE.asItem() || item == Blocks.CARTOGRAPHY_TABLE.asItem() || item == Blocks.FLETCHING_TABLE.asItem()
				|| item == Blocks.GRINDSTONE.asItem() || item == Blocks.LECTERN.asItem() || item == Blocks.SMITHING_TABLE.asItem()
				|| item == Blocks.STONECUTTER.asItem() || item == Blocks.COMPOSTER.asItem() || item == Blocks.BEEHIVE.asItem()
				|| item == Blocks.BEE_NEST.asItem() || item == Blocks.HONEY_BLOCK.asItem() || item == Blocks.HONEYCOMB_BLOCK.asItem()
				|| item == Blocks.BASALT.asItem() || item == Blocks.POLISHED_BASALT.asItem() || item == Blocks.SMOOTH_BASALT.asItem()
				|| item == Blocks.WARPED_ROOTS.asItem() || item == Blocks.NETHER_SPROUTS.asItem() || item == Blocks.WEEPING_VINES.asItem()
				|| item == Blocks.WEEPING_VINES_PLANT.asItem() || item == Blocks.TWISTING_VINES.asItem()
				|| item == Blocks.TWISTING_VINES_PLANT.asItem() || item == Blocks.CRIMSON_ROOTS.asItem() || item == Blocks.RESPAWN_ANCHOR.asItem()
				|| item == Blocks.LODESTONE.asItem() || item == Blocks.CAVE_VINES.asItem() || item == Blocks.CAVE_VINES_PLANT.asItem()
				|| item == Blocks.SPORE_BLOSSOM.asItem() || item == Blocks.AZALEA.asItem() || item == Blocks.FLOWERING_AZALEA.asItem()
				|| item == Blocks.BIG_DRIPLEAF.asItem() || item == Blocks.BIG_DRIPLEAF_STEM.asItem() || item == Blocks.SMALL_DRIPLEAF.asItem()
				|| item == Blocks.HANGING_ROOTS.asItem() || item == Items.INK_SAC || item == Items.GLOW_INK_SAC || item == Items.RED_DYE
				|| item == Items.GREEN_DYE || item == Items.COCOA_BEANS || item == Items.LAPIS_LAZULI || item == Items.PURPLE_DYE
				|| item == Items.CYAN_DYE || item == Items.LIGHT_GRAY_DYE || item == Items.GRAY_DYE || item == Items.PINK_DYE
				|| item == Items.LIME_DYE || item == Items.YELLOW_DYE || item == Items.LIGHT_BLUE_DYE || item == Items.MAGENTA_DYE
				|| item == Items.ORANGE_DYE || item == Items.BONE_MEAL || item == Items.BLACK_DYE || item == Items.BROWN_DYE || item == Items.BLUE_DYE
				|| item == Items.WHITE_DYE || item == Items.COAL || item == Items.CHARCOAL || item == Items.RAW_IRON || item == Items.IRON_INGOT
				|| item == Items.IRON_NUGGET || item == Items.RAW_COPPER || item == Items.COPPER_INGOT || item == Items.REDSTONE
				|| item == Items.RAW_GOLD || item == Items.GOLD_INGOT || item == Items.GOLD_NUGGET || item == Items.DIAMOND
				|| item == Items.NETHERITE_INGOT || item == Items.NETHERITE_SCRAP || item == Items.EMERALD || item == Items.QUARTZ
				|| item == Items.NETHER_STAR || item == Items.PRISMARINE_SHARD || item == Items.PRISMARINE_CRYSTALS || item == Items.HEART_OF_THE_SEA
				|| item == Items.NAUTILUS_SHELL || item == Items.SCUTE || item == Items.PHANTOM_MEMBRANE || item == Items.AMETHYST_SHARD
				|| item == Items.BOW || item == Items.CROSSBOW || item == Items.ARROW || item == Items.SPECTRAL_ARROW || item == Items.TIPPED_ARROW
				|| item == Items.FISHING_ROD || item == Items.CARROT_ON_A_STICK || item == Items.WARPED_FUNGUS_ON_A_STICK || item == Items.COMPASS
				|| item == Items.CLOCK || item == Items.SPYGLASS || item == Items.BUNDLE || item == Items.MAP || item == Items.FILLED_MAP
				|| item == Items.FLOWER_BANNER_PATTERN || item == Items.CREEPER_BANNER_PATTERN || item == Items.SKULL_BANNER_PATTERN
				|| item == Items.MOJANG_BANNER_PATTERN || item == Items.GLOBE_BANNER_PATTERN || item == Items.PIGLIN_BANNER_PATTERN
				|| item == Items.TOTEM_OF_UNDYING || item == Items.LEAD || item == Items.NAME_TAG || item == Items.SHIELD
				|| item == Items.WOODEN_SWORD || item == Items.WOODEN_SHOVEL || item == Items.WOODEN_PICKAXE || item == Items.WOODEN_AXE
				|| item == Items.WOODEN_HOE || item == Items.STONE_SWORD || item == Items.STONE_SHOVEL || item == Items.STONE_PICKAXE
				|| item == Items.STONE_AXE || item == Items.STONE_HOE || item == Items.IRON_SWORD || item == Items.IRON_SHOVEL
				|| item == Items.IRON_PICKAXE || item == Items.IRON_AXE || item == Items.IRON_HOE || item == Items.FLINT_AND_STEEL
				|| item == Items.SHEARS || item == Items.GOLDEN_SWORD || item == Items.GOLDEN_SHOVEL || item == Items.GOLDEN_PICKAXE
				|| item == Items.GOLDEN_AXE || item == Items.GOLDEN_HOE || item == Items.DIAMOND_SWORD || item == Items.DIAMOND_SHOVEL
				|| item == Items.DIAMOND_PICKAXE || item == Items.DIAMOND_AXE || item == Items.DIAMOND_HOE || item == Items.NETHERITE_SWORD
				|| item == Items.NETHERITE_SHOVEL || item == Items.NETHERITE_PICKAXE || item == Items.NETHERITE_AXE || item == Items.NETHERITE_HOE
				|| item == Items.TRIDENT || item == Items.LEATHER_HELMET || item == Items.LEATHER_CHESTPLATE || item == Items.LEATHER_LEGGINGS
				|| item == Items.LEATHER_BOOTS || item == Items.CHAINMAIL_HELMET || item == Items.CHAINMAIL_CHESTPLATE
				|| item == Items.CHAINMAIL_LEGGINGS || item == Items.CHAINMAIL_BOOTS || item == Items.TURTLE_HELMET || item == Items.IRON_HELMET
				|| item == Items.IRON_CHESTPLATE || item == Items.IRON_LEGGINGS || item == Items.IRON_BOOTS || item == Items.GOLDEN_HELMET
				|| item == Items.GOLDEN_CHESTPLATE || item == Items.GOLDEN_LEGGINGS || item == Items.GOLDEN_BOOTS || item == Items.DIAMOND_HELMET
				|| item == Items.DIAMOND_CHESTPLATE || item == Items.DIAMOND_LEGGINGS || item == Items.DIAMOND_BOOTS || item == Items.NETHERITE_HELMET
				|| item == Items.NETHERITE_CHESTPLATE || item == Items.NETHERITE_LEGGINGS || item == Items.NETHERITE_BOOTS || item == Items.ELYTRA
				|| item == Items.LEATHER_HORSE_ARMOR || item == Items.IRON_HORSE_ARMOR || item == Items.GOLDEN_HORSE_ARMOR
				|| item == Items.DIAMOND_HORSE_ARMOR || item == Items.ARMOR_STAND || item == Items.FLOWER_POT || item == Items.BLACK_BANNER
				|| item == Items.RED_BANNER || item == Items.GREEN_BANNER || item == Items.BROWN_BANNER || item == Items.BLUE_BANNER
				|| item == Items.PURPLE_BANNER || item == Items.CYAN_BANNER || item == Items.LIGHT_GRAY_BANNER || item == Items.GRAY_BANNER
				|| item == Items.PINK_BANNER || item == Items.LIME_BANNER || item == Items.YELLOW_BANNER || item == Items.LIGHT_BLUE_BANNER
				|| item == Items.MAGENTA_BANNER || item == Items.ORANGE_BANNER || item == Items.WHITE_BANNER || item == Items.PAINTING
				|| item == Items.ITEM_FRAME || item == Items.GLOW_ITEM_FRAME || item == Items.OAK_SIGN || item == Items.SPRUCE_SIGN
				|| item == Items.BIRCH_SIGN || item == Items.JUNGLE_SIGN || item == Items.ACACIA_SIGN || item == Items.DARK_OAK_SIGN
				|| item == Items.CRIMSON_SIGN || item == Items.WARPED_SIGN || item == Items.OAK_DOOR || item == Items.SPRUCE_DOOR
				|| item == Items.BIRCH_DOOR || item == Items.JUNGLE_DOOR || item == Items.ACACIA_DOOR || item == Items.DARK_OAK_DOOR
				|| item == Items.IRON_DOOR || item == Items.CRIMSON_DOOR || item == Items.WARPED_DOOR || item == Items.BUCKET
				|| item == Items.WATER_BUCKET || item == Items.PUFFERFISH_BUCKET || item == Items.SALMON_BUCKET || item == Items.COD_BUCKET
				|| item == Items.TROPICAL_FISH_BUCKET || item == Items.AXOLOTL_BUCKET || item == Items.LAVA_BUCKET || item == Items.MILK_BUCKET
				|| item == Items.POWDER_SNOW_BUCKET || item == Items.MINECART || item == Items.CHEST_MINECART || item == Items.FURNACE_MINECART
				|| item == Items.HOPPER_MINECART || item == Items.TNT_MINECART || item == Items.COMMAND_BLOCK_MINECART || item == Items.OAK_BOAT
				|| item == Items.SPRUCE_BOAT || item == Items.BIRCH_BOAT || item == Items.JUNGLE_BOAT || item == Items.ACACIA_BOAT
				|| item == Items.DARK_OAK_BOAT || item == Items.REPEATER || item == Items.COMPARATOR || item == Items.APPLE
				|| item == Items.GOLDEN_APPLE || item == Items.ENCHANTED_GOLDEN_APPLE || item == Items.STICK || item == Items.DEBUG_STICK
				|| item == Items.BOWL || item == Items.MUSHROOM_STEW || item == Items.SUSPICIOUS_STEW || item == Items.STRING || item == Items.FEATHER
				|| item == Items.GUNPOWDER || item == Items.WHEAT_SEEDS || item == Items.WHEAT || item == Items.CARROT || item == Items.POTATO
				|| item == Items.BAKED_POTATO || item == Items.POISONOUS_POTATO || item == Items.PUMPKIN_PIE || item == Items.GOLDEN_CARROT
				|| item == Items.BREAD || item == Items.PUMPKIN_SEEDS || item == Items.FLINT || item == Items.LEATHER || item == Items.SADDLE
				|| item == Items.BRICK || item == Items.NETHER_BRICK || item == Items.CLAY_BALL || item == Items.SUGAR_CANE || item == Items.PAPER
				|| item == Items.DRIED_KELP || item == Items.SLIME_BALL || item == Items.EGG || item == Items.GLOWSTONE_DUST || item == Items.BONE
				|| item == Items.SUGAR || item == Items.CAKE || item == Blocks.CANDLE_CAKE.asItem() || item == Blocks.WHITE_CANDLE_CAKE.asItem()
				|| item == Blocks.ORANGE_CANDLE_CAKE.asItem() || item == Blocks.MAGENTA_CANDLE_CAKE.asItem()
				|| item == Blocks.LIGHT_BLUE_CANDLE_CAKE.asItem() || item == Blocks.YELLOW_CANDLE_CAKE.asItem()
				|| item == Blocks.LIME_CANDLE_CAKE.asItem() || item == Blocks.PINK_CANDLE_CAKE.asItem() || item == Blocks.GRAY_CANDLE_CAKE.asItem()
				|| item == Blocks.LIGHT_GRAY_CANDLE_CAKE.asItem() || item == Blocks.CYAN_CANDLE_CAKE.asItem()
				|| item == Blocks.PURPLE_CANDLE_CAKE.asItem() || item == Blocks.BLUE_CANDLE_CAKE.asItem() || item == Blocks.BROWN_CANDLE_CAKE.asItem()
				|| item == Blocks.GREEN_CANDLE_CAKE.asItem() || item == Blocks.RED_CANDLE_CAKE.asItem() || item == Blocks.BLACK_CANDLE_CAKE.asItem()
				|| item == Items.WHITE_BED || item == Items.COOKIE || item == Items.MELON_SLICE || item == Items.MELON_SEEDS
				|| item == Items.SWEET_BERRIES || item == Items.GLOW_BERRIES || item == Items.COD || item == Items.SALMON
				|| item == Items.TROPICAL_FISH || item == Items.PUFFERFISH || item == Items.COOKED_COD || item == Items.COOKED_SALMON
				|| item == Items.PORKCHOP || item == Items.COOKED_PORKCHOP || item == Items.BEEF || item == Items.COOKED_BEEF || item == Items.CHICKEN
				|| item == Items.COOKED_CHICKEN || item == Items.RABBIT || item == Items.COOKED_RABBIT || item == Items.RABBIT_FOOT
				|| item == Items.RABBIT_HIDE || item == Items.RABBIT_STEW || item == Items.MUTTON || item == Items.COOKED_MUTTON
				|| item == Items.ROTTEN_FLESH || item == Items.ENDER_PEARL || item == Items.ENDER_EYE || item == Items.END_CRYSTAL
				|| item == Items.SHULKER_SHELL || item == Items.CHORUS_FRUIT || item == Items.POPPED_CHORUS_FRUIT || item == Items.BEETROOT
				|| item == Items.BEETROOT_SEEDS || item == Items.BEETROOT_SOUP || item == Items.GHAST_TEAR || item == Items.NETHER_WART
				|| item == Items.GLASS_BOTTLE || item == Items.POTION || item == Items.SPLASH_POTION || item == Items.LINGERING_POTION
				|| item == Items.DRAGON_BREATH || item == Items.SPIDER_EYE || item == Items.FERMENTED_SPIDER_EYE || item == Items.BLAZE_ROD
				|| item == Items.BLAZE_POWDER || item == Items.MAGMA_CREAM || item == Items.BREWING_STAND || item == Items.CAULDRON
				|| item == Items.GLISTERING_MELON_SLICE || item == Items.CREEPER_SPAWN_EGG || item == Items.SKELETON_SPAWN_EGG
				|| item == Items.SPIDER_SPAWN_EGG || item == Items.ZOMBIE_SPAWN_EGG || item == Items.SLIME_SPAWN_EGG || item == Items.GHAST_SPAWN_EGG
				|| item == Items.ZOMBIFIED_PIGLIN_SPAWN_EGG || item == Items.ENDERMAN_SPAWN_EGG || item == Items.CAVE_SPIDER_SPAWN_EGG
				|| item == Items.SILVERFISH_SPAWN_EGG || item == Items.BLAZE_SPAWN_EGG || item == Items.MAGMA_CUBE_SPAWN_EGG
				|| item == Items.BAT_SPAWN_EGG || item == Items.WITCH_SPAWN_EGG || item == Items.ENDERMITE_SPAWN_EGG
				|| item == Items.GUARDIAN_SPAWN_EGG || item == Items.PIG_SPAWN_EGG || item == Items.SHEEP_SPAWN_EGG || item == Items.COW_SPAWN_EGG
				|| item == Items.CHICKEN_SPAWN_EGG || item == Items.SQUID_SPAWN_EGG || item == Items.WOLF_SPAWN_EGG
				|| item == Items.MOOSHROOM_SPAWN_EGG || item == Items.OCELOT_SPAWN_EGG || item == Items.HORSE_SPAWN_EGG
				|| item == Items.RABBIT_SPAWN_EGG || item == Items.VILLAGER_SPAWN_EGG || item == Items.BEE_SPAWN_EGG || item == Items.CAT_SPAWN_EGG
				|| item == Items.COD_SPAWN_EGG || item == Items.DOLPHIN_SPAWN_EGG || item == Items.DONKEY_SPAWN_EGG || item == Items.DROWNED_SPAWN_EGG
				|| item == Items.ELDER_GUARDIAN_SPAWN_EGG || item == Items.EVOKER_SPAWN_EGG || item == Items.FOX_SPAWN_EGG
				|| item == Items.HUSK_SPAWN_EGG || item == Items.LLAMA_SPAWN_EGG || item == Items.MULE_SPAWN_EGG || item == Items.PANDA_SPAWN_EGG
				|| item == Items.PARROT_SPAWN_EGG || item == Items.PHANTOM_SPAWN_EGG || item == Items.PILLAGER_SPAWN_EGG
				|| item == Items.POLAR_BEAR_SPAWN_EGG || item == Items.PUFFERFISH_SPAWN_EGG || item == Items.RAVAGER_SPAWN_EGG
				|| item == Items.SALMON_SPAWN_EGG || item == Items.SHULKER_SPAWN_EGG || item == Items.SKELETON_HORSE_SPAWN_EGG
				|| item == Items.STRAY_SPAWN_EGG || item == Items.TRADER_LLAMA_SPAWN_EGG || item == Items.TROPICAL_FISH_SPAWN_EGG
				|| item == Items.TURTLE_SPAWN_EGG || item == Items.VEX_SPAWN_EGG || item == Items.VINDICATOR_SPAWN_EGG
				|| item == Items.WANDERING_TRADER_SPAWN_EGG || item == Items.WITHER_SKELETON_SPAWN_EGG || item == Items.ZOMBIE_HORSE_SPAWN_EGG
				|| item == Items.ZOMBIE_VILLAGER_SPAWN_EGG || item == Items.HOGLIN_SPAWN_EGG || item == Items.PIGLIN_SPAWN_EGG
				|| item == Items.PIGLIN_BRUTE_SPAWN_EGG || item == Items.STRIDER_SPAWN_EGG || item == Items.ZOGLIN_SPAWN_EGG
				|| item == Items.AXOLOTL_SPAWN_EGG || item == Items.GOAT_SPAWN_EGG || item == Items.GLOW_SQUID_SPAWN_EGG
				|| item == Items.EXPERIENCE_BOTTLE || item == Items.FIRE_CHARGE || item == Items.SNOWBALL || item == Items.BOOK
				|| item == Items.WRITABLE_BOOK || item == Items.WRITTEN_BOOK || item == Items.ENCHANTED_BOOK || item == Items.KNOWLEDGE_BOOK
				|| item == Items.MUSIC_DISC_13 || item == Items.MUSIC_DISC_CAT || item == Items.MUSIC_DISC_BLOCKS || item == Items.MUSIC_DISC_CHIRP
				|| item == Items.MUSIC_DISC_FAR || item == Items.MUSIC_DISC_MALL || item == Items.MUSIC_DISC_MELLOHI || item == Items.MUSIC_DISC_STAL
				|| item == Items.MUSIC_DISC_STRAD || item == Items.MUSIC_DISC_WARD || item == Items.MUSIC_DISC_11 || item == Items.MUSIC_DISC_WAIT
				|| item == Items.MUSIC_DISC_OTHERSIDE || item == Items.MUSIC_DISC_PIGSTEP || item == Items.SKELETON_SKULL
				|| item == Items.WITHER_SKELETON_SKULL || item == Items.PLAYER_HEAD || item == Items.ZOMBIE_HEAD || item == Items.CREEPER_HEAD
				|| item == Items.DRAGON_HEAD || item == Items.FIREWORK_STAR || item == Items.FIREWORK_ROCKET || item == Items.HONEYCOMB
				|| item == Items.HONEY_BOTTLE;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
