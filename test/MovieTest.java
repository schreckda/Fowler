import org.junit.Test;

import static org.junit.Assert.*;


public class MovieTest {

    Movie movie = new Movie("Test Movie", 12);

    @Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 12);
    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(20);
        assertEquals(movie.getPriceCode(), 20);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(movie.getTitle(), "Test Movie");
    }

}