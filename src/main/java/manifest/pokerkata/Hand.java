package manifest.pokerkata;

import java.util.Arrays;
import java.util.Collections;

public class Hand {

	private Card[] cards;

	public Hand(Card... cardsInput) {
		cards = cardsInput;
		Arrays.sort(cards, Collections.reverseOrder());
	}

	public Card[] getCards() {
		return cards;
	}

}
