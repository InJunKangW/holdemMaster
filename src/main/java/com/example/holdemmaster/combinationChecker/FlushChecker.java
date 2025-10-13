package com.example.holdemmaster.combinationChecker;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.holdemmaster.domain.Card;
import com.example.holdemmaster.combination.HoldemCombination;
import com.example.holdemmaster.domain.HoldemHand;

@Component
public class FlushChecker implements CombinationChecker {
	@Override
	public boolean matches(HoldemHand holdemHand, List<Card> cards) {
		Card.Suit suit = cards.get(0).getSuit();
		for (Card card : cards) {
			if (card.getSuit() != suit) return false;
		}
		return true;
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.FLUSH;
	}
}
