package omer.saban.ultramagic.core;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ModMobEffect extends MobEffect {

	protected ModMobEffect(MobEffectCategory p_19451_, int p_19452_) {
		super(p_19451_, p_19452_);
	}
@Override
public void applyEffectTick(LivingEntity entity, int p_19468_) {
if(this == ModEffects.BITE.get()) {
	entity.hurt(DamageSource.MAGIC, 3.0f);
}
if(this == ModEffects.CHIMERA_POISON.get()) {
	entity.hurt(DamageSource.MAGIC, 5.0f);
}
}
@Override
public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
if(this == ModEffects.BITE.get()) {
	int i = 25 << p_19456_;
	if(i>0) {
		return p_19455_ % i ==0;
	}
}
if(this == ModEffects.CHIMERA_POISON.get()) {
	int i = 35 << p_19456_;
	if(i>0) {
		return p_19455_ % i ==0;
	}
}
return super.isDurationEffectTick(p_19455_, p_19456_);
}
}
