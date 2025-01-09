package cardgame;

/**
 * Main class for the CardGameHelper.
 */
public class CardGameHelper {

    public static void main(String[] args) throws Exception {

        // Create a new Hand
        Hand hand = new Hand();

        // Print a welcome message.
        ConsoleView.printWelcome();

        // Read in cards as long as there are more.
        // Add each card to the Hand.
        do {
            Card c = ConsoleView.getCard();
            hand.addCard(c);

        } while(ConsoleView.goAgain());

        // Show the value of the Hand
        ConsoleView.showHandValue(hand);

    }

}
