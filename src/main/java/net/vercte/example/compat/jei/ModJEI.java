package net.vercte.example.compat.jei;

import com.simibubi.create.compat.jei.CreateJEI;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.resources.ResourceLocation;
import net.vercte.example.HeatConditionAPIExample;
import net.vercte.example.ModHeatConditions;
import org.jetbrains.annotations.NotNull;

@JeiPlugin
public class ModJEI implements IModPlugin {
    @Override
    @NotNull
    public ResourceLocation getPluginUid() {
        return HeatConditionAPIExample.at("jei");
    }

    @Override
    public void onRuntimeAvailable(@NotNull IJeiRuntime jeiRuntime) {
        CreateJEI.HEAT_CONDITION_DRAWABLES.register(ModHeatConditions.LOW_HEATED.get(), new LowHeatedDrawable());
        CreateJEI.HEAT_CONDITION_DRAWABLES.register(ModHeatConditions.ICED.get(), new IcedDrawable());
    }
}
