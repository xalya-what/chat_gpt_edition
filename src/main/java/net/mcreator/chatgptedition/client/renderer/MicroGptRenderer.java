
package net.mcreator.chatgptedition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.chatgptedition.entity.MicroGptEntity;
import net.mcreator.chatgptedition.client.model.Modeltablet_gpt;

public class MicroGptRenderer extends MobRenderer<MicroGptEntity, Modeltablet_gpt<MicroGptEntity>> {
	public MicroGptRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltablet_gpt(context.bakeLayer(Modeltablet_gpt.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MicroGptEntity, Modeltablet_gpt<MicroGptEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("chat_gpt_edition:textures/entities/micro_birrrrrrrrrrrr.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MicroGptEntity entity) {
		return new ResourceLocation("chat_gpt_edition:textures/entities/micro_birrrrrrrrrrrr.png");
	}
}
