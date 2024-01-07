package com.object_oriented_programming_2;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipie1 recipe = new Recipie1();
        recipe.execute();

        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        recipeWithMicrowave.execute();
    }
}
