package io.github.robaertschi.minetech;

import io.github.robaertschi.minetech.block.MineTechBlocks;
import io.github.robaertschi.minetech.item.MineTechItems;
import io.github.robaertschi.minetech.world.feature.MineTechConfiguredFeatures;
import io.github.robaertschi.minetech.world.gen.MineTechOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MineTech implements ModInitializer {

    public static final String MOD_ID = "minetech";

    public static final Logger LOGGER = LoggerFactory.getLogger("minetech");

    @Override
    public void onInitialize() {
        MineTechConfiguredFeatures.registerConfiguredFeatures();

        MineTechItems.registerModItems();
        MineTechBlocks.registerModBlocks();

        MineTechOreGeneration.generateOres();
    }
}
