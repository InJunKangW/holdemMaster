package com.example.holdemmaster.combinationChecker;

import com.example.holdemmaster.combination.HoldemCombination;

public class TripleChecker extends NOfAKindChecker{
	public TripleChecker() {
		super(3);
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.TRIPLE;
	}
}
