
package net.mcreator.chatgptedition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.chatgptedition.entity.Chatgpt6Entity;
import net.mcreator.chatgptedition.client.model.Modelcustom_model;

public class Chatgpt6Renderer extends MobRenderer<Chatgpt6Entity, Modelcustom_model<Chatgpt6Entity>> {
	public Chatgpt6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<Chatgpt6Entity, Modelcustom_model<Chatgpt6Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("chat_gpt_edition:textures/entities/chatgpt6.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Chatgpt6Entity entity) {
		return new ResourceLocation("chat_gpt_edition:textures/entities/chatgpt6.png");
	}
}
