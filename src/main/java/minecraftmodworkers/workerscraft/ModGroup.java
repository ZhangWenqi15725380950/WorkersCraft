package minecraftmodworkers.workerscraft;

import minecraftmodworkers.workerscraft.group.WorkersCraftFoodsGroup;
import minecraftmodworkers.workerscraft.group.WorkersCraftGroup;
import minecraftmodworkers.workerscraft.group.WorkerscraftToolsGroup;
import net.minecraft.item.ItemGroup;

public class ModGroup {

    public static ItemGroup itemGroup = new WorkersCraftGroup();
    public static ItemGroup itemGroupFoods = new WorkersCraftFoodsGroup();
    public static ItemGroup itemGroupTools = new WorkerscraftToolsGroup();
}
