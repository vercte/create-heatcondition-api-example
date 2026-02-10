package net.vercte.example;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.vercte.example.util.ExampleDataGeneration;

@Mod(HeatConditionAPIExample.ID)
public class HeatConditionAPIExample {
    public static final String ID = "example";

    public HeatConditionAPIExample(IEventBus modEventBus) {
        ModHeatConditions.loadAndRegister(modEventBus);

        modEventBus.addListener(ExampleDataGeneration::gatherData);
    }

    public static ResourceLocation at(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}
