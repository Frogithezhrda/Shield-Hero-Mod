package omer.saban.ultramagic.core;

import java.util.Random;

import javax.tools.Tool;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.ThrownTridentRenderer;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LegendSpearItem extends SwordItem {
    double count = 0.0D;

    double pos_x = 0.0D;
    double pos_y = 0.0D;
    double pos_z = 0.0D;

	   public LegendSpearItem(Properties p_43089_) {
		super(ToolMaterialInit.LEGEND, 11, -2.4f, p_43089_);
		// TODO Auto-generated constructor stub
	}

	   public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		   Entity entity;
		      ItemStack itemstack = player.getItemInHand(hand);

			  return InteractionResultHolder.consume(itemstack);
		   }
	   	

}
