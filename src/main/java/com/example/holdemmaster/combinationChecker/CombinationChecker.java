package com.example.holdemmaster.combinationChecker;

import java.util.List;

import com.example.holdemmaster.card.Card;

public interface CombinationChecker {
	boolean matches(List<Card> cards);
}
