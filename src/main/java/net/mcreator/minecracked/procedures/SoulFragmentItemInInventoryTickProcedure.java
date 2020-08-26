package net.mcreator.minecracked.procedures;

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

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) - 0.1));

	}

}
