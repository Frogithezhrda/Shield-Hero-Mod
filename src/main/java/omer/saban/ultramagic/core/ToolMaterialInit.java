package omer.saban.ultramagic.core;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {
	public static float attack = 0f;
	public static float speed = 0.5f;
    public static Tier LEGEND = new BaseToolMaterial(attack, 30, 12, 12, 500, () ->Ingredient.of(ModItems.LEGEND_SHIELD.get()));

    private ToolMaterialInit() {
    }
}
