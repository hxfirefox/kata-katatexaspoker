package github.hxfirefox.kata.texaspoker.rules;

import github.hxfirefox.kata.texaspoker.poker.Hand;

public interface Ruleable {
    int with(Hand black, Hand white);
}
