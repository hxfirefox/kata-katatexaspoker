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
        assertEquals(card(3, C), card(3, D));
    }

    @Test
    public void should_compare_with_2_pokers() throws Exception {
        // given

        // when

        // then
        assertThat(card(13, D).compareTo(card(5, H)), is(1));
        assertThat(card(5, D).compareTo(card(13, H)), is(-1));
        assertThat(card(5, D).compareTo(card(5, H)), is(0));
    }

    @Test
    public void should_print_AH_when_poker_value_14_with_suit_H() throws Exception {
        // given

        // when

        // then
        assertThat(card(14, H).toString(), is("AH"));
    }
}
