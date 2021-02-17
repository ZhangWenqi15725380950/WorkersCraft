package minecraftmodworkers.workerscraft.Group;

import minecraftmodworkers.workerscraft.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WorkersCraftFoodsGroup extends ItemGroup {

    public WorkersCraftFoodsGroup()
    {
        super("WorkersCraft Food");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemRegister.diamond_apple.get());
    }
}
