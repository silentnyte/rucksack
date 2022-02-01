package com.nytz.mc.rucksack.fabric;

import com.nytz.mc.rucksack.RucksackExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class RucksackExpectPlatformImpl {
    /**
     * This is our actual method to {@link RucksackExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
