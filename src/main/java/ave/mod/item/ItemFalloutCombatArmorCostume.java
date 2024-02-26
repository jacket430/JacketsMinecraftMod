
package ave.mod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import ave.mod.ElementsAvesModMod;

@ElementsAvesModMod.ModElement.Tag
public class ItemFalloutCombatArmorCostume extends ElementsAvesModMod.ModElement {
	@GameRegistry.ObjectHolder("aves_mod:fallout_combat_armor_costumehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("aves_mod:fallout_combat_armor_costumebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("aves_mod:fallout_combat_armor_costumelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("aves_mod:fallout_combat_armor_costumeboots")
	public static final Item boots = null;
	public ItemFalloutCombatArmorCostume(ElementsAvesModMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FALLOUT_COMBAT_ARMOR_COSTUME", "aves_mod:fo_iron_", 1, new int[]{1, 1, 1, 1}, 1,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("fallout_combat_armor_costumehelmet")
				.setRegistryName("fallout_combat_armor_costumehelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("fallout_combat_armor_costumebody")
				.setRegistryName("fallout_combat_armor_costumebody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("fallout_combat_armor_costumelegs")
				.setRegistryName("fallout_combat_armor_costumelegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("fallout_combat_armor_costumeboots")
				.setRegistryName("fallout_combat_armor_costumeboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("aves_mod:fallout_combat_armor_costumehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("aves_mod:fallout_combat_armor_costumebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("aves_mod:fallout_combat_armor_costumelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("aves_mod:fallout_combat_armor_costumeboots", "inventory"));
	}
}
