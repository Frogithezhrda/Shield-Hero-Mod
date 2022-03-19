package omer.saban.ultramagic.core;

import java.util.Random;

import javax.tools.Tool;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
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
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LegendShieldItemRage extends SwordItem {
	   public LegendShieldItemRage(Properties p_43089_) {
		super(ToolMaterialInit.LEGEND, 7, -1, p_43089_);
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
	       if(player.getMainHandItem() != null && player.getMainHandItem().getItem() instanceof LegendShieldItemRage) {
		   		  player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 2,false,false));
		   		  player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 1,false,false));

	       }
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
		      }
		      return InteractionResultHolder.consume(itemstack);
		      
	   }
	


	   public int getUseDuration(ItemStack p_43107_) {
	      return 72000;
	   }

}
