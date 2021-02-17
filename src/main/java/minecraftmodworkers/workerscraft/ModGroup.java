package minecraftmodworkers.workerscraft;

import minecraftmodworkers.workerscraft.Group.WorkersCraftFoodsGroup;
import minecraftmodworkers.workerscraft.Group.WorkersCraftGroup;
import minecraftmodworkers.workerscraft.Group.WorkerscraftToolsGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModGroup {

    public static ItemGroup itemGroup = new WorkersCraftGroup();
    public static ItemGroup itemGroupFoods = new WorkersCraftFoodsGroup();
    public static ItemGroup itemGroupTools = new WorkerscraftToolsGroup();
}
