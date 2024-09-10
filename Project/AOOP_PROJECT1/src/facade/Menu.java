package facade;

import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<String> availableItems;

    public Menu() {
        availableItems = Arrays.asList("Pizza", "Pasta", "Salad", "Burger", "Sandwich", "Soup");
    }

    public boolean isAvailable(String item) {
        return availableItems.contains(item);
    }
}