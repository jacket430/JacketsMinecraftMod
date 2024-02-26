
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
public class ItemCityShades extends ElementsAvesModMod.ModElement {
	@GameRegistry.ObjectHolder("aves_mod:city_suithelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("aves_mod:city_suitbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("aves_mod:city_suitlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("aves_mod:city_suitboots")
	public static final Item boots = null;
	public ItemCityShades(ElementsAvesModMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CITY_SUIT", "aves_mod:suit_", 1, new int[]{2, 1, 1, 1}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("city_suithelmet")
				.setRegistryName("city_suithelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("city_suitbody")
				.setRegistryName("city_suitbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("city_suitlegs")
				.setRegistryName("city_suitlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("city_suitboots")
				.setRegistryName("city_suitboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("aves_mod:city_suithelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("aves_mod:city_suitbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("aves_mod:city_suitlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("aves_mod:city_suitboots", "inventory"));
	}
}
