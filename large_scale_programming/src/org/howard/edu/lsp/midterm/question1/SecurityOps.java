package org.howard.edu.lsp.midterm.question1;


/**
 * @author Manish Niure
 */
public class SecurityOps {
	public static String encrypt(String text) {
        StringBuilder evenChar = new StringBuilder();
        StringBuilder oddChar = new StringBuilder();
        
        // replacing all punctuation 
        text = text.replaceAll("[\\s\\p{Punct}]", "");
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
            	// check even 
                if (i % 2 == 0) {
                    evenChar.append(ch);
                    // check odd
                } else {
                    oddChar.append(ch);
                }
            }
        }

        return evenChar.toString() + oddChar.toString();
    }
}



