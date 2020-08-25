
package net.mcreator.minecracked.itemgroup;

@MinecrackedModElements.ModElement.Tag
public class Minecraft2ItemGroup extends MinecrackedModElements.ModElement {

	public Minecraft2ItemGroup(MinecrackedModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabminecraft_2") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GrickItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;

}
