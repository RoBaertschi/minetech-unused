package io.github.robaertschi.minetech.item;

import io.github.robaertschi.minetech.MineTech;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class MineTechItems {


    public static final Item TIN_INGOT =
            registerItem("tin_ingot",
                    new Item(new Item.Settings().rarity(Rarity.COMMON)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MineTech.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MineTech.LOGGER.debug("Registering Mod Items for " + MineTech.MOD_ID);
    }

}
