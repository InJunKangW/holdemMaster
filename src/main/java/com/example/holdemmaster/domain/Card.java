package com.example.holdemmaster.domain;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Card {
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}

	Suit suit;

	@Min(2)
	@Max(14)
	Integer rank;
}
