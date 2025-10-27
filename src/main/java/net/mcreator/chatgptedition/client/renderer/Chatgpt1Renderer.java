
package net.mcreator.chatgptedition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.chatgptedition.entity.Chatgpt1Entity;
import net.mcreator.chatgptedition.client.model.Modelagent;

public class Chatgpt1Renderer extends MobRenderer<Chatgpt1Entity, Modelagent<Chatgpt1Entity>> {
	public Chatgpt1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelagent(context.bakeLayer(Modelagent.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<Chatgpt1Entity, Modelagent<Chatgpt1Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("chat_gpt_edition:textures/entities/chatgpt1.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Chatgpt1Entity entity) {
		return new ResourceLocation("chat_gpt_edition:textures/entities/chatgpt1.png");
	}
}
