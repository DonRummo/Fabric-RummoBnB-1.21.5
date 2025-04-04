package net.rummo.bnb.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.rummo.bnb.RummosBitsNBaubles;

import java.util.function.Function;

import static net.minecraft.registry.Registries.ITEM;

public class BnBItems
{
    public static final Item BAKED_APPLE = registerItem("baked_apple", Item::new, new Item.Settings()
            .food(BnBFoodComponents.BAKED_APPLE));

    public static final Item LITEMATICA_TOOL = registerItem("litematica_tool", Item::new, new Item.Settings()
            .maxCount(1));

    // Helper method to register items
    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings)
    {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("rummobnb", name));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerBnBItems()
    {
        RummosBitsNBaubles.LOGGER.info("Registering Mod Items for " + RummosBitsNBaubles.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            for (Item item : ITEM)
            {
                entries.add(BAKED_APPLE);
            }
        });
    }
}
