package omer.saban.ultramagic.core;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import omer.saban.ultramagic.UltraMagic;

public class ModEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            UltraMagic.MODID);

	public static final RegistryObject<EntityType<WolfEntity>> WOLF_PROJETILE = ENTITIES.register("wolf_projectile", 
			() -> EntityType.Builder.of((EntityType.EntityFactory<WolfEntity>)WolfEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).build("wolf_projectile"));

}
