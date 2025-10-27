
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chatgptedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.chatgptedition.enchantment.InstakillEnchantment;
import net.mcreator.chatgptedition.ChatGptEditionMod;

public class ChatGptEditionModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ChatGptEditionMod.MODID);
	public static final RegistryObject<Enchantment> INSTAKILL = REGISTRY.register("instakill", () -> new InstakillEnchantment());
}
