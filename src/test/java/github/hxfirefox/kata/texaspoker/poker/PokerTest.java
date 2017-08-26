package github.hxfirefox.kata.texaspoker.poker;

import org.junit.Test;

import static github.hxfirefox.kata.texaspoker.poker.Poker.*;
import static github.hxfirefox.kata.texaspoker.poker.Suit.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PokerTest {
    @Test
    public void should_be_equal_with_same_value_no_matter_what_suit() throws Exception {
        // given

        // when

        // then
        assertEquals(card(C, 3), card(D, 3));
    }

    @Test
    public void should_compare_with_2_pokers() throws Exception {
        // given

        // when

        // then
        assertThat(card(D, 13).compareTo(card(H, 5)), is(1));
        assertThat(card(D, 5).compareTo(card(H, 13)), is(-1));
        assertThat(card(D, 5).compareTo(card(H, 5)), is(0));
    }
}
