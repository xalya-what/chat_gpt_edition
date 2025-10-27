
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chatgptedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.chatgptedition.entity.MicroGptEntity;
import net.mcreator.chatgptedition.entity.FunboxEntity;
import net.mcreator.chatgptedition.entity.Chatgpt6Entity;
import net.mcreator.chatgptedition.entity.Chatgpt1Entity;
import net.mcreator.chatgptedition.ChatGptEditionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChatGptEditionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ChatGptEditionMod.MODID);
	public static final RegistryObject<EntityType<Chatgpt6Entity>> CHATGPT_6 = register("chatgpt_6",
			EntityType.Builder.<Chatgpt6Entity>of(Chatgpt6Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Chatgpt6Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Chatgpt1Entity>> CHATGPT_1 = register("chatgpt_1",
			EntityType.Builder.<Chatgpt1Entity>of(Chatgpt1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Chatgpt1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FunboxEntity>> FUNBOX = register("funbox",
			EntityType.Builder.<FunboxEntity>of(FunboxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000)
					.setUpdateInterval(3).setCustomClientFactory(FunboxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MicroGptEntity>> MICRO_GPT = register("micro_gpt",
			EntityType.Builder.<MicroGptEntity>of(MicroGptEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MicroGptEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Chatgpt6Entity.init();
			Chatgpt1Entity.init();
			FunboxEntity.init();
			MicroGptEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHATGPT_6.get(), Chatgpt6Entity.createAttributes().build());
		event.put(CHATGPT_1.get(), Chatgpt1Entity.createAttributes().build());
		event.put(FUNBOX.get(), FunboxEntity.createAttributes().build());
		event.put(MICRO_GPT.get(), MicroGptEntity.createAttributes().build());
	}
}
