import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HandTest {
    private Hand testHand;

    @Before
    public void testSetup() {
        testHand = new Hand();
    }

    @Test
    public void testAddCard() {
        Card cardToAdd = new Card(Suit.DIAMOND, Value.NINE);
        Assert.assertTrue("Hand does not contain card initially", !testHand.getCards().contains(cardToAdd));
        testHand.addCard(cardToAdd);
        Assert.assertTrue("Hand contains card after it is added to hand", testHand.getCards().contains(cardToAdd));
    }
}
