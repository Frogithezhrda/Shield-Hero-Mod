package omer.saban.ultramagic.core;

import java.util.function.Predicate;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.fmllegacy.network.NetworkHooks;

public class WolfEntity extends ThrowableItemProjectile {

    public WolfEntity(EntityType<WolfEntity> entityType, Level world) {
        super(entityType, world);
    }

    public WolfEntity(double x, double y, double z, Level world) {
        super(ModEntities.WOLF_PROJETILE.get(),x, y, z, world);
    }

    public WolfEntity(LivingEntity shooter, Level world) {
        super(ModEntities.WOLF_PROJETILE.get(),shooter, world);
    }
	
    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

	@Override
	protected Item getDefaultItem() {
		// TODO Auto-generated method stub
		return ModItems.TWO_HEADED_DOG.get().asItem();
	}
@Override
protected void onHitEntity(EntityHitResult p_37259_) {
this.removeVehicle();

}
}
