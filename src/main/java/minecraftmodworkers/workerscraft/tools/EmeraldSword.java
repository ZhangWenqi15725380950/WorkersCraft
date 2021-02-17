package minecraftmodworkers.workerscraft.tools;

import minecraftmodworkers.workerscraft.ItemRegister;
import minecraftmodworkers.workerscraft.ModGroup;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

public class EmeraldSword extends SwordItem {

    public EmeraldSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    public EmeraldSword()
    {
        super(iItemTier, 3, -2.4F, new Properties().group(ModGroup.itemGroupTools));
    }

    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2000;
        }

        @Override
        public float getEfficiency() {
            return 10.0F;
        }

        @Override
        public float getAttackDamage() {
            return 4.0F;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 30;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.EMERALD);
        }
    };
}
