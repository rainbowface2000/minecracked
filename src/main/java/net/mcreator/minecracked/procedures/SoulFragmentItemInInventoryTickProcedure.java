package net.mcreator.minecracked.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.minecracked.MinecrackedModElements;

import java.util.Map;

@MinecrackedModElements.ModElement.Tag
public class SoulFragmentItemInInventoryTickProcedure extends MinecrackedModElements.ModElement {
	public SoulFragmentItemInInventoryTickProcedure(MinecrackedModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SoulFragmentItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() == 0.05)) {
			entity.attackEntityFrom(DamageSource.GENERIC,
					(float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) / 3));
		}
	}
}
