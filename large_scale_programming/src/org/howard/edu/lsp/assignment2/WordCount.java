/*
 Name : Manish Niure 
 */
package org.howard.edu.lsp.assignment2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class WordCount {

	public static void main(String[] args) {
		// reading text files 
		try {
			File file = new File("src/org/howard/edu/lsp/assignment2/listofwords.txt");
			Scanner scanner = new Scanner(file);
			Map<String, Integer> hashMap = new HashMap<>();
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine(); // reading every line 
				StringTokenizer st = new StringTokenizer(line," ,'-");  // splitting line 
				 
				while (st.hasMoreTokens()) {
					String word = st.nextToken().toLowerCase();
//					System.out.println(word);
					if (!Character.isDigit(word.charAt(0)) && word.length() >= 3) {
						if (hashMap.containsKey(word))
							hashMap.put(word, hashMap.get(word)+1);
						else
							hashMap.put(word,1);	
				}
				}
			}
			scanner.close();
//			System.out.println(hashMap);
			for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println(String.format("%-20s %d", key, value));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
