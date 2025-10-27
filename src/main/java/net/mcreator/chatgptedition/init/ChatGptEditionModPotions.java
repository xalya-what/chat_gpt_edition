
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chatgptedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.chatgptedition.ChatGptEditionMod;

public class ChatGptEditionModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ChatGptEditionMod.MODID);
	public static final RegistryObject<Potion> DEATH = REGISTRY.register("death", () -> new Potion(
			new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, true, true), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0, true, true), new MobEffectInstance(MobEffects.HEAL, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.HARM, 3600, 0, true, true), new MobEffectInstance(MobEffects.JUMP, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, true, true), new MobEffectInstance(MobEffects.REGENERATION, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 0, true, true), new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0, true, true), new MobEffectInstance(MobEffects.HUNGER, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.WEAKNESS, 3600, 0, true, true), new MobEffectInstance(MobEffects.POISON, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.WITHER, 3600, 0, true, true), new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0, true, true), new MobEffectInstance(MobEffects.SATURATION, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.GLOWING, 3600, 0, true, true), new MobEffectInstance(MobEffects.LEVITATION, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.LUCK, 3600, 0, true, true), new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 0, true, true), new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0, true, true), new MobEffectInstance(MobEffects.BAD_OMEN, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 0, true, true)));
}
