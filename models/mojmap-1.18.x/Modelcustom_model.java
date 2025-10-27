// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart main_body;

	public Modelcustom_model(ModelPart root) {
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.main_body = root.getChild("main_body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-5.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.0F, -3.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(-4.0F, -10.0F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
						.addBox(-5.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(-5.0F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 21)
						.addBox(-5.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(1.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(2.0F, -10.0F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 16)
						.addBox(1.0F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(1.0F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 20)
						.addBox(1.0F, -3.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 17)
						.addBox(1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -18.0F, -2.0F, 9.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = main_body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 11).addBox(-5.0F, -13.0F, -2.0F, 9.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.main_body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.main_body.xRot = headPitch / (180F / (float) Math.PI);
	}
}