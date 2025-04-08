package net.rummo.bnb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.rummo.bnb.item.BnBItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BnBRecipeProvider extends FabricRecipeProvider
{

    public BnBRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter recipeExporter)
    {
        return new RecipeGenerator(registryLookup, recipeExporter)
        {
            @Override
            public void generate()
            {
                RegistryWrapper.Impl<Item> itemlookup = registries.getOrThrow(RegistryKeys.ITEM);

                ///* Crafting *///

                /* SHAPELESS */

                /* SHAPED */

                /// Litematica Tool
                createShaped(RecipeCategory.TOOLS, BnBItems.LITEMATICA_TOOL, 1)
                        .pattern("SC")
                        .pattern("SS")
                        .input('S', Items.STICK)
                        .input('C', Items.COBBLESTONE)
                        .criterion("has_stick", conditionsFromItem(Items.STICK))
                        .criterion("has_cobblestone", conditionsFromItem(Items.COBBLESTONE))
                        .offerTo(exporter);

                /// Bundled Oak Saplings
                createShaped(RecipeCategory.MISC, BnBItems.BUNDLED_OAK_SAPLINGS, 1)
                        .pattern("OOO")
                        .pattern("OOO")
                        .pattern("OOO")
                        .input('O', Items.OAK_SAPLING)
                        .criterion("has_oak_sapling", conditionsFromItem(Items.OAK_SAPLING))
                        .offerTo(exporter);

                /* COOKING */

                /// Baked Apple
                offerSmelting(
                        List.of(Items.APPLE),
                        RecipeCategory.FOOD,
                        BnBItems.BAKED_APPLE,
                        0.35F,
                        200,
                        "apple_to_baked_apple"
                );

                offerFoodCookingRecipe(
                        "smoking",
                        RecipeSerializer.SMOKING,
                        SmokingRecipe::new,
                        100,
                        Items.APPLE,
                        BnBItems.BAKED_APPLE,
                        0.35F
                );

                offerFoodCookingRecipe(
                        "campfire",
                        RecipeSerializer.CAMPFIRE_COOKING,
                        CampfireCookingRecipe::new,
                        600,
                        Items.APPLE,
                        BnBItems.BAKED_APPLE,
                        0.35F
                );
            }
        };
    }


    @Override
    public String getName()
    {
        return "BnBRecipeProvider";
    }
}
