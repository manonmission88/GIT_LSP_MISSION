package org.howard.edu.lsp.oopfinal.question2;


/*
 * @author : Manish Niure
 * //Concrete PayPalPayment class
 */

class PayPalPayment implements PaymentStrategy {
 private String email;

 public PayPalPayment(String email) {
     this.email = email;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using PayPal account " + email);
 }
}

