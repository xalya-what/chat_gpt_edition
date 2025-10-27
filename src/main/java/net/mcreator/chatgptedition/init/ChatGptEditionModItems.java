
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chatgptedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chatgptedition.ChatGptEditionMod;

public class ChatGptEditionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChatGptEditionMod.MODID);
	public static final RegistryObject<Item> CHATGPT_6 = REGISTRY.register("chatgpt_6_spawn_egg",
			() -> new ForgeSpawnEggItem(ChatGptEditionModEntities.CHATGPT_6, -10066330, -16711936,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHATGPT_1 = REGISTRY.register("chatgpt_1_spawn_egg",
			() -> new ForgeSpawnEggItem(ChatGptEditionModEntities.CHATGPT_1, -10066330, -65536, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FUNBOX = REGISTRY.register("funbox_spawn_egg",
			() -> new ForgeSpawnEggItem(ChatGptEditionModEntities.FUNBOX, -10066330, -13434880, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MICRO_GPT = REGISTRY.register("micro_gpt_spawn_egg",
			() -> new ForgeSpawnEggItem(ChatGptEditionModEntities.MICRO_GPT, -10066330, -12763843,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PC = block(ChatGptEditionModBlocks.PC, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> PVTNT = block(ChatGptEditionModBlocks.PVTNT, CreativeModeTab.TAB_REDSTONE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
