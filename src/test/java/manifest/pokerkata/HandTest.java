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

	@Test
	public void handShouldHaveDefaultRankingOf0() {
		Card card1 = new Card("2", "C");
		Card card2 = new Card("3", "D");
		Card card3 = new Card("5", "S");
		Card card4 = new Card("7", "C");
		Card card5 = new Card("T", "H");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(0));
	}

	@Test
	public void handShouldHaveRankingOf1ForOnePairInCardsOneAndTwo() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("T", "C");
		Card card3 = new Card("5", "C");
		Card card4 = new Card("3", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(1));
	}

	@Test
	public void handShouldHaveRankingOf1ForOnePairInCardsTwoAndThree() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("5", "C");
		Card card3 = new Card("5", "D");
		Card card4 = new Card("3", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(1));
	}

}
