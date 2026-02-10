package net.vercte.example.condition;

import com.simibubi.create.api.recipe.HeatCondition;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class IcedCondition implements HeatCondition {
    private List<ItemStack> itemHints = null;

    @Override
    public boolean test(Level level, BlockPos blockPos) {
        BlockState below = level.getBlockState(blockPos.below());
        return below.is(Blocks.BLUE_ICE);
    }

    @Override
    public @NotNull List<ItemStack> getItemHints() {
        if(itemHints == null)
            this.itemHints = List.of(new ItemStack(Items.BLUE_ICE));
        return itemHints;
    }

    @Override
    public int getColor() {
        return 0x339ADE;
    }
}
