
package net.mcreator.minecracked.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.minecracked.itemgroup.Minecraft2ItemGroup;
import net.mcreator.minecracked.MinecrackedModElements;

@MinecrackedModElements.ModElement.Tag
public class GrickItem extends MinecrackedModElements.ModElement {
	@ObjectHolder("minecracked:grick")
	public static final Item block = null;
	public GrickItem(MinecrackedModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(Minecraft2ItemGroup.tab).maxStackSize(64));
			setRegistryName("grick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
