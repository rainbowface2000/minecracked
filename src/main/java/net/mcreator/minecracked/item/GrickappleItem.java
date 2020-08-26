
package net.mcreator.minecracked.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.minecracked.itemgroup.Minecraft2ItemGroup;
import net.mcreator.minecracked.MinecrackedModElements;

@MinecrackedModElements.ModElement.Tag
public class GrickappleItem extends MinecrackedModElements.ModElement {
	@ObjectHolder("minecracked:grickapple")
	public static final Item block = null;
	public GrickappleItem(MinecrackedModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(Minecraft2ItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("grickapple");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
