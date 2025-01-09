package cardgame;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection of Card objects representing a Hand of cards.
 */
public class Hand {

    /**
     * A List of Card objects.
     */
    private List<Card> cards;

    /**
     * Create a new Hand to hold an undefined number of cards.
     */
    public Hand() {
        cards = new ArrayList<Card>();
    }

    /**
     * Add a new card to the Hand.
     * @param card the card to be added
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Return the total value of all Card objects in the Hand.
     * @return total value
     */
    public int getHandValue() {
        // TODO: replace this with your solution
        return 0;
    }

}
