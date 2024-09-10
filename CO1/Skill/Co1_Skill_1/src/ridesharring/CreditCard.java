package ridesharring;

public class CreditCard implements PaymentMethod{
	 public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
	 }

}
