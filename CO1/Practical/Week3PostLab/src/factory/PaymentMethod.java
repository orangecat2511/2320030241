package factory;

interface PaymentMethod {
 void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of $" + amount);
 }
}

//PayPal.java (Concrete Product)
class PayPal implements PaymentMethod {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing PayPal payment of $" + amount);
 }
}

class DigitalWallet implements PaymentMethod {
 public void processPayment(double amount) {
     System.out.println("Processing digital wallet payment of $" + amount);
 }
}

//PaymentFactory.java (Abstract Factory)
interface PaymentFactory {
 PaymentMethod createPaymentMethod();
}

class CreditCardFactory implements PaymentFactory {
 public PaymentMethod createPaymentMethod() {
     return new CreditCard();
 }
}

//PayPalFactory.java (Concrete Factory)
class PayPalFactory implements PaymentFactory {
 @Override
 public PaymentMethod createPaymentMethod() {
     return new PayPal();
 }
}

class DigitalWalletFactory implements PaymentFactory {
 public PaymentMethod createPaymentMethod() {
     return new DigitalWallet();
 }
}

