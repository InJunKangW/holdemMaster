package com.example.holdemmaster.card;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Card {
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}

	Suit suit;

	@Min(2)
	@Max(14)
	Integer rank;
}
