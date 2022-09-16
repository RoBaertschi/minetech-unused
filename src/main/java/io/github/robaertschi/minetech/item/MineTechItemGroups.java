package io.github.robaertschi.minetech.item;

import io.github.robaertschi.minetech.MineTech;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MineTechItemGroups {

    public static final ItemGroup MINE_TECH_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MineTech.MOD_ID, "mine_tech_item_group"),
            () -> new ItemStack(MineTechItems.TIN_INGOT)
    );

}
