package com.example.holdemmaster.combinationChecker;

import java.util.List;

import com.example.holdemmaster.card.Card;
import com.example.holdemmaster.combination.HoldemCombination;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StraightFlushChecker implements CombinationChecker {
	private final FlushChecker flushChecker;
	private final StraightChecker straightChecker;

	@Override
	public boolean matches(List<Card> cards) {
		return flushChecker.matches(cards) && straightChecker.matches(cards);
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.STRAIGHT_FLUSH;
	}
}
