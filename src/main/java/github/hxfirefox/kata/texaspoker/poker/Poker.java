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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Poker poker = (Poker) o;

        return value == poker.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
