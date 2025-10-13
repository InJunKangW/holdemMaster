package com.example.holdemmaster.combinationChecker;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.holdemmaster.domain.Card;
import com.example.holdemmaster.combination.HoldemCombination;
import com.example.holdemmaster.domain.HoldemHand;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class StraightFlushChecker implements CombinationChecker {
	private final FlushChecker flushChecker;
	private final StraightChecker straightChecker;

	@Override
	public boolean matches(HoldemHand holdemHand, List<Card> cards) {
		return flushChecker.matches(holdemHand, cards) && straightChecker.matches(holdemHand, cards);
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.STRAIGHT_FLUSH;
	}
}
