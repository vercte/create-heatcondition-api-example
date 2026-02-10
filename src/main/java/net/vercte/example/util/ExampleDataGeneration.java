package net.vercte.example.util;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.vercte.example.util.data.ExampleCompactingRecipeGen;
import net.vercte.example.util.data.ExampleMixingRecipeGen;

import java.util.concurrent.CompletableFuture;

public class ExampleDataGeneration {
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ExampleCompactingRecipeGen(output, registries));
        generator.addProvider(event.includeServer(), new ExampleMixingRecipeGen(output, registries));
    }
}
