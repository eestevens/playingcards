import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final int STANDARD_DECK = 52;
    private List<Card> cardDeck;

    public Deck() {
        cardDeck = new ArrayList<>(STANDARD_DECK);
        int i = 0;
        for (Suit suit : Suit.values()) {
            for(Value value : Value.values()) {
                cardDeck.add(new Card(suit, value));
            }
        }
    }

    public List<Card> returnDeck() {
        return cardDeck;
    }

    public void shuffle() {
        Collections.shuffle(cardDeck);
    }

    public Card dealCard() {
        return cardDeck.remove(0);
    }
}
