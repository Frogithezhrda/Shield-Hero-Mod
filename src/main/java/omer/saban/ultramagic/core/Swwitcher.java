package omer.saban.ultramagic.core;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public interface Swwitcher {
	   public InteractionResultHolder<ItemStack> switchh(Level p_43099_, Player p_43100_, InteractionHand p_43101_);

}
