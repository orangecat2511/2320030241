package recipes;

import java.util.List;
import java.util.Scanner;

public class RecipeApp {
    public static void main(String[] args) {
        RecipeFacade facade = new RecipeFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Submit Recipe");
            System.out.println("2. View Recipes");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.print("Enter recipe name: ");
                String name = scanner.nextLine();

                System.out.print("Enter ingredients: ");
                String ingredients = scanner.nextLine();

                System.out.print("Enter instructions: ");
                String instructions = scanner.nextLine();

                facade.submitRecipe(name, ingredients, instructions);
                System.out.println("Recipe submitted!");

            } else if (choice == 2) {
                List<Recipe> recipes = RecipeDatabase.getInstance().getRecipes();
                if (recipes.isEmpty()) {
                    System.out.println("No recipes available.");
                } else {
                    for (Recipe recipe : recipes) {
                        System.out.println("\nRecipe: " + recipe.getName());
                        System.out.println("Ingredients: " + recipe.getIngredients());
                        System.out.println("Instructions: " + recipe.getInstructions());
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
