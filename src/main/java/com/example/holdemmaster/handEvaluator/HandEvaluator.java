package com.example.holdemmaster.handEvaluator;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.holdemmaster.domain.Card;
import com.example.holdemmaster.combination.HoldemCombination;
import com.example.holdemmaster.combinationChecker.CombinationChecker;
import com.example.holdemmaster.domain.HoldemHand;

@Component
public class HandEvaluator {
	List<CombinationChecker> combinationCheckers;

	public HandEvaluator(List<CombinationChecker> combinationCheckers) {
		this.combinationCheckers = combinationCheckers.stream()
			.sorted(Comparator.comparingInt(
				c -> -c.getCombination().getRank()))
			.toList();
	}

	public HoldemCombination getCombination(HoldemHand holdemHand, List<Card> cards) {
		for (CombinationChecker checker : combinationCheckers) {
			if (checker.matches(holdemHand, cards)) {
				return checker.getCombination();
			}
		}
		return HoldemCombination.TOP;
	}
}
