
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chatgptedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.chatgptedition.block.PvtntBlock;
import net.mcreator.chatgptedition.block.PcBlock;
import net.mcreator.chatgptedition.ChatGptEditionMod;

public class ChatGptEditionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChatGptEditionMod.MODID);
	public static final RegistryObject<Block> PC = REGISTRY.register("pc", () -> new PcBlock());
	public static final RegistryObject<Block> PVTNT = REGISTRY.register("pvtnt", () -> new PvtntBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PcBlock.registerRenderLayer();
			PvtntBlock.registerRenderLayer();
		}
	}
}
