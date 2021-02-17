package minecraftmodworkers.workerscraft.foods;

import minecraftmodworkers.workerscraft.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DiamondApple extends Item
{
    private static final EffectInstance e2 = new EffectInstance(Effects.ABSORPTION,480 * 20, 1);
    private static final EffectInstance e3 = new EffectInstance(Effects.FIRE_RESISTANCE,480 * 20, 1);
    private static final EffectInstance e4 = new EffectInstance(Effects.JUMP_BOOST,480 * 20, 1);
    private static final EffectInstance e5 = new EffectInstance(Effects.SATURATION,480 * 20, 1);
    private static final EffectInstance e6 = new EffectInstance(Effects.SPEED,480 * 20, 1);
    private static final Food food = (new Food.Builder()).saturation(10).hunger(20).effect(new EffectInstance(Effects.REGENERATION, 100, 1),1.0F).effect(e2, 1).effect(e3, 1).effect(e4, 1).effect(e5, 1).effect(e6, 1).build();

    public DiamondApple() {
        super(new Properties().food(food).group(ModGroup.itemGroupFoods));
    }


}