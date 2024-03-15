package org.howard.edu.lsp.midterm.question1;


/**
 * @author Manish Niure
 */
public class Driver {
    public static void main(String[] args) {
        // Test the encrypt method with different texts
        String text1 = "I love CSCI363";
        String encryptedText1 = SecurityOps.encrypt(text1);
        System.out.println("Encrypted text 1: " + encryptedText1); // IoeSI6lvCC33

        String text2 = "Hello, World!";
        String encryptedText2 = SecurityOps.encrypt(text2);
        System.out.println("Encrypted text 2: " + encryptedText2); // hloolelWrd

        String text3 = "1234567890";
        String encryptedText3 = SecurityOps.encrypt(text3);
        System.out.println("Encrypted text 3: " + encryptedText3);

        String text4 = "large scale";
        String encryptedText4 = SecurityOps.encrypt(text4);
        System.out.println("Encrypted text 4: " + encryptedText4);

        String text5 = "Le;";
        String encryptedText5 = SecurityOps.encrypt(text5);
        System.out.println("Encrypted text 5: " + encryptedText5);
    }
}
