package manifest.pokerkata;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HandTest {

	@Test
	public void handShouldContainCards() {
		Hand hand = new Hand("2S");

		assertThat(hand.getCards(), contains("2S"));

	}
}
