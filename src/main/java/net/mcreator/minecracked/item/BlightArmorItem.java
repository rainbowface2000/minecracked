
package net.mcreator.minecracked.item;

@MinecrackedModElements.ModElement.Tag
public class BlightArmorItem extends MinecrackedModElements.ModElement {

	@ObjectHolder("minecracked:blight_armor_helmet")
	public static final Item helmet = null;

	@ObjectHolder("minecracked:blight_armor_chestplate")
	public static final Item body = null;

	@ObjectHolder("minecracked:blight_armor_leggings")
	public static final Item legs = null;

	@ObjectHolder("minecracked:blight_armor_boots")
	public static final Item boots = null;

	public BlightArmorItem(MinecrackedModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 3, 4, 2}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 0;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.break"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SoulFragmentItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "blight_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(Minecraft2ItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "minecracked:textures/models/armor/blightedarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("blight_armor_helmet"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(Minecraft2ItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "minecracked:textures/models/armor/blightedarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("blight_armor_chestplate"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(Minecraft2ItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "minecracked:textures/models/armor/blightedarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("blight_armor_leggings"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(Minecraft2ItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "minecracked:textures/models/armor/blightedarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("blight_armor_boots"));
	}

}
