package com.buuz135.darkmodeeverywhere;

import net.fabricmc.api.ModInitializer;
import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.api.fml.event.config.ModConfigEvents;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DarkModeEverywhere implements ModInitializer {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public void onInitialize() {
        ModLoadingContext.registerConfig("darkmodeeverywhere", ModConfig.Type.CLIENT, DarkConfig.CLIENT.SPEC);
        ModConfigEvents.reloading("darkmodeeverywhere").register(DarkConfig.CLIENT::onConfigReload);
    }

}
