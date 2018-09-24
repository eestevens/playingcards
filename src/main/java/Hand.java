import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card newCard) {
        cards.add(newCard);
    }

    public List<Card> getCards() {
        return cards;
    }

}
