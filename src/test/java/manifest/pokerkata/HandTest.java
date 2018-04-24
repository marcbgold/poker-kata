package manifest.pokerkata;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HandTest {

	@Test
	public void handShouldContainCards() {
		Card card = new Card("2", "S");
		Hand hand = new Hand(card);
		Card[] cardsFromHand = hand.getCards();

		assertThat(cardsFromHand[0], is(card));
	}

	@Test
	public void handShouldPutCardsInDescendingOrderByValue() {
		Card middleCard = new Card("5", "C");
		Card highCard = new Card("9", "D");
		Card lowCard = new Card("2", "S");

		Hand hand = new Hand(middleCard, highCard, lowCard);

		Card[] cardsFromHand = hand.getCards();

		assertThat(cardsFromHand[0], is(highCard));
		assertThat(cardsFromHand[1], is(middleCard));
		assertThat(cardsFromHand[2], is(lowCard));
	}
}
