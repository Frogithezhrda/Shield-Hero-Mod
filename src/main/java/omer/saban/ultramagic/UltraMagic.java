package omer.saban.ultramagic;

import java.util.function.Supplier;

import com.sun.jdi.event.Event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import omer.saban.ultramagic.core.KeyInit;
import omer.saban.ultramagic.core.ModEffects;
import omer.saban.ultramagic.core.ModEntities;
import omer.saban.ultramagic.core.ModItems;
import omer.saban.ultramagic.core.WolfEntity;

@Mod(UltraMagic.MODID)
public class UltraMagic {
    public static final String MODID = "shield";


    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
    	KeyInit.init();
    }


public UltraMagic() {
        final var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModEffects.EFFECTS.register(bus);
        ModEntities.ENTITIES.register(bus);

    }
}
