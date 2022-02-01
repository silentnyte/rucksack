package com.nytz.mc.rucksack.fabric;

import com.nytz.mc.rucksack.RucksackMod;
import net.fabricmc.api.ModInitializer;

public class RucksackModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RucksackMod.init();
    }
}
