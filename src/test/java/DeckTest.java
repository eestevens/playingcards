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
    public void testDeckSize() {
        int expectedDeckSize = 52;
        Assert.assertEquals(expectedDeckSize, testDeck.returnDeck().length);
    }

    @Test
    public void testValues() {
        int expectedValueCount = 4;
        Card[] cards = testDeck.returnDeck();
        for(Value val : Value.values()) {
            int count = 0;
            for(int i = 0; i < cards.length ; i ++) {
                if(cards[i].getValue().equals(val)) {
                    count++;
                }
            }
            Assert.assertTrue("4 of each card value are expected", count == expectedValueCount);

        }
    }

    @Test
    public void testSuits() {
        int expectedSuitCount = 13;
        Card[] cards = testDeck.returnDeck();
        for(Suit suit : Suit.values()) {
            int count = 0;
            for(int i = 0; i < cards.length ; i ++) {
                if(cards[i].getSuit().equals(suit)) {
                    count++;
                }
            }
            Assert.assertTrue("13 of each card suit are expected", count == expectedSuitCount);
        }
    }

    @Test
    public void testUniqueCards() {
        Card[] cards = testDeck.returnDeck();
        for(int i = 0 ; i < cards.length-1; i ++) {
            for(int j = i + 1; j < cards.length; j++) {
                Assert.assertTrue("Each card is unique", !cards[i].equals(cards[j]));
            }
        }
    }
}
