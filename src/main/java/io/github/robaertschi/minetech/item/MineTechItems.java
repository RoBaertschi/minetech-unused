package io.github.robaertschi.minetech.item;

import io.github.robaertschi.minetech.MineTech;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class MineTechItems {


    public static final Item TIN_INGOT =
            registerItem("tin_ingot",
                    new Item(new Item.Settings().rarity(Rarity.COMMON).group(MineTechItemGroups.MINE_TECH_ITEM_GROUP)));


    public static final Item TIN_NUGGET =
            registerItem("tin_nugget",
                    new Item(new Item.Settings().rarity(Rarity.COMMON).group(MineTechItemGroups.MINE_TECH_ITEM_GROUP)));

    public static final Item RAW_TIN =
            registerItem("raw_tin",
                    new Item(new Item.Settings().rarity(Rarity.COMMON).group(MineTechItemGroups.MINE_TECH_ITEM_GROUP)));

    /**
     * @param name The Registry name of the new item.
     * @param item The Item that should be registered.
     * @return Returns the Item.
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MineTech.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MineTech.LOGGER.debug("Registering Mod Items for " + MineTech.MOD_ID);
    }

}
