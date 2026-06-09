package org.deltaqb.stevespaceprogram.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterDimensionSpecialEffectsEvent;
import org.deltaqb.stevespaceprogram.SteveSpaceProgram;

import static org.deltaqb.stevespaceprogram.SteveSpaceProgram.id;

@EventBusSubscriber(modid = SteveSpaceProgram.MODID, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void onRegisterEffects(RegisterDimensionSpecialEffectsEvent event) {
        event.register(
                id("space_effects"),
                new SpaceDimensionEffects()
        );
    }
}