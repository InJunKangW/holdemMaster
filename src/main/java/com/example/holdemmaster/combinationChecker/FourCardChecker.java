package com.example.holdemmaster.combinationChecker;

import org.springframework.stereotype.Component;

import com.example.holdemmaster.combination.HoldemCombination;

@Component
public class FourCardChecker extends NOfAKindChecker{
	public FourCardChecker() {
		super(4);
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.FOUR_CARD;
	}
}
