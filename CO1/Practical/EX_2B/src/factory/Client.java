package factory;


public class Client {
 public static void main(String[] args) {
     // User Authentication (Singleton)
     UserAuthentication auth = UserAuthentication.getInstance();
     auth.login("JohnDoe");

     // Vehicle Request (Factory Method)
     VehicleFactory vehicleFactory = new CarFactory(); // Can also use BikeFactory or ScooterFactory
     Vehicle vehicle = vehicleFactory.createVehicle();
     vehicle.ride();

     // Payment Process (Abstract Factory)
     PaymentFactory paymentFactory = new PayPalFactory(); // Can also use CreditCardFactory or DigitalWalletFactory
     PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
     paymentMethod.processPayment(25.75);

     // Log out the user
     auth.logout();
 }
}

