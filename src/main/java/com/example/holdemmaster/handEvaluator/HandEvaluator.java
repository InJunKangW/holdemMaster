package com.example.holdemmaster.handEvaluator;

import java.util.List;

import com.example.holdemmaster.card.Card;
import com.example.holdemmaster.combination.HoldemCombination;

public class HandEvaluator {
	public HoldemCombination getCombination(List<Card> cards) {

	}

	private boolean isFlush(List<Card> cards) {
		Card.Suit suit = cards.get(0).getSuit();
		for (Card card : cards) {
			if (card.getSuit() != suit) return false;
		}
		return true;
	}
}
