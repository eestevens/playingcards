import java.util.ArrayList;
import java.util.List;
import Exception.InvalidHandException;

public class Game {
    private Deck gameDeck;
    private List<Hand> gameHands;

    public Game(Deck deck, int players, int startingCards) throws InvalidHandException {
        gameDeck = new Deck();
        gameHands = new ArrayList<>(players);
        if(validGameDeck(deck.returnDeck().size(), players, startingCards)) {
            for(int i = 0; i < startingCards; i ++) { //simulates actually dealing deck
                for(Hand hand : gameHands) {
                    hand.addCard(gameDeck.dealCard());
                }
            }
        } else{
            throw new InvalidHandException("Required hand size surpasses deck size");
        }
    }

    private boolean validGameDeck(int deckSize, int players, int startingCards) {
        return deckSize >= players * startingCards;
    }
}
