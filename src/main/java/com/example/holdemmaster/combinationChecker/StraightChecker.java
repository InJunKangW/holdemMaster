package com.example.holdemmaster.combinationChecker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.holdemmaster.card.Card;
import com.example.holdemmaster.combination.HoldemCombination;

public class StraightChecker implements CombinationChecker {
	@Override
	public boolean matches(List<Card> cards) {
		List<Integer> ranks = new ArrayList<>();
		for (Card card : cards) {
			ranks.add(card.getRank());
		}

		// A=14를 1로도 취급해서 로우 스트레이트 확인 가능하게
		if (ranks.contains(14)) {
			ranks.add(1);
		}

		Collections.sort(ranks);

		for (int i = 0; i <= ranks.size() - 5; i++) {
			boolean straight = true;
			for (int j = 0; j < 4; j++) {
				if (ranks.get(i + j + 1) - ranks.get(i + j) != 1) {
					straight = false;
					break;
				}
			}
			if (straight) return true;
		}
		return false;
	}

	@Override
	public HoldemCombination getCombination() {
		return HoldemCombination.STRAIGHT;
	}
}
