package cardgame;

/**
 * Thrown if a suit/rank pair does not represent a valid card.
 */
public class InvalidCardException extends Exception {

    public InvalidCardException(String message) {
        super(message);
    }
}
