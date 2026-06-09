package org.deltaqb.stevespaceprogram.all;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

import static org.deltaqb.stevespaceprogram.SteveSpaceProgram.id;

public class Dimensions {
    public static final ResourceKey<Level> SPACE_DIMENSION =
            ResourceKey.create(
                    Registries.DIMENSION,
                    id("space")
            );
}