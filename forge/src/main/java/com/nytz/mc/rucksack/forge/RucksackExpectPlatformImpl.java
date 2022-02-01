package com.nytz.mc.rucksack.forge;

import com.nytz.mc.rucksack.RucksackExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class RucksackExpectPlatformImpl {
    /**
     * This is our actual method to {@link RucksackExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
