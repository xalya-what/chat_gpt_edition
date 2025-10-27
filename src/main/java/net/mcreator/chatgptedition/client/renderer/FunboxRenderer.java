
package net.mcreator.chatgptedition.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.chatgptedition.entity.FunboxEntity;
import net.mcreator.chatgptedition.client.model.Modelohno;

public class FunboxRenderer extends MobRenderer<FunboxEntity, Modelohno<FunboxEntity>> {
	public FunboxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelohno(context.bakeLayer(Modelohno.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FunboxEntity, Modelohno<FunboxEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("chat_gpt_edition:textures/entities/funbox.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FunboxEntity entity) {
		return new ResourceLocation("chat_gpt_edition:textures/entities/funbox.png");
	}
}
