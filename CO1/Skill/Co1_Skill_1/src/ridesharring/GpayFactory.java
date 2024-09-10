package ridesharring;

public class GpayFactory implements PaymentFactory{
	  @Override
	    public PaymentMethod createPaymentMethod() {
	        return new Gpay();
	    }

}
