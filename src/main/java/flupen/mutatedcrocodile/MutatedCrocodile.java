package flupen.mutatedcrocodile;

import net.fabricmc.api.ModInitializer;

import net.minecraft.data.client.ModelIds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//very important comment
public class MutatedCrocodile implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("mutatedcrocodile");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}