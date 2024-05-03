package org.howard.edu.lsp.oopfinal.question2;
/*
 * @author : Manish Niure 
 *ShoppingCart class
 * 
 */
class ShoppingCart {
 private PaymentStrategy paymentStrategy;

 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void checkout(double amount) {
     paymentStrategy.pay(amount);
 }
}
