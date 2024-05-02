package org.howard.edu.lsp.oopfinal.question1;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import java.util.HashSet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
/**
 * @author Manish Niure
 * Class for the implementation of unit testing of SongsDatabase methods.
 * This class tests various functionalities such as adding songs, retrieving songs,
 * and getting genres of songs from the SongsDatabase.
 */

public class SongsDatabaseTest {
    private SongsDatabase db;
    
    @BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("===Set Up===");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=== TearDown Class===");
	}

    @Before
    public void setUp() throws Exception {
        //  the SongsDatabase and populate it with some initial data
        // before each test case.
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        db.addSong("Rap", "Gin and Juice");
    }

    @Test
    public void testAddSong() {
        // Test adding a new song under a new genre.
        db.addSong("Pop", "Bad Guy");
        Set<String> songs = db.getSongs("Pop");
        assertTrue("'Bad Guy' is added to the 'Pop' genre check", songs.contains("Bad Guy"));
    }

    @Test
    public void testGetSongs() {
        // Test retrieving songs by genre.
        Set<String> expectedRapSongs = new HashSet<>();
        expectedRapSongs.add("Savage");
        expectedRapSongs.add("Gin and Juice");

        Set<String> retrievedRapSongs = db.getSongs("Rap");
        assertEquals("Check if all songs in the 'Rap' genre are retrieved correctly", expectedRapSongs, retrievedRapSongs);
    }

    @Test
    public void testGetGenreOfSong() {
        // Test getting the genre of a specific song.
        String genre = db.getGenreOfSong("Savage");
        assertEquals("Check if the correct genre 'Rap' is returned for the song 'Savage'", "Rap", genre);
    }

    @Test
    public void testGetSongsFromNonexistentGenre() {
        // Test behavior when querying songs for a genre that doesn't exist.
        Set<String> songsFromNonexistentGenre = db.getSongs("Rock");
        assertTrue("Check if an empty set is returned for a nonexistent genre 'Rock'", songsFromNonexistentGenre.isEmpty());
    }

    @Test
    public void testGetGenreOfNonexistentSong() {
        // Test getting the genre of a song that does not exist in the database.
        // check if returns null 
        String genreOfNonexistentSong = db.getGenreOfSong("Unknown Song");
        assertNull("Check if null is returned for a nonexistent song 'Unknown Song'", genreOfNonexistentSong);
    }
}