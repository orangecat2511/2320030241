package facade;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantFacade facade = new RestaurantFacade();

        System.out.println("Welcome to the Restaurant!");
        System.out.print("Enter the menu item: ");
        String item = scanner.nextLine();

        System.out.print("Enter your card number: ");
        String cardNumber = scanner.nextLine();

        String result = facade.placeOrder(item, cardNumber);
        System.out.println(result);
    }
}
