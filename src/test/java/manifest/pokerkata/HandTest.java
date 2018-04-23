package manifest.pokerkata;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HandTest {

	@Test
	public void handShouldContainCards() {
		Card card = new Card("2", "S");
		Hand hand = new Hand(card);

		assertThat(hand.getCards(), contains(card));

	}
}
