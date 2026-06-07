package org.deltaqb.stevespaceprogram.all;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.deltaqb.stevespaceprogram.SteveSpaceProgram;

public class AllEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, SteveSpaceProgram.MODID);
}
