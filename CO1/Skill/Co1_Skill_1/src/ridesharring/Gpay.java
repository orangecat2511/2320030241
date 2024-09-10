package ridesharring;

public class Gpay implements PaymentMethod{
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using Google Pay.");
	    }

}