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

public class LowHeatedCondition implements HeatCondition {
    @Override
    public boolean test(Level level, BlockPos blockPos) {
        BlockState below = level.getBlockState(blockPos.below());
        return below.is(Blocks.CAMPFIRE);
    }

    @Override
    public String getTranslationKey() {
        return "example.recipe.heat_requirement.low_heated";
    }

    @Override
    public @NotNull List<ItemStack> getItemHints() {
        return List.of(
                new ItemStack(Items.CAMPFIRE)
        );
    }

    @Override
    public int getColor() {
        return 0xDE5533;
    }
}
