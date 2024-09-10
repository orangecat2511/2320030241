package ridesharring;


public class Ridesharingapp {
	public static void main(String[] args) {
      
        User auth = User.getInstance();
        auth.login("sam");

      
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.createVehicle("car");
        vehicle.drive();

        PaymentFactory paymentFactory = new CreditCardFactory();
        PaymentMethod payment = paymentFactory.createPaymentMethod();
        payment.pay(50.0);

        auth.logout();
    }

}
