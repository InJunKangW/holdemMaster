package com.example.holdemmaster.combinationChecker;

import java.util.List;

import com.example.holdemmaster.domain.Card;
import com.example.holdemmaster.combination.HoldemCombination;
import com.example.holdemmaster.domain.HoldemHand;

public interface CombinationChecker {
	boolean matches(HoldemHand holdemHand, List<Card> Boards);
	HoldemCombination getCombination();
}
