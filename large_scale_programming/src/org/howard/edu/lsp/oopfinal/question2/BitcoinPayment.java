package org.howard.edu.lsp.oopfinal.question2;

/*
 * @author : Manish Niure
 * Concrete BitcoinPayment class
 */
class BitcoinPayment implements PaymentStrategy {
 private String bitcoinAddress;

 public BitcoinPayment(String bitcoinAddress) {
     this.bitcoinAddress = bitcoinAddress;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress);
 }
}