package net.rummo.bnb.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.rummo.bnb.item.BnBItems;

public class BnBModelProvider extends FabricModelProvider
{

    public BnBModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
//        blockStateModelGenerator.registerSimpleCubeAll(BnBBlocks.MANGO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(BnBItems.BAKED_APPLE, Models.GENERATED);
        itemModelGenerator.register(BnBItems.LITEMATICA_TOOL, Models.GENERATED);
    }
}
