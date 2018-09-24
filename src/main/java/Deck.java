public class Deck {

    private Card[] cardDeck;

    public Deck() {
        int i = 0;
        int deckSize = Suit.values().length * Value.values().length;
        cardDeck = new Card[deckSize];
        for (Suit suit : Suit.values()) {
            for(Value value : Value.values()) {
                cardDeck[i++] = new Card(suit, value);
            }
        }
    }

    public Card[] returnDeck() {
        return cardDeck;
    }

    public void shuffle() {

    }
}
