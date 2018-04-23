package manifest.pokerkata;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.NavigableSet;

import org.junit.Test;

public class HandTest {

	@Test
	public void handShouldContainCards() {
		Card card = new Card("2", "S");
		Hand hand = new Hand(card);

		assertThat(hand.getCards(), contains(card));
	}

	@Test
	public void handShouldPutCardsInDescendingOrderByValue() {
		Card middleCard = new Card("5", "C");
		Card highCard = new Card("9", "D");
		Card lowCard = new Card("2", "S");

		Hand hand = new Hand(middleCard, highCard, lowCard);

		NavigableSet<Card> result = hand.getCards();
		Card[] resultArray = result.toArray(new Card[0]);

		assertThat(resultArray[0], is(highCard));
		assertThat(resultArray[1], is(middleCard));
		assertThat(resultArray[2], is(lowCard));
	}
}
