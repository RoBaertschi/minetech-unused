package io.github.robaertschi.minetech.world.feature;

import io.github.robaertschi.minetech.MineTechCons;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class MineTechPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> TIN_ORE_PLACED = PlacedFeatures.register("tin_ore_placed",
            MineTechConfiguredFeatures.TIN_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.aboveBottom(MineTechCons.TIN_LOWEST_LEVEL), YOffset.aboveBottom(MineTechCons.TIN_HIGHEST_LEVEL))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
