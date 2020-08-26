
package net.mcreator.minecracked.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.minecracked.procedures.SoulFragmentItemInInventoryTickProcedure;
import net.mcreator.minecracked.itemgroup.Minecraft2ItemGroup;
import net.mcreator.minecracked.MinecrackedModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@MinecrackedModElements.ModElement.Tag
public class SoulFragmentItem extends MinecrackedModElements.ModElement {
	@ObjectHolder("minecracked:soul_fragment")
	public static final Item block = null;
	public SoulFragmentItem(MinecrackedModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(Minecraft2ItemGroup.tab).maxStackSize(64));
			setRegistryName("soul_fragment");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("A melancholic aura resonates in this crystal..."));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SoulFragmentItemInInventoryTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
