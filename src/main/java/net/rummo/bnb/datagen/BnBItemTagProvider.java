package net.rummo.bnb.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.rummo.bnb.item.BnBItems;

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
//        getOrCreateTagBuilder(BnBTags.Items.TRANSFORMABLE_ITEMS)
//                .add(BnBItems.BAKED_APPLE);
    }
}
