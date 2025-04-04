package net.rummo.bnb.item;

import net.minecraft.component.type.FoodComponent;

public class BnBFoodComponents
{
    public static final FoodComponent BAKED_APPLE = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .build();
}
