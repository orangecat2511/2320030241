package recipes;

import java.util.ArrayList;
import java.util.List;

public class RecipeDatabase {
    private static RecipeDatabase instance;
    private List<Recipe> recipes;

    private RecipeDatabase() {
        recipes = new ArrayList<>();
    }

    public static RecipeDatabase getInstance() {
        if (instance == null) {
            instance = new RecipeDatabase();
        }
        return instance;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
