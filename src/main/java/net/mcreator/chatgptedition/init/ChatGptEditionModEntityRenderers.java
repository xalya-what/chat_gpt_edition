
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chatgptedition.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.chatgptedition.client.renderer.MicroGptRenderer;
import net.mcreator.chatgptedition.client.renderer.FunboxRenderer;
import net.mcreator.chatgptedition.client.renderer.Chatgpt6Renderer;
import net.mcreator.chatgptedition.client.renderer.Chatgpt1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChatGptEditionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ChatGptEditionModEntities.CHATGPT_6.get(), Chatgpt6Renderer::new);
		event.registerEntityRenderer(ChatGptEditionModEntities.CHATGPT_1.get(), Chatgpt1Renderer::new);
		event.registerEntityRenderer(ChatGptEditionModEntities.FUNBOX.get(), FunboxRenderer::new);
		event.registerEntityRenderer(ChatGptEditionModEntities.MICRO_GPT.get(), MicroGptRenderer::new);
	}
}
