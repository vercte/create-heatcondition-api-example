package net.vercte.example;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(HeatConditionAPIExample.ID)
public class HeatConditionAPIExample {
    public static final String ID = "example";

    public HeatConditionAPIExample(IEventBus modEventBus) {
        ModHeatConditions.loadAndRegister(modEventBus);
    }

    public static ResourceLocation at(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}
