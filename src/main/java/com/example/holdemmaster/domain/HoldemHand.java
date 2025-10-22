package com.example.holdemmaster.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HoldemHand {
	private final Card hand1;
	private final Card hand2;
}
