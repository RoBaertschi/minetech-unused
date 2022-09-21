package io.github.robaertschi.minetech.block;

import io.github.robaertschi.minetech.MineTech;
import io.github.robaertschi.minetech.item.MineTechItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MineTechBlocks {

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f)),
            MineTechItemGroups.MINE_TECH_ITEM_GROUP
    );

    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .requiresTool().strength(4.5f, 3.0f).mapColor(MapColor.DEEPSLATE_GRAY)
                    .sounds(BlockSoundGroup.DEEPSLATE)),
            MineTechItemGroups.MINE_TECH_ITEM_GROUP
    );

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MineTech.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MineTech.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MineTech.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        MineTech.LOGGER.debug("Registering ModBlocks for " + MineTech.MOD_ID);
    }
}
