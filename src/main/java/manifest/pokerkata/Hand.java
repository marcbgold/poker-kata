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
		int value3 = cards[2].getPointValue();
		int value4 = cards[3].getPointValue();
		int value5 = cards[4].getPointValue();

		if (value1 == value2 && value2 == value3 || //
				value2 == value3 && value3 == value4 || //
				value3 == value4 && value4 == value5) {
			return 3;
		}

		if (value1 == value2 && value3 == value4 || //
				value1 == value2 && value4 == value5 || //
				value2 == value3 && value4 == value5) {
			return 2;
		}

		if (value1 == value2 || value2 == value3 || value3 == value4 || value4 == value5) {
			return 1;
		}

		return 0;
	}

}
