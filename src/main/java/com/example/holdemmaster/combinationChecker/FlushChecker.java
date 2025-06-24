package com.example.holdemmaster.combinationChecker;

import java.util.List;

import com.example.holdemmaster.card.Card;

public class FlushChecker implements CombinationChecker {
	@Override
	public boolean matches(List<Card> cards) {
		Card.Suit suit = cards.get(0).getSuit();
		for (Card card : cards) {
			if (card.getSuit() != suit) return false;
		}
		return true;
	}
}
