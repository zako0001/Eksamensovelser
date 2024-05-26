public class Card {

    // Nested class
    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

    // Attributes
    private Suit suit;
    private int value;

    // Constructor
    public Card(Suit suit, int value) {
        if (suit == null) {
            throw new IllegalStateException("Suit was null and must not be null.");
        }
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("Value was " + value + " and must be at least 1 and at most 13.");
        }
        this.suit = suit;
        this.value = value;
    }

    // Method
    public boolean beats(Card card) {
        if (value == card.value) {
            return suit.ordinal() > card.suit.ordinal();
        }
        return value > card.value;
    }
}