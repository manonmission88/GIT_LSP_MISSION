package org.howard.edu.lsp.oopfinal.question2;

/*
 * @author : Manish Niure 
 * PaymentStrategyDriver class
 */

public class PaymentStrategyDriver {
 public static void main(String[] args) {
	 
     // Creating instances of payment strategies
     PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
     PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
     PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

     // Creating shopping cart
     ShoppingCart cart = new ShoppingCart();

     // Checking out with different payment strategies
     cart.setPaymentStrategy(creditCardPayment);
     cart.checkout(100.0);

     cart.setPaymentStrategy(payPalPayment);
     cart.checkout(50.0);

     cart.setPaymentStrategy(bitcoinPayment);
     cart.checkout(75.0);
     
     // Expected Output : 
  // Output 

//     Paid 100.0 using credit card 1234-5678-9012-3456 
//
//     Paid 50.0 using PayPal account user@example.com 
//
//     Paid 75.0 using Bitcoin address 1AaBbCcDdEeFfGgHh 
 }
}
