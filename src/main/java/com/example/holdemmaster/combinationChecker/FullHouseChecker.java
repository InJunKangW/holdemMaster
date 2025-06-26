package com.example.holdemmaster.combinationChecker;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.holdemmaster.card.Card;
import com.example.holdemmaster.combination.HoldemCombination;

public class FullHouseChecker implements CombinationChecker {

	@Override
	public boolean matches(List<Card> cards) {
		Map<Integer, Long> rankCounts = cards.stream()
			.collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

		boolean hasThree = false;
		boolean hasTwo = false;

		for (long count : rankCounts.values()) {
			if (count >= 3 && !hasThree) {
				hasThree = true;
			} else if (count >= 2) {
				hasTwo = true;
			}
		}

		return hasThree && hasTwo;
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.FULL_HOUSE;
	}
}
