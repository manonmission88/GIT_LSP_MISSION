package org.howard.edu.lsp.oopfinal.question2;

/*
 * @author : Manish Niure
 * //Concrete CreditCardPayment class
 */

class CreditCardPayment implements PaymentStrategy {
 private String creditCardNumber;

 public CreditCardPayment(String creditCardNumber) {
     this.creditCardNumber = creditCardNumber;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using credit card " + creditCardNumber);
 }
}