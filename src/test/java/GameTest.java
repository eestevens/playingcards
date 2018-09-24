import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Exception.InvalidHandException;
import org.junit.rules.ExpectedException;

public class GameTest {
    private Deck gameDeck;

    @Before
    public void testSetup() {
        gameDeck = new Deck();
    }

    @Test
    public void testGameSetup() throws InvalidHandException {
        Game game = new Game(gameDeck, 3, 5);
        System.out.println(game.getGameDeck().returnDeck().size());
        Assert.assertTrue("Expected remaining Deck size", game.getGameDeck().returnDeck().size() == 37);
        Assert.assertTrue("Expected number of hands", game.getGameHands().size() == 3);
        Assert.assertTrue("Expected cards per hand", game.getGameHands().get(0).getCards().size() == 5);
    }

    @Test
    public void testDealCard() throws InvalidHandException {
        Game game = new Game(gameDeck, 4, 4);
        System.out.println(game.getGameDeck().returnDeck().size());
        Assert.assertTrue("Expected remaining Deck size", game.getGameDeck().returnDeck().size() == 36);
        Assert.assertTrue("Expected number of hands", game.getGameHands().size() == 4);
        Assert.assertTrue("Expected cards per hand", game.getGameHands().get(0).getCards().size() == 4);
        game.dealEveryPlayerACard();
        Assert.assertTrue("Expected remaining Deck size", game.getGameDeck().returnDeck().size() == 32);
        Assert.assertTrue("Expected number of hands", game.getGameHands().size() == 4);
        Assert.assertTrue("Expected cards per hand", game.getGameHands().get(0).getCards().size() == 5);

    }

    @Test (expected = InvalidHandException.class)
    public void testInvalidGameSetup() throws InvalidHandException {
        Game game = new Game(gameDeck, 30, 2);
    }
}
