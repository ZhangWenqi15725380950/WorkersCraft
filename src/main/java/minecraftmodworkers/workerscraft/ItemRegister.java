package minecraftmodworkers.workerscraft;

import minecraftmodworkers.workerscraft.foods.DiamondApple;
import minecraftmodworkers.workerscraft.item.ObsidianIngot;
import minecraftmodworkers.workerscraft.tools.EmeraldSword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister
{
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, "workerscraft");
    //Register DiamondApple here

    public static final RegistryObject<Item> diamond_apple = ITEM.register("diamond_apple", DiamondApple::new);

    //Register EmeraldSword here
    public static final RegistryObject<Item> emerald_sword = ITEM.register("emerald_sword", EmeraldSword::new);

    //Register ObsidianIngot here
    public static final RegistryObject<Item> obsidian_ingot = ITEM.register("obsidian_ingot", ObsidianIngot::new);
}
