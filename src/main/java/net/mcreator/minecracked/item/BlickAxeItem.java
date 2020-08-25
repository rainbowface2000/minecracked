
package net.mcreator.minecracked.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.minecracked.itemgroup.Minecraft2ItemGroup;
import net.mcreator.minecracked.MinecrackedModElements;

import java.util.List;

@MinecrackedModElements.ModElement.Tag
public class BlickAxeItem extends MinecrackedModElements.ModElement {
	@ObjectHolder("minecracked:blick_axe")
	public static final Item block = null;
	public BlickAxeItem(MinecrackedModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Blick"));
				list.add(new StringTextComponent("and Axe."));
			}
		}.setRegistryName("blick_axe"));
	}
}
