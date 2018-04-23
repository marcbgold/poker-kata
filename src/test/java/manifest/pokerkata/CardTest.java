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
		assertThat(card.getValue(), is("2"));
	}

	@Test
	public void cardShouldHaveValueOf10ForTen() {
		Card card = new Card("T", "S");
		assertThat(card.getValue(), is("10"));
	}

	@Test
	public void cardShouldHaveValueOf11ForJack() {
		Card card = new Card("J", "S");
		assertThat(card.getValue(), is("11"));
	}

}
