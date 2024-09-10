package ridesharring;

public class CreditCardFactory implements PaymentFactory{
	     public PaymentMethod createPaymentMethod() {
	        return new CreditCard();
	    }

}