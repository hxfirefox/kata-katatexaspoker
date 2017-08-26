package github.hxfirefox.kata.texaspoker.poker;

public class Poker {
    private final Suit suit;
    private final int value;

    private Poker(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public static Poker card(Suit suit, int value) {
        return new Poker(suit, value);
    }
}
