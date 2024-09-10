package facade;

class RestaurantFacade {
    private Menu menu;
    private OrderProcessor orderProcessor;

    public RestaurantFacade() {
        this.menu = new Menu();
        this.orderProcessor = new OrderProcessor();
    }

    public String placeOrder(String item, String cardNumber) {
        if (!menu.isAvailable(item)) {
            return "Menu item not available!";
        }
        orderProcessor.processOrder(item);
        return "Order placed successfully!";
    }
}
