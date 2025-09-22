package com.example.holdemmaster.combinationChecker;

import org.springframework.stereotype.Component;

import com.example.holdemmaster.combination.HoldemCombination;

@Component
public class TripleChecker extends NOfAKindChecker{
	public TripleChecker() {
		super(3);
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.TRIPLE;
	}
}
