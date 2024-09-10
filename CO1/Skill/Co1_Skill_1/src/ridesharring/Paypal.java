package ridesharring;

public class Paypal implements PaymentMethod{
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using PayPal.");
	    }
}

