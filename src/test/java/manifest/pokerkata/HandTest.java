package manifest.pokerkata;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HandTest {

	@Test
	public void handShouldContainCards() {
		Card card1 = new Card("2", "C");
		Card card2 = new Card("3", "D");
		Card card3 = new Card("5", "S");
		Card card4 = new Card("7", "C");
		Card card5 = new Card("T", "H");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		Card[] cardsFromHand = hand.getCards();

		assertThat(cardsFromHand[0], is(card5));
	}

	@Test
	public void handShouldPutCardsInDescendingOrderByValue() {
		Card card1 = new Card("2", "C");
		Card card2 = new Card("3", "D");
		Card card3 = new Card("5", "S");
		Card card4 = new Card("7", "C");
		Card card5 = new Card("T", "H");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		Card[] cardsFromHand = hand.getCards();

		assertThat(cardsFromHand[0], is(card5));
		assertThat(cardsFromHand[1], is(card4));
		assertThat(cardsFromHand[2], is(card3));
		assertThat(cardsFromHand[3], is(card2));
		assertThat(cardsFromHand[4], is(card1));
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
	public void handShouldHaveRankingOf1ForOnePairInCardsOne_Two() {
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
	public void handShouldHaveRankingOf1ForOnePairInCardsTwo_Three() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("5", "C");
		Card card3 = new Card("5", "D");
		Card card4 = new Card("3", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(1));
	}

	@Test
	public void handShouldHaveRankingOf1ForOnePairInCardsThree_Four() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("5", "C");
		Card card3 = new Card("3", "S");
		Card card4 = new Card("3", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(1));
	}

	@Test
	public void handShouldHaveRankingOf1ForOnePairInCardsFour_Five() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("5", "C");
		Card card3 = new Card("3", "S");
		Card card4 = new Card("2", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(1));
	}

	@Test
	public void handShouldHaveRankingOf2ForTwoPairInCardsOne_TwoAndThree_Four() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("T", "C");
		Card card3 = new Card("3", "S");
		Card card4 = new Card("3", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(2));
	}

	@Test
	public void handShouldHaveRankingOf2ForTwoPairInCardsOne_TwoAndFour_Five() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("T", "C");
		Card card3 = new Card("3", "S");
		Card card4 = new Card("2", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(2));
	}

	@Test
	public void handShouldHaveRankingOf2ForTwoPairInCardsTwo_ThreeAndFour_Five() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("3", "C");
		Card card3 = new Card("3", "S");
		Card card4 = new Card("2", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(2));
	}

	@Test
	public void handShouldHaveRankingOf3ForThreeOfAKindInCardsOne_Two_Three() {
		Card card1 = new Card("T", "H");
		Card card2 = new Card("T", "C");
		Card card3 = new Card("T", "S");
		Card card4 = new Card("3", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(3));
	}

	@Test
	public void handShouldHaveRankingOf3ForThreeOfAKindInCardsTwo_Three_Four() {
		Card card1 = new Card("J", "H");
		Card card2 = new Card("T", "C");
		Card card3 = new Card("T", "S");
		Card card4 = new Card("T", "D");
		Card card5 = new Card("2", "S");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(3));
	}

	@Test
	public void handShouldHaveRankingOf3ForThreeOfAKindInCardsThree_Four_Five() {
		Card card1 = new Card("K", "H");
		Card card2 = new Card("Q", "C");
		Card card3 = new Card("T", "S");
		Card card4 = new Card("T", "D");
		Card card5 = new Card("T", "C");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(3));
	}

	@Test
	public void handShouldHaveRankingOf4ForStraight() {
		Card card1 = new Card("9", "H");
		Card card2 = new Card("8", "C");
		Card card3 = new Card("7", "S");
		Card card4 = new Card("6", "D");
		Card card5 = new Card("5", "C");

		Hand hand = new Hand(card1, card2, card3, card4, card5);

		int ranking = hand.getRanking();

		assertThat(ranking, is(4));
	}

}
