
package net.mcreator.chatgptedition.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.chatgptedition.init.ChatGptEditionModEntities;

import java.util.Set;

@Mod.EventBusSubscriber
public class Chatgpt1Entity extends Monster {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("warm_ocean"), new ResourceLocation("mushroom_fields"),
			new ResourceLocation("sunflower_plains"), new ResourceLocation("end_midlands"), new ResourceLocation("flower_forest"),
			new ResourceLocation("lush_caves"), new ResourceLocation("cold_ocean"), new ResourceLocation("the_end"),
			new ResourceLocation("ice_spikes"), new ResourceLocation("lukewarm_ocean"), new ResourceLocation("dark_forest"),
			new ResourceLocation("savanna"), new ResourceLocation("stony_peaks"), new ResourceLocation("snowy_beach"),
			new ResourceLocation("frozen_ocean"), new ResourceLocation("savanna_plateau"), new ResourceLocation("dripstone_caves"),
			new ResourceLocation("snowy_plains"), new ResourceLocation("jagged_peaks"), new ResourceLocation("eroded_badlands"),
			new ResourceLocation("badlands"), new ResourceLocation("windswept_hills"), new ResourceLocation("ocean"),
			new ResourceLocation("wooded_badlands"), new ResourceLocation("windswept_savanna"), new ResourceLocation("jungle"),
			new ResourceLocation("warped_forest"), new ResourceLocation("frozen_river"), new ResourceLocation("forest"),
			new ResourceLocation("stony_shore"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"),
			new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("snowy_slopes"), new ResourceLocation("deep_ocean"),
			new ResourceLocation("deep_frozen_ocean"), new ResourceLocation("nether_wastes"), new ResourceLocation("bamboo_jungle"),
			new ResourceLocation("soul_sand_valley"), new ResourceLocation("small_end_islands"), new ResourceLocation("plains"),
			new ResourceLocation("frozen_peaks"), new ResourceLocation("end_highlands"), new ResourceLocation("meadow"),
			new ResourceLocation("end_barrens"), new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("basalt_deltas"),
			new ResourceLocation("taiga"), new ResourceLocation("crimson_forest"), new ResourceLocation("snowy_taiga"), new ResourceLocation("swamp"),
			new ResourceLocation("deep_cold_ocean"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("grove"),
			new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("beach"), new ResourceLocation("the_void"),
			new ResourceLocation("windswept_forest"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("river"),
			new ResourceLocation("desert"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MONSTER)
					.add(new MobSpawnSettings.SpawnerData(ChatGptEditionModEntities.CHATGPT_1.get(), 20, 4, 4));
	}

	public Chatgpt1Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(ChatGptEditionModEntities.CHATGPT_1.get(), world);
	}

	public Chatgpt1Entity(EntityType<Chatgpt1Entity> type, Level world) {
		super(type, world);
		xpReward = 100;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Blocks.IRON_BLOCK));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.getDirectEntity() instanceof Player)
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosion())
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 4; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.5D;
			double dy = (random.nextFloat() - 0.5D) * 0.5D;
			double dz = (random.nextFloat() - 0.5D) * 0.5D;
			world.addParticle(ParticleTypes.RAIN, x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
		SpawnPlacements.register(ChatGptEditionModEntities.CHATGPT_1.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
		DungeonHooks.addDungeonMob(ChatGptEditionModEntities.CHATGPT_1.get(), 180);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 100);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
