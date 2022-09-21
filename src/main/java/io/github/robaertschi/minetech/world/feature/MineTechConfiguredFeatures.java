package io.github.robaertschi.minetech.world.feature;

import io.github.robaertschi.minetech.MineTech;
import io.github.robaertschi.minetech.block.MineTechBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class MineTechConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, MineTechBlocks.TIN_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, MineTechBlocks.DEEPSLATE_TIN_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN_ORE =
            ConfiguredFeatures.register("tin_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TIN_ORES, 12));

    public static void registerConfiguredFeatures() {
        MineTech.LOGGER.debug("Registering Configured Features.");
    }
}
