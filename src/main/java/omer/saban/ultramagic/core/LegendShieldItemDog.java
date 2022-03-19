package omer.saban.ultramagic.core;

import java.util.Random;

import javax.tools.Tool;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SnowballItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LegendShieldItemDog extends SwordItem {
	   public LegendShieldItemDog(Properties p_43089_) {
		super(ToolMaterialInit.LEGEND, 2, -1, p_43089_);
		// TODO Auto-generated constructor stub
	}
	@Override
	   public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
	      return net.minecraftforge.common.ToolActions.DEFAULT_SHIELD_ACTIONS.contains(toolAction);
	   }
	   public UseAnim getUseAnimation(ItemStack p_43105_) {
	      return UseAnim.BLOCK;
	   }

	   @Override
	   public void inventoryTick(ItemStack p_41404_, Level p_41405_, Entity entity, int p_41407_, boolean p_41408_) {
	       Player player = (Player) entity;
	       if(player.getMainHandItem() != null && player.getMainHandItem().getItem() instanceof LegendShieldItemDog) {
	   		  player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 0,false,false));

	       }
	   }
@Override
public boolean hurtEnemy(ItemStack p_43278_, LivingEntity target, LivingEntity attacker) {

	target.addEffect(new MobEffectInstance(ModEffects.BITE.get(), 75),attacker);
	return super.hurtEnemy(p_43278_, target, attacker);
}
public InteractionResultHolder<ItemStack> use(Level world, Player playerIn, InteractionHand p_43101_) {
    ItemStack itemstack = playerIn.getItemInHand(p_43101_);
    playerIn.startUsingItem(p_43101_);
	  	 Random random = new Random();

    if(ClientForgeEvents.value == 2) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SHIELD.get());
    }
    if(ClientForgeEvents.value == 1) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SHIELD_BOOK.get());
    }
    if(ClientForgeEvents.value == 5) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SHIELD_PICKAX.get());
    }
    if(ClientForgeEvents.value == 7) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SHIELD_LIGHT_METAL.get());
    }
    if(ClientForgeEvents.value == 6) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SHIELD_TWO_HEADED_DOG.get());
    }
    if(ClientForgeEvents.value == 4) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SHIELD_RAGE.get());
  	  for(int y = 0; y < 402; ++y) {
  	  world.addParticle(ParticleTypes.FLAME, playerIn.getX() + random.nextDouble() * 2.0D + random.nextDouble() * -2.0D, playerIn.getY() + random.nextDouble() * 2.0D,
					playerIn.getZ() + random.nextDouble() * 2.0D + random.nextDouble() * -2.0D, 0.0D, 0.0D,0.0D);
  	  }
  	  for(int y = 0; y < 402; ++y) {
	    	  world.addParticle(ParticleTypes.FLAME, playerIn.getX() + random.nextDouble() * 10.0D + random.nextDouble() * -10.0D, playerIn.getY() + random.nextDouble() * 0.5D,
						playerIn.getZ() + random.nextDouble() * 10.0D + random.nextDouble() * -10.0D, 0.0D, 0.0D,0.0D);
	    	  }
  	  Minecraft mc = Minecraft.getInstance();
          mc.gameRenderer.displayItemActivation(itemstack);

    }
    return InteractionResultHolder.consume(itemstack);
    
 }
	   
	   public int getUseDuration(ItemStack p_43107_) {
	      return 72000;
	   }


}
