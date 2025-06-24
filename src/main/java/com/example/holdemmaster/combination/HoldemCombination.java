package com.example.holdemmaster.combination;

import lombok.Getter;

@Getter
public enum HoldemCombination {
	ROYAL_STRAIGHT_FLUSH(10),
	STRAIGHT_FLUSH(9),
	FOUR_CARD(8),
	FULL_HOUSE(7),
	FLUSH(6),
	STRAIGHT(5),
	TRIPLE(4),
	TWO_PAIR(3),
	ONE_PAIR(2),
	TOP(1);

	private final int rank;

	HoldemCombination(int rank) {
		this.rank = rank;
	}
}
