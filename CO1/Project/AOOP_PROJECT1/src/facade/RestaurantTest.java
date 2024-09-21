
package facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RestaurantTest {

    @Test
    void testPlaceOrder() {
        RestaurantFacade facade = new RestaurantFacade();
        String result = facade.placeOrder("Pizza", "1234-5678-9012-3456");
        assertEquals("Order placed successfully!", result);
    }

    @Test
    void testInvalidMenuItem() {
        RestaurantFacade facade = new RestaurantFacade();
        String result = facade.placeOrder("Steak", "1234-5678-9012-3456"); // Changed to an item not in the menu
        assertEquals("Menu item not available!", result);
    }
}
