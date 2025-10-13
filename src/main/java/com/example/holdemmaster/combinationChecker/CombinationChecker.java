package com.example.holdemmaster.combinationChecker;

import java.util.List;

import com.example.holdemmaster.domain.Card;
import com.example.holdemmaster.combination.HoldemCombination;

public interface CombinationChecker {
	boolean matches(List<Card> cards);
	HoldemCombination getCombination();
}
