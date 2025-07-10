package com.example.holdemmaster.combinationChecker;

import com.example.holdemmaster.combination.HoldemCombination;

public class FourCardChecker extends NOfAKindChecker{
	public FourCardChecker() {
		super(4);
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.FOUR_CARD;
	}
}
