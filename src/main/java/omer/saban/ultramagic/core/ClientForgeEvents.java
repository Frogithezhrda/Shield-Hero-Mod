package omer.saban.ultramagic.core;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import omer.saban.ultramagic.UltraMagic;

@Mod.EventBusSubscriber(modid = UltraMagic.MODID, bus = Bus.FORGE, value = Dist.CLIENT)
public final class ClientForgeEvents {
	public static int value = 2;
	public static int wierd = 1;
    @SuppressWarnings("resource")
	private ClientForgeEvents() {
    }
	@SubscribeEvent

    public void inventoryTick(ItemStack p_41404_, Level p_41405_, Entity p_41406_, int p_41407_, boolean p_41408_) {
    	  final var player = Minecraft.getInstance().player;
    	  if(player.isHolding(ModItems.LEGEND_SHIELD_LIGHT_METAL.get())) {
	   			player.displayClientMessage(new TextComponent("Small Shield").withStyle(ChatFormatting.GRAY), false);  

    	  }
    }
	   @SuppressWarnings("resource")
	@SubscribeEvent
	   public static void clientTick(ClientTickEvent event) {
		  final var player = Minecraft.getInstance().player;

	   	if(KeyInit.mkeyMapping.consumeClick() && (player.isHolding(ModItems.LEGEND_SHIELD.get()) || player.isHolding(ModItems.LEGEND_SHIELD_RAGE.get()) || player.isHolding(ModItems.LEGEND_SHIELD_TWO_HEADED_DOG.get()) || player.isHolding(ModItems.LEGEND_SHIELD_BOOK.get()) || player.isHolding(ModItems.LEGEND_SHIELD_PICKAX.get()) ||player.isHolding(ModItems.LEGEND_SHIELD_LIGHT_METAL.get()))) {
	   		value++;
	   		if(value == 2 && !player.isHolding(ModItems.LEGEND_SHIELD.get())) {
	   			player.displayClientMessage(new TextComponent("Small Shield").withStyle(ChatFormatting.GRAY), false);  
	   		}
if(value == 3) {
		player.displayClientMessage(new TextComponent("Soul Eater Shield").withStyle(ChatFormatting.DARK_PURPLE), false);  
}
if(value == 4 && !player.isHolding(ModItems.LEGEND_SHIELD_RAGE.get())) {
	player.displayClientMessage(new TextComponent("Rage Shield").withStyle(ChatFormatting.DARK_RED), false);  
}
if(value == 4 && player.isHolding(ModItems.LEGEND_SHIELD_RAGE.get())) {
	value++;
}
if(value == 5 && !player.isHolding(ModItems.LEGEND_SHIELD_PICKAX.get())) {
	player.displayClientMessage(new TextComponent("Pickax Shield").withStyle(ChatFormatting.DARK_GRAY), false);  
}
if(value == 5 && player.isHolding(ModItems.LEGEND_SHIELD_PICKAX.get())) {
	value++;
}
if(value == 6 && !player.isHolding(ModItems.LEGEND_SHIELD_TWO_HEADED_DOG.get())) {
	player.displayClientMessage(new TextComponent("Two-headed Black Dog Shield").withStyle(ChatFormatting.BLACK), false);  
}
if(value == 6 && player.isHolding(ModItems.LEGEND_SHIELD_TWO_HEADED_DOG.get())) {
	value++;
}
if(value == 7 && !player.isHolding(ModItems.LEGEND_SHIELD_LIGHT_METAL.get())) {
	player.displayClientMessage(new TextComponent("Light Metal Shield").withStyle(ChatFormatting.GRAY), false);  
	
}
if(value == 7 && player.isHolding(ModItems.LEGEND_SHIELD_LIGHT_METAL.get())) {
	value++;
}
if(value == 8) {
	player.displayClientMessage(new TextComponent("Chimera Viper Shield").withStyle(ChatFormatting.DARK_GREEN), false);  
}
if(value == 8 && player.isHolding(ModItems.LEGEND_SHIELD_BOOK.get())) {
	value = 1;
}
if(value == 9 && !player.isHolding(ModItems.LEGEND_SHIELD_BOOK.get())) {
	player.displayClientMessage(new TextComponent("Book Shield").withStyle(ChatFormatting.YELLOW), false);  
	value = 1;

}
	   
	   	}}
}