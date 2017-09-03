package github.hxfirefox.kata.texaspoker.poker;

public class Poker implements Comparable {
    private final Suit suit;
    private final int value;

    private Poker(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public static Poker card(int value, Suit suit) {
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

    @Override
    public int compareTo(Object o) {
        Poker other = (Poker) o;
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (value == 11) {
            builder.append("J");
        } else if (value == 12) {
            builder.append("Q");
        } else if (value == 13) {
            builder.append("K");
        } else if (value == 14) {
            builder.append("A");
        } else {
            builder.append(value);
        }

        return builder.append(suit.toString()).toString();
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
