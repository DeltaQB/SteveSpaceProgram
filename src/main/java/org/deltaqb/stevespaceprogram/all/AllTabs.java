package org.deltaqb.stevespaceprogram.all;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.deltaqb.stevespaceprogram.SteveSpaceProgram;

public class AllTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SteveSpaceProgram.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("main_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.stevespaceprogram.main_tab")).withTabsBefore(CreativeModeTabs.COMBAT).displayItems((parameters, output) -> {

    }).build());
}
