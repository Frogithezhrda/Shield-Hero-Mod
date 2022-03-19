package omer.saban.ultramagic.core;

import java.util.function.Supplier;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import omer.saban.ultramagic.UltraMagic;

@Mod.EventBusSubscriber(modid = UltraMagic.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientForgeEvent {

    private ClientForgeEvent() {
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
    	KeyInit.init();

	   	}
    
}