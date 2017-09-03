package github.hxfirefox.kata.texaspoker.rules;

import github.hxfirefox.kata.texaspoker.poker.Hand;
import github.hxfirefox.kata.texaspoker.poker.Poker;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public final class HighCardRule implements Ruleable{
    @Override
    public int with(Hand black, Hand white) {
        List<Poker> blackOrder = order(black);
        List<Poker> whiteOrder = order(white);
        for (int i = 0; i < 5; i++) {
            int compare = blackOrder.get(i).compareTo(whiteOrder.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    private List<Poker> order(Hand black) {
        List<Poker> pokers = black.getPokers();
        sort(pokers);
        reverse(pokers);
        return pokers;
    }
}
