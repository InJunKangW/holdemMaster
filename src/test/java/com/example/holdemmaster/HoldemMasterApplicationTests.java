package com.example.holdemmaster;

import static org.assertj.core.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.holdemmaster.card.Card;
import com.example.holdemmaster.combination.HoldemCombination;
import com.example.holdemmaster.handEvaluator.HandEvaluator;

@SpringBootTest
class HoldemMasterApplicationTests {

	@Autowired
	private HandEvaluator handEvaluator;

	@Test
	void testStraightFlush() {
		List<Card> cards = List.of(
			new Card(Card.Suit.HEARTS, 10),
			new Card(Card.Suit.HEARTS, 11),
			new Card(Card.Suit.HEARTS, 12),
			new Card(Card.Suit.HEARTS, 13),
			new Card(Card.Suit.HEARTS, 14)
		);

		HoldemCombination result = handEvaluator.getCombination(cards);
		assertThat(result).isEqualTo(HoldemCombination.STRAIGHT_FLUSH);
	}

}
