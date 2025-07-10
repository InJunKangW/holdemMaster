package com.example.holdemmaster.combinationChecker;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.holdemmaster.card.Card;

public abstract class NOfAKindChecker implements  CombinationChecker{

	private final int countToMatch;

	protected NOfAKindChecker(int countToMatch) {
		this.countToMatch = countToMatch;
	}

	@Override
	public boolean matches(List<Card> cards) {
		Map<Integer, Long> rankCounts = cards.stream()
			.collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

		return rankCounts.values().stream().anyMatch(count -> count == countToMatch);
	}
}
