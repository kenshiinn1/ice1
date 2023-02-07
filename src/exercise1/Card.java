package exercise1;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack = 11, Queen = 12, King = 13) A suit (clubs, hearts, spades,
 * diamonds). There are 52 cards in a deck, no jokers. This code is to be used
 * in ICE1. When you create your own branch, add your name as a modifier.
 *
 * @author dancye
 * @author Paul Bonenfant May 2020
 */
public class Card {

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public final static int[] VALUE = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    protected int value;
    protected String suit;

    public Card(String suit, int rank) {
        this.value = rank;
        this.suit = suit;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    public boolean equals(Object tocompare) {
        if (tocompare != null) {
            Card cardtocompare = (Card) tocompare;

            if (cardtocompare.suit.equals(this.suit) && cardtocompare.value == this.value) {
                return true;
            }
        }
        return false;

    }

    public String toString() {
        return "suit" + suit + "value" + value;
    }
}
