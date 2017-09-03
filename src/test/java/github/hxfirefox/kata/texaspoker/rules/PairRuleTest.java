package github.hxfirefox.kata.texaspoker.rules;

import github.hxfirefox.kata.texaspoker.poker.Hand;
import org.junit.Before;
import org.junit.Test;

import static github.hxfirefox.kata.texaspoker.poker.Poker.card;
import static github.hxfirefox.kata.texaspoker.poker.Suit.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PairRuleTest {
    private PairRule rule;

    @Before
    public void setUp() throws Exception {
        rule = new PairRule();
    }

    @Test
    public void should_win_with_pair_value_greater() throws Exception {
        // given
        Hand black = new Hand(card(2, H), card(2, D), card(5, S), card(9, C), card(13, D));
        Hand white = new Hand(card(3, C), card(3, H), card(4, S), card(8, C), card(14, H));
        // when
        int result = rule.with(black, white);
        // then
        assertThat(result, is(-1));
    }
}
