package net.vercte.example.util.data;

import com.simibubi.create.AllFluids;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;
import net.vercte.example.HeatConditionAPIExample;
import net.vercte.example.ModHeatConditions;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class ExampleMixingRecipeGen extends MixingRecipeGen {
    public ExampleMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, HeatConditionAPIExample.ID);
    }

    GeneratedRecipe CHOCOLATE_LOW_HEATED = create("chocolate_low_heated", b ->
            b.require(AllItems.BAR_OF_CHOCOLATE)
             .requiresHeat(ModHeatConditions.LOW_HEATED)
             .output(AllFluids.CHOCOLATE.get(), 250)
    );

    GeneratedRecipe TEA_LOW_HEATED = create("tea_low_heated", b ->
            b.require(ItemTags.LEAVES)
             .require(Fluids.WATER, 250)
             .require(Tags.Fluids.MILK, 250)
             .requiresHeat(ModHeatConditions.LOW_HEATED)
             .output(AllFluids.TEA.get(), 500)
    );

    GeneratedRecipe POWDERED_SNOW = create("powder_snow_bucket", b ->
            b.require(Items.SNOWBALL)
                    .require(Fluids.WATER, 750)
                    .require(Items.BUCKET)
                    .requiresHeat(ModHeatConditions.ICED)
                    .output(Items.POWDER_SNOW_BUCKET)
    );
}
