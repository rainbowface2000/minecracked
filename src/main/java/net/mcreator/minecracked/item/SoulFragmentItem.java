
package net.mcreator.minecracked.item;

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
