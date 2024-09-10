package recipes;

import java.util.ArrayList;
import java.util.List;

public class RecipeFacade {
    private RecipeDatabase database;

    public RecipeFacade() {
        database = RecipeDatabase.getInstance();
        
    }

    public void submitRecipe(String name, String ingredients, String instructions) {
        Recipe recipe = new Recipe(name, ingredients, instructions);
        database.addRecipe(recipe);
    }
 
}


/*this method is used to make interaction between the methods easier. As facade design 
 pattern makes */
 