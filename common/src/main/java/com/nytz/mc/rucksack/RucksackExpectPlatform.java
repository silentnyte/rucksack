package com.nytz.mc.rucksack;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;

import java.nio.file.Path;

public class RucksackExpectPlatform {
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Rucksack:
     * Expect: com.nytz.mc.rucksack.RucksackExpectPlatform#getConfigDirectory()
     * Actual Fabric: com.nytz.mc.rucksack.fabric.RucksackExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: com.nytz.mc.rucksack.forge.RucksackExpectPlatformImpl#getConfigDirectory()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
