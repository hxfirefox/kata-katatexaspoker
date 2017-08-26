package github.hxfirefox.kata.texaspoker.poker;

import org.junit.Test;

import static github.hxfirefox.kata.texaspoker.poker.Poker.*;
import static github.hxfirefox.kata.texaspoker.poker.Suit.*;
import static org.junit.Assert.assertEquals;

public class PokerTest {
    @Test
    public void should_be_equal_with_same_value_no_matter_what_suit() throws Exception {
        // given

        // when

        // then
        assertEquals(card(C, 3), card(D, 3));
    }
}
