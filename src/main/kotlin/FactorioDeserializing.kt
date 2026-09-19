package com.factorisynth

import java.nio.file.Path

public data class Recipe(
    val name: String,
    val category: String,
    val ingredients: List<Ingredient>,
    val products: List<Product>,
    val mainProduct: Product,
    val allowedEffects: Effect,
    val maximumProductivity: Int,
    val energy: Double,
    val order: String,
    val group: String,
    val subgroup: String,
    val enabled: Boolean,
    val productivityBonus: Int
)

public data class Ingredient(
    val type: String,
    val name: String,
    val amount: Int
)

public data class Product(
    val type: String,
    val name: String,
    val probability: Int,
    val amount: Int
)

public data class Effect(
    val consumption: Boolean,
    val speed: Boolean,
    val productivity: Boolean,
    val pollution: Boolean,
    val quality: Boolean
)

/*
 * Deserializes a recipe.lua file which contains the definitions of the recipe prototypes.
 *
 * @property recipeFile the file to be deserialized
 * @return
 */
public fun deserializeRecipes(recipeFile: Path) {

}

private fun extractRecipesFromDataExtend(recipeFileValue: String) {

}