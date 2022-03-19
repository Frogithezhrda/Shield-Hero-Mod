package omer.saban.ultramagic.core;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import omer.saban.ultramagic.UltraMagic;

public class ModEffects {

	
	
	   public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS,
	            UltraMagic.MODID);
	   
	   
	    public static final RegistryObject<MobEffect> BITE = EFFECTS.register("bite",
	            () -> new ModMobEffect(MobEffectCategory.HARMFUL,0x3A3A3A));
	    public static final RegistryObject<MobEffect> CHIMERA_POISON = EFFECTS.register("chimera_poison",
	            () -> new ModMobEffect(MobEffectCategory.HARMFUL,0x2AE004));

}
 