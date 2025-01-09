package cardgame;

import java.util.Scanner;

/**
 * A class to handle input/output to the console.
 */
public class ConsoleView {

    /**
     * Create one Scanner to handle input.
     */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Prevent instantiation of the ConsoleView class.
     * This is common for classes that are a collection of static methods.
     */
    private ConsoleView() {

    }

    /**
     * Helper method to get a valid suit from the user.
     *
     * @return suit entered by the user.
     */
    private static String getSuit() {
        System.out.println("What is the suit of your card? ");
        String suit = SCANNER.nextLine().trim();
        while (!Constants.VALID_SUITS.contains(suit)) {
            System.out.println("Invalid suit.");
            System.out.println("What is the suit of your card? ");
            suit = SCANNER.nextLine().trim();
        }
        return suit;
    }

    /**
     * Helper method to get a valid rank from the user.
     *
     * @return rank entered by the user.
     */
    private static String getRank() {
        // TODO: replace this with your solution
        return null;
    }

    /**
     * Called by other parts of the program to get a valid suit and rank from
     * the user and return a Card object to represent that suit and rank.
     *
     * @return a Card object instantiated from the suit and rank
     */
    public static Card getCard() {

        // TODO: replace this with your solution
        // Make sure to use helper methods provided where appropriate.
        // Make sure to instantiate and return a new Card object using
        // the suit and rank provided by the user.
        // Note that you will need to use a try/catch to instantiate the Card
        // object. If an exception is thrown, make sure to iterate until
        // the user enters a valid suit and rank.
        return null;
    }

    /**
     * Ask the user whether they want to enter another card. Return true if yes
     * and false otherwise.
     *
     * @return true if the user wants to enter another card
     */
    public static boolean goAgain() {
        System.out.println("Are there more cards in your hand? ");
        String response = SCANNER.nextLine().trim();
        if (!Constants.YES_NO.contains(response)) {
            System.out.println("Bad response.\nAre there more cards in your hand [yes/no]? ");
            response = SCANNER.nextLine().trim();
        }
        return response.equals("yes");
    }

    /**
     * Print a welcome message.
     */
    public static void printWelcome() {
        // TODO: replace with your solution
    }

    /**
     * Show the total value of the hand.
     *
     * @param hand the hand of Card objects
     */
    public static void showHandValue(Hand hand) {
        // TODO: replace with your solution
    }

}
