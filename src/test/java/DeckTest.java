import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {
    private Deck testDeck;


    @Before
    public void initializeDeck() {
        testDeck = new Deck();
    }

    @Test
    public void testDeck() {
        int expectedDeckSize = 52;
        Assert.assertEquals(expectedDeckSize, testDeck.returnDeck().length);
    }
}
