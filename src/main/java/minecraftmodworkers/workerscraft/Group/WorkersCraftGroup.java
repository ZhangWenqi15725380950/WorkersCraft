package minecraftmodworkers.workerscraft.Group;

import minecraftmodworkers.workerscraft.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WorkersCraftGroup extends ItemGroup {

    public WorkersCraftGroup()
    {
        super("WorkersCraft");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegister.obsidian_ingot.get());
    }
}
