package omer.saban.ultramagic.core;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import omer.saban.ultramagic.UltraMagic;

public class ModItems {
	   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
	            UltraMagic.MODID);
	   
	    public static final RegistryObject<LegendShieldItem> LEGEND_SHIELD = ITEMS.register("legend_shield",
	            () -> new LegendShieldItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
	    public static final RegistryObject<LegendShieldItemRage> LEGEND_SHIELD_RAGE = ITEMS.register("legend_shield_rage",
	            () -> new LegendShieldItemRage(new Item.Properties().fireResistant()));

	    public static final RegistryObject<LegendShieldItem> LEGEND_SHIELD_BOOK = ITEMS.register("legend_shield_book",
	            () -> new LegendShieldItem(new Item.Properties().fireResistant()));
	    public static final RegistryObject<ModBook> BOOK = ITEMS.register("book",
	            () -> new ModBook(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1).fireResistant()));

	    public static final RegistryObject<LegendShieldItemPick> LEGEND_SHIELD_PICKAX = ITEMS.register("legend_shield_pickax",
	            () -> new LegendShieldItemPick(ToolMaterialInit.LEGEND,20,5, new Item.Properties().fireResistant()));
	    public static final RegistryObject<LegendShieldItemEffect> LEGEND_SHIELD_LIGHT_METAL = ITEMS.register("legend_shield_light_metal",
	            () -> new LegendShieldItemEffect(new Item.Properties().fireResistant()));
	    public static final RegistryObject<LegendShieldItemDog> LEGEND_SHIELD_TWO_HEADED_DOG = ITEMS.register("legend_shield_two_headed_dog",
	            () -> new LegendShieldItemDog(new Item.Properties().fireResistant()));
	    public static final RegistryObject<Item> TWO_HEADED_DOG = ITEMS.register("two_headed_dog",
	            () -> new Item(new Item.Properties().fireResistant()));
	    public static final RegistryObject<Item> SHIELD_HERO_OP_1_DISC = ITEMS.register("shield_hero_op_1_disc",
	            () -> new ModDiscItem(1, Sounds.SHIELD_HERO_OP_1.get(),new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC)));
	    public static final RegistryObject<ModDiscItem> SHIELD_HERO_OP_2_DISC = ITEMS.register("shield_hero_op_2_disc",
	            () -> new ModDiscItem(1, Sounds.SHIELD_HERO_OP_2.get(), new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC)));
        
public static final RegistryObject<LegendSpearItem> LEGEND_SPEAR = ITEMS.register("legend_spear",() -> new LegendSpearItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

}
