package github.hxfirefox.kata.texaspoker.poker;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

public class Hand {
    private final List<Poker> pokers = Lists.newArrayList();

    public Hand(Poker... cards) {
        Collections.addAll(pokers, cards);
    }

    public List<Poker> getPokers() {
        return pokers;
    }
}
