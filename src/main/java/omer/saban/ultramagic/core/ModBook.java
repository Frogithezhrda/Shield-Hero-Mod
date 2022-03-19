package omer.saban.ultramagic.core;

import java.util.Random;

import javax.tools.Tool;

import net.minecraft.ChatFormatting;
import net.minecraft.advancements.critereon.UsedTotemTrigger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.TotemParticle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModBook extends Item {

	public ModBook(Properties p_41383_) {
		super(p_41383_);
		// TODO Auto-generated constructor stub
	}
@Override
public InteractionResultHolder<ItemStack> use(Level p_41432_, Player playerIn, InteractionHand hand) {
    int tmp = (int) ( Math.random() * 2 + 1);
    ItemStack itemstack = playerIn.getItemInHand(hand);
    if(tmp == 1) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SHIELD.get());
    }
    if(tmp == 2) {
  	  itemstack = new ItemStack(ModItems.LEGEND_SPEAR.get());
    }
    return InteractionResultHolder.consume(itemstack);
}
}
