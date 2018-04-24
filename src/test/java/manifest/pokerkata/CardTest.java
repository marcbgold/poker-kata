package manifest.pokerkata;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CardTest {

	@Test
	public void cardShouldHaveSuit() {
		Card card = new Card("2", "S");
		assertThat(card.getSuit(), is("S"));
	}

	@Test
	public void cardShouldHaveValue() {
		Card card = new Card("2", "S");
		assertThat(card.getPointValue(), is(2));
	}

	@Test
	public void cardShouldHaveValueOf10ForTen() {
		Card card = new Card("T", "S");
		assertThat(card.getPointValue(), is(10));
	}

	@Test
	public void cardShouldHaveValueOf11ForJack() {
		Card card = new Card("J", "S");
		assertThat(card.getPointValue(), is(11));
	}

	@Test
	public void cardShouldHaveValueOf12ForQueen() {
		Card card = new Card("Q", "S");
		assertThat(card.getPointValue(), is(12));
	}

	@Test
	public void cardShouldHaveValueOf13ForKing() {
		Card card = new Card("K", "S");
		assertThat(card.getPointValue(), is(13));
	}

	@Test
	public void cardShouldHaveValueOf14ForAce() {
		Card card = new Card("A", "S");
		assertThat(card.getPointValue(), is(14));
	}

}
