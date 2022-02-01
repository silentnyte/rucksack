package com.nytz.mc.rucksack.forge;

import dev.architectury.platform.forge.EventBuses;
import com.nytz.mc.rucksack.RucksackMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RucksackMod.MOD_ID)
public class RucksackModForge {
    public RucksackModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(RucksackMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RucksackMod.init();
    }
}
