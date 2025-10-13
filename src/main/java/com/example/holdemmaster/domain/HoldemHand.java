package com.example.holdemmaster.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class HoldemHand {
	private final Card hand1;
	private final Card hand2;
}
