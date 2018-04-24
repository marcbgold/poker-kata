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

	public int getRanking() {
		int value1 = cards[0].getPointValue();
		int value2 = cards[1].getPointValue();

		if (value1 == value2) {
			return 1;
		}

		return 0;
	}

}
