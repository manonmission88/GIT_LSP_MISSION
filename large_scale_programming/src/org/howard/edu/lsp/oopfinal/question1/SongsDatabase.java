package org.howard.edu.lsp.oopfinal.question1;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @author : Manish Niure 
 *  SongsDatabase class keeps tracks of song titles by classifying them according to 

Genre
 */
public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<>());
        }
        map.get(genre).add(songTitle);
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null; // return null if no genre found
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }
    /*Main function to print out the result  */
    public static void main(String[] args) {
        SongsDatabase db = new SongsDatabase();

        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        db.addSong("Rap", "Gin and Juice");
        
   
        Set<String> songs = db.getSongs("Rap");
        System.out.println(songs); // Expected to print [Savage, Gin and Juice] in any order
        System.out.println(db.getGenreOfSong("Savage")); // Should print "Rap"
        System.out.println(db.getGenreOfSong("Always There")); // Should print "Jazz"
        
        
        // Extra test cases
        db.addSong("Classic", "Traditional");
        // Retrieving songs from the "Classic" genre
        Set<String> classicSongs = db.getSongs("Classic");
        System.out.println(classicSongs); // should print [Traditional]

        // Test with empty genre should return an empty set
        Set<String> emptySongs = db.getSongs("");
        System.out.println(emptySongs); // should  print []
        
        
    }
}

