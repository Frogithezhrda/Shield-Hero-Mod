package omer.saban.ultramagic.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import omer.saban.ultramagic.UltraMagic;

public class Sounds {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            UltraMagic.MODID);
    public static final Lazy<SoundEvent> SHIELD_HERO_OP_1 = Lazy.of( () ->
    new SoundEvent(new ResourceLocation(UltraMagic.MODID,"item.shield_hero_op_1")));
    public static final Lazy<SoundEvent> SHIELD_HERO_OP_2 = Lazy.of( () ->
    new SoundEvent(new ResourceLocation(UltraMagic.MODID,"item.shield_hero_op_2")));
    public static final RegistryObject<SoundEvent> SHIELD_HERO_OP_2_DISC = SOUNDS.register("item.shield_hero_op_2.disc", SHIELD_HERO_OP_2);

    public static final RegistryObject<SoundEvent> SHIELD_HERO_OP_1_DISC = SOUNDS.register("item.shield_hero_op_1.disc", SHIELD_HERO_OP_1);

}
