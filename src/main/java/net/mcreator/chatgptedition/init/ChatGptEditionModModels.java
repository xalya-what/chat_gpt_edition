
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chatgptedition.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.chatgptedition.client.model.Modeltablet_gpt;
import net.mcreator.chatgptedition.client.model.Modelohno;
import net.mcreator.chatgptedition.client.model.Modelcustom_model;
import net.mcreator.chatgptedition.client.model.Modelagent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ChatGptEditionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltablet_gpt.LAYER_LOCATION, Modeltablet_gpt::createBodyLayer);
		event.registerLayerDefinition(Modelagent.LAYER_LOCATION, Modelagent::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelohno.LAYER_LOCATION, Modelohno::createBodyLayer);
	}
}
