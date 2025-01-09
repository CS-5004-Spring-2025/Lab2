package cardgame;

import java.util.Arrays;
import java.util.List;

/**
 * A class to manage constant values used throughout the program.
 */
public class Constants {

    public static final String TWO = "Two";
    public static final String THREE = "Three";
    public static final String FOUR = "Four";
    public static final String FIVE = "Five";
    public static final String SIX = "Six";
    public static final String SEVEN = "Seven";
    public static final String EIGHT = "Eight";
    public static final String NINE = "Nine";
    public static final String TEN = "Ten";
    public static final String JACK = "Jack";
    public static final String QUEEN = "Queen";
    public static final String KING = "King";
    public static final String ACE = "Ace";
    public static final String JOKER = "Joker";

    public static final String HEART = "Heart";
    public static final String DIAMOND = "Diamond";
    public static final String CLUB = "Club";
    public static final String SPADE = "Spade";

    public static final List<String> VALID_SUITS = Arrays.asList(HEART,
        DIAMOND,
        CLUB,
        SPADE);
    public static final List<String> VALID_RANKS = Arrays.asList(
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING,
        ACE,
        JOKER
    );

    public static final List<String> YES_NO = Arrays.asList("yes", "no");

}
