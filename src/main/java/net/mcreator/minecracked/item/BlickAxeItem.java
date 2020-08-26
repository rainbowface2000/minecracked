
package net.mcreator.minecracked.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.minecracked.itemgroup.Minecraft2ItemGroup;
import net.mcreator.minecracked.MinecrackedModElements;

@MinecrackedModElements.ModElement.Tag
public class BlickAxeItem extends MinecrackedModElements.ModElement {
	@ObjectHolder("minecracked:blick_axe")
	public static final Item block = null;
	public BlickAxeItem(MinecrackedModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 45;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlickItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(Minecraft2ItemGroup.tab)) {
		}.setRegistryName("blick_axe"));
	}
}
