package net.vercte.example.util.data;

import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.vercte.example.HeatConditionAPIExample;
import net.vercte.example.ModHeatConditions;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class ExampleCompactingRecipeGen extends CompactingRecipeGen {
    public ExampleCompactingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, HeatConditionAPIExample.ID);
    }

    GeneratedRecipe ICE = create("ice", b ->
            b.require(Fluids.WATER, 1000)
             .requiresHeat(ModHeatConditions.ICED)
             .output(Items.ICE)
    );
}
