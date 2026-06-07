package org.deltaqb.stevespaceprogram;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.deltaqb.stevespaceprogram.all.*;
import org.slf4j.Logger;

@Mod(SteveSpaceProgram.MODID)
public class SteveSpaceProgram {
    public static final String MODID = "stevespaceprogram";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation id(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }

    public SteveSpaceProgram(IEventBus modEventBus, ModContainer modContainer) {
        AllBlocks.BLOCKS.register(modEventBus);
        AllItems.ITEMS.register(modEventBus);
        AllTabs.CREATIVE_MODE_TABS.register(modEventBus);
        AllBlockEntities.BLOCK_ENTITY_TYPES.register(modEventBus);
        AllEntities.ENTITY_TYPES.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    @EventBusSubscriber(modid = MODID)
    public static class ModEvents {
        @SubscribeEvent
        public static void commonSetup(final FMLCommonSetupEvent event) {

        }
    }
}
