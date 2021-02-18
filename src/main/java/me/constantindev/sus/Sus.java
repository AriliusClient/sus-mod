package me.constantindev.sus;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sus implements ModInitializer {

    public static final String MOD_ID = "sus";
    public static final String MOD_NAME = "Sus";
    public static Logger LOGGER = LogManager.getLogger();

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "\uD83D\uDE33");
        //TODO: Initializer
    }

}