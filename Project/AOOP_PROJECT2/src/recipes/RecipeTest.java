package recipes;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RecipeTest {

    @Test
    void testSubmitRecipe() {
        RecipeFacade facade = new RecipeFacade();
        facade.submitRecipe("Pancakes", "Flour, Eggs, Milk", "Mix and cook");

        List<Recipe> recipes = RecipeDatabase.getInstance().getRecipes();
        assertEquals(1, recipes.size());
        assertEquals("Pancakes", recipes.get(0).getName());
    }
}
