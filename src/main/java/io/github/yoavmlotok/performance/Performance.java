package io.github.yoavmlotok.performance;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Performance implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Performance");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello world from {}!", mod.metadata().name());
	}
}
