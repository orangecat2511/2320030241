package ridesharring;

public class PaypalFactory implements PaymentFactory{
	    public PaymentMethod createPaymentMethod() {
	        return new Paypal();
	    }

}
