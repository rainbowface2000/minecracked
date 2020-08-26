package net.mcreator.minecracked.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.minecracked.MinecrackedModElements;

import java.util.Map;

@MinecrackedModElements.ModElement.Tag
public class OuchFoodEatenProcedure extends MinecrackedModElements.ModElement {
	public OuchFoodEatenProcedure(MinecrackedModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OuchFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 60, (int) (-1)));
	}
}
