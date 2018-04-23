package manifest.pokerkata;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CardTest {

	@Test
	public void cardShouldHaveSuit() {
		Card card = new Card("S", "2");
		assertThat(card.getSuit(), is("S"));
	}
	
	@Test
	public void cardShouldHaveValue() {
		Card card = new Card("S", "2");
		assertThat(card.getValue(), is("2"));
	}
	
	@Test
	public void cardShouldHaveValueOf10ForSuitT() {
		Card card = new Card("S", "T");
		assertThat(card.getValue(), is("10"));
	}
	
}
