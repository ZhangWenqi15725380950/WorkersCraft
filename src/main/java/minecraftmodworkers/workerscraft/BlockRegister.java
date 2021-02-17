package minecraftmodworkers.workerscraft;

import minecraftmodworkers.workerscraft.block.FirstLevelCompressedCobblestone;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, "workerscraft");

    //Register FirstLCompressedCobblestone here
    public static RegistryObject<Block> firstLevelcompressedCobblestone = BLOCK.register("FirstLCompressedCobblestone", FirstLevelCompressedCobblestone::new);

}
