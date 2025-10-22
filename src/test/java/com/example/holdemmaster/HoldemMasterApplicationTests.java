package com.example.holdemmaster;

import static org.assertj.core.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.holdemmaster.domain.Card;
import com.example.holdemmaster.combination.HoldemCombination;
import com.example.holdemmaster.domain.HoldemHand;
import com.example.holdemmaster.handEvaluator.HandEvaluator;

@SpringBootTest
class HoldemMasterApplicationTests {

	@Autowired
	private HandEvaluator handEvaluator;

	@Test
	void testStraightFlush() {
		Card hand1 = new Card(Card.Suit.HEARTS, 10);
		Card hand2 = new Card(Card.Suit.HEARTS, 9);
		HoldemHand holdemHand = new HoldemHand(hand1, hand2);

		List<Card> boards = List.of(
			new Card(Card.Suit.SPADES, 10),
			new Card(Card.Suit.HEARTS, 11),
			new Card(Card.Suit.HEARTS, 12),
			new Card(Card.Suit.HEARTS, 13),
			new Card(Card.Suit.SPADES, 14)
		);

		HoldemCombination result = handEvaluator.getCombination(holdemHand, boards);
		assertThat(result).isEqualTo(HoldemCombination.STRAIGHT_FLUSH);
	}

	@Test
	void testFourCard() {
		List<Card> cards = List.of(
			new Card(Card.Suit.HEARTS, 10),
			new Card(Card.Suit.SPADES, 10),
			new Card(Card.Suit.DIAMONDS, 10),
			new Card(Card.Suit.CLUBS, 10),
			new Card(Card.Suit.HEARTS, 14)
		);

		// HoldemCombination result = handEvaluator.getCombination(cards);
		// assertThat(result).isEqualTo(HoldemCombination.FOUR_CARD);
	}

	@Test
	@DisplayName("포카드와 로얄 스트레이트 플러시가 동시에 있을 때의 족보 판단 테스트")
	void testFourCard2() {
		List<Card> cards = List.of(
			new Card(Card.Suit.SPADES, 10),
			new Card(Card.Suit.DIAMONDS, 10),
			new Card(Card.Suit.CLUBS, 10),
			new Card(Card.Suit.HEARTS, 10),
			new Card(Card.Suit.HEARTS, 11),
			new Card(Card.Suit.HEARTS, 12),
			new Card(Card.Suit.HEARTS, 13),
			new Card(Card.Suit.HEARTS, 14)
		);

		// HoldemCombination result = handEvaluator.getCombination(cards);
		// assertThat(result).isEqualTo(HoldemCombination.STRAIGHT_FLUSH);
	}
}
