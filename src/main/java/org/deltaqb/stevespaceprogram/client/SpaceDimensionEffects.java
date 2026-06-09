package org.deltaqb.stevespaceprogram.client;

import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class SpaceDimensionEffects extends DimensionSpecialEffects {
    public SpaceDimensionEffects() {
        super(Float.NaN, false, SkyType.NONE, false, true);
    }

    @Override
    public @NotNull Vec3 getBrightnessDependentFogColor(@NotNull Vec3 baseFogColor, float brightness) {
        return new Vec3(0.5, 0, 0.5);
    }

    @Override
    public boolean isFoggyAt(int p_108883_, int p_108884_) {
        return false;
    }

    @Override
    public float[] getSunriseColor(float p_108871_, float p_108872_) {
        return null;
    }
}