package net.rummo.bnb.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.rummo.bnb.RummosBitsNBaubles;
import net.rummo.bnb.item.BnBItems;
import net.rummo.bnb.util.BnBTags;

import java.util.concurrent.CompletableFuture;

public class BnBItemTagProvider extends FabricTagProvider.ItemTagProvider
{

    public BnBItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BnBTags.Items.BUNDLED_SAPLINGS)
                .add(BnBItems.BUNDLED_OAK_SAPLINGS);
    }
}
