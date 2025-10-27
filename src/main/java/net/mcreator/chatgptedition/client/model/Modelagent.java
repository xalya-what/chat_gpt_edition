package net.mcreator.chatgptedition.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelagent<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("chat_gpt_edition", "modelagent"), "main");
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart main_body;
	public final ModelPart head;

	public Modelagent(ModelPart root) {
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.main_body = root.getChild("main_body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(24, 0).addBox(7.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(7.0F, -3.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(8.0F, -10.0F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
						.addBox(7.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(7.0F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 21)
						.addBox(7.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 21)
						.addBox(7.0F, -11.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 19.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(24, 0).addBox(-5.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.0F, -3.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(-4.0F, -10.0F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
						.addBox(-5.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(-5.0F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 21)
						.addBox(-5.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 21)
						.addBox(-5.0F, -11.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 19.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(24, 0).addBox(-5.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.0F, -3.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(-4.0F, -10.0F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
						.addBox(-5.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(-5.0F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 21)
						.addBox(-5.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 16).addBox(1.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(2.0F, -10.0F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 16)
						.addBox(1.0F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(1.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 20)
						.addBox(1.0F, -3.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 17)
						.addBox(1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -18.0F, -2.0F, 9.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = main_body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 11).addBox(-5.0F, -13.0F, -2.0F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(60, 61).addBox(2.0F, -15.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 58).addBox(-2.0F, -18.0F, -2.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 19.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
