package net.vercte.example;

import com.simibubi.create.api.recipe.HeatCondition;
import com.simibubi.create.api.registry.CreateBuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vercte.example.condition.IcedCondition;
import net.vercte.example.condition.LowHeatedCondition;

import java.util.function.Supplier;

public class ModHeatConditions {
    private static final DeferredRegister<HeatCondition> HEAT_CONDITIONS = DeferredRegister.create(CreateBuiltInRegistries.HEAT_CONDITION, HeatConditionAPIExample.ID);

    public static final Supplier<HeatCondition> LOW_HEATED = HEAT_CONDITIONS.register("low_heated", LowHeatedCondition::new);
    public static final Supplier<HeatCondition> ICED = HEAT_CONDITIONS.register("iced", IcedCondition::new);

    public static void loadAndRegister(IEventBus modEventBus) {
        HEAT_CONDITIONS.register(modEventBus);
    }
}
