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
    public void testGameSetup() {

    }

    @Test (expected = InvalidHandException.class)
    public void testInvalidGameSetup() throws InvalidHandException {
        Game game = new Game(gameDeck, 30, 2);
    }
}
