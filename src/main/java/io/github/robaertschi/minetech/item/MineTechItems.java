package io.github.robaertschi.minetech.item;

import io.github.robaertschi.minetech.MineTech;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class MineTechItems {


    public static final Item TIN_INGOT =
            registerItem("tin_ingot",
                    new Item(new Item.Settings().rarity(Rarity.COMMON).group(MineTechItemGroups.MINE_TECH_ITEM_GROUP)));


    /**
     * TODO: Remove @SuppressWarnings
     * @param name The Registry name of the new item.
     * @param item The Item that should be registered.
     * @return Returns the Item.
     */
    @SuppressWarnings("SameParameterValue")
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MineTech.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MineTech.LOGGER.debug("Registering Mod Items for " + MineTech.MOD_ID);
    }

}
