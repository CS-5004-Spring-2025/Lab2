package cardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Card class generated with the help of Chat GPT.
 */
public class CardTest {

    @Test
    public void testValidCardInitialization() throws InvalidCardException {
        Card card = new Card(Constants.HEART, Constants.ACE);
        assertEquals("Suit: Heart; Rank: Ace", card.toString());
    }

    @Test
    public void testInvalidCardSuit() {
        assertThrows(InvalidCardException.class, () -> new Card("InvalidSuit", Constants.ACE));
    }

    @Test
    public void testInvalidCardRank() {
        assertThrows(InvalidCardException.class, () -> new Card(Constants.HEART, "InvalidRank"));
    }

    @Test
    public void testCardValueJoker() throws InvalidCardException {
        Card card = new Card(Constants.HEART, Constants.JOKER);
        assertEquals(50, card.getCardValue());
    }

    @Test
    public void testCardValueTwoAndAce() throws InvalidCardException {
        Card two = new Card(Constants.HEART, Constants.TWO);
        Card ace = new Card(Constants.CLUB, Constants.ACE);

        assertEquals(20, two.getCardValue());
        assertEquals(20, ace.getCardValue());
    }

    @Test
    public void testCardValueThreeHeartOrDiamond() throws InvalidCardException {
        Card threeHeart = new Card(Constants.HEART, Constants.THREE);
        Card threeDiamond = new Card(Constants.DIAMOND, Constants.THREE);

        assertEquals(0, threeHeart.getCardValue());
        assertEquals(0, threeDiamond.getCardValue());
    }

    @Test
    public void testCardValueThreeClubOrSpade() throws InvalidCardException {
        Card threeClub = new Card(Constants.CLUB, Constants.THREE);
        Card threeSpade = new Card(Constants.SPADE, Constants.THREE);

        assertEquals(5, threeClub.getCardValue());
        assertEquals(5, threeSpade.getCardValue());
    }

    @Test
    public void testCardValueFourToEight() throws InvalidCardException {
        Card four = new Card(Constants.HEART, Constants.FOUR);
        Card eight = new Card(Constants.CLUB, Constants.EIGHT);

        assertEquals(5, four.getCardValue());
        assertEquals(5, eight.getCardValue());
    }

    @Test
    public void testCardValueFaceCardsAndTen() throws InvalidCardException {
        Card nine = new Card(Constants.SPADE, Constants.NINE);
        Card jack = new Card(Constants.HEART, Constants.JACK);
        Card queen = new Card(Constants.CLUB, Constants.QUEEN);
        Card king = new Card(Constants.DIAMOND, Constants.KING);

        assertEquals(10, nine.getCardValue());
        assertEquals(10, jack.getCardValue());
        assertEquals(10, queen.getCardValue());
        assertEquals(10, king.getCardValue());
    }

    @Test
    public void testToString() throws InvalidCardException {
        Card card = new Card(Constants.DIAMOND, Constants.KING);
        assertEquals("Suit: Diamond; Rank: King", card.toString());
    }
}
