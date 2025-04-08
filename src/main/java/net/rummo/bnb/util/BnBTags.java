package net.rummo.bnb.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.rummo.bnb.RummosBitsNBaubles;

public class BnBTags
{
    public static class Block
    {
//        private static TagKey<Block> createTag(String name)
//        {
//            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RummosBitsNBaubles.MOD_ID, name));
//        }
    }

    public static class Items
    {
        public static final TagKey<Item> BUNDLED_SAPLINGS = createTag("bundled_saplings");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RummosBitsNBaubles.MOD_ID, name));
        }
    }
}
