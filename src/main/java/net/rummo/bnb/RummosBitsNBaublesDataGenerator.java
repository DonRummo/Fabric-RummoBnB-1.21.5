package net.rummo.bnb;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.rummo.bnb.datagen.*;

public class RummosBitsNBaublesDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BnBBlockTagProvider::new);
		pack.addProvider(BnBItemTagProvider::new);
		pack.addProvider(BnBLootTableProvider::new);
		pack.addProvider(BnBModelProvider::new);
		pack.addProvider(BnBRecipeProvider::new);
	}
}
