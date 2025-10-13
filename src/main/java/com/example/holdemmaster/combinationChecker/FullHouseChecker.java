package com.example.holdemmaster.combinationChecker;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.holdemmaster.domain.Card;
import com.example.holdemmaster.combination.HoldemCombination;
import com.example.holdemmaster.domain.HoldemHand;

@Component
public class FullHouseChecker implements CombinationChecker {

	@Override
	public boolean matches(HoldemHand holdemHand, List<Card> cards) {
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
