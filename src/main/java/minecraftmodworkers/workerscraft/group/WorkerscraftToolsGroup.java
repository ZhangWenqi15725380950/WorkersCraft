package minecraftmodworkers.workerscraft.group;

import minecraftmodworkers.workerscraft.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WorkerscraftToolsGroup extends ItemGroup {

    public WorkerscraftToolsGroup()
    {
        super("WorkersCraft Tools");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegister.emerald_sword.get());
    }
}
