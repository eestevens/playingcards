import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DeckTest {
    private Deck testDeck;


    @Before
    public void initializeDeck() {
        testDeck = new Deck();
    }

    @Test
    public void testDeckSize() {
        int expectedDeckSize = 52;
        Assert.assertEquals(expectedDeckSize, testDeck.returnDeck().size());
    }

    @Test
    public void testValues() {
        int expectedValueCount = 4;
        List<Card> cards = testDeck.returnDeck();
        for(Value val : Value.values()) {
            int count = 0;
            for(Card card : cards) {
                if(card.getValue().equals(val)) {
                    count++;
                }
            }
            Assert.assertTrue("4 of each card value are expected", count == expectedValueCount);

        }
    }

    @Test
    public void testSuits() {
        int expectedSuitCount = 13;
        List<Card> cards = testDeck.returnDeck();
        for(Suit suit : Suit.values()) {
            int count = 0;
            for(Card card : cards) {
                if(card.getSuit().equals(suit)) {
                    count++;
                }
            }
            Assert.assertTrue("13 of each card suit are expected", count == expectedSuitCount);
        }
    }

    @Test
    public void testUniqueCards() {
        List<Card> cards = testDeck.returnDeck();
        for(int i = 0 ; i < cards.size()-1; i ++) {
            for(int j = i + 1; j < cards.size(); j++) {
                Assert.assertTrue("Each card is unique", !cards.get(i).equals(cards.get(j)));
            }
        }
    }
}
