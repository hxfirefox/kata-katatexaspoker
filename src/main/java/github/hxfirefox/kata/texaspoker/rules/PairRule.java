package github.hxfirefox.kata.texaspoker.rules;

import com.google.common.collect.Sets;
import github.hxfirefox.kata.texaspoker.poker.Hand;
import github.hxfirefox.kata.texaspoker.poker.Poker;

import java.util.HashSet;

public final class PairRule implements Ruleable {
    @Override
    public int with(Hand black, Hand white) {
        int blackPair = pair(black);
        int whitePair = pair(white);
        return Integer.compare(blackPair,whitePair);
    }

    private int pair(Hand hand) {
        HashSet<Poker> set = Sets.newHashSet();
        return hand.getPokers().stream().filter(x -> !set.add(x)).findFirst().map(Poker::getValue).orElse(0);
    }
}
