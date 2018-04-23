package manifest.pokerkata;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CardTest {

	@Test
	public void cardShouldHaveSuit() {
		Card card = new Card("S");
		assertThat(card.getSuit(), is("S"));
	}
	
}
