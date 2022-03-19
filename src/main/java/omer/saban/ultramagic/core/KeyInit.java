package omer.saban.ultramagic.core;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.fmlclient.registry.ClientRegistry;
import omer.saban.ultramagic.UltraMagic;

public class KeyInit {
private KeyInit() {
	
}
public static KeyMapping mkeyMapping;
public static void init() {
	mkeyMapping = registerKey("ultra_key", KeyMapping.CATEGORY_GAMEPLAY, InputConstants.KEY_H);
}
private static KeyMapping registerKey(String name,String category,int keycode) {
	final var key = new KeyMapping("key." + UltraMagic.MODID +"." +name,keycode,category);
	ClientRegistry.registerKeyBinding(key);
	return key;
}
}
