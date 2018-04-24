package manifest.pokerkata;

import java.util.Arrays;
import java.util.Collections;

public class Hand {

	private Card[] cards;
	private int value1;
	private int value2;
	private int value3;
	private int value4;
	private int value5;

	public Hand(Card... cardsInput) {
		cards = cardsInput;
		Arrays.sort(cards, Collections.reverseOrder());

		value1 = cards[0].getPointValue();
		value2 = cards[1].getPointValue();
		value3 = cards[2].getPointValue();
		value4 = cards[3].getPointValue();
		value5 = cards[4].getPointValue();
	}

	public Card[] getCards() {
		return cards;
	}

	public int getRanking() {
		if (isAStraight() && isAFlush()) {
			return 8;
		}

		if (hasFourOfAKind()) {
			return 7;
		}

		if (isAFullHouse()) {
			return 6;
		}

		if (isAFlush()) {
			return 5;
		}

		if (isAStraight()) {
			return 4;
		}

		if (hasThreeOfAKind()) {
			return 3;
		}

		if (hasTwoPairs()) {
			return 2;
		}

		if (hasOnePair()) {
			return 1;
		}

		return 0;
	}

	private boolean hasOnePair() {
		if (value1 == value2 || value2 == value3 || value3 == value4 || value4 == value5) {
			return true;
		}

		return false;
	}

	private boolean hasTwoPairs() {
		if (value1 == value2 && value3 == value4 || //
				value1 == value2 && value4 == value5 || //
				value2 == value3 && value4 == value5) {
			return true;
		}

		return false;
	}

	private boolean hasThreeOfAKind() {
		if (value1 == value2 && value2 == value3 || //
				value2 == value3 && value3 == value4 || //
				value3 == value4 && value4 == value5) {
			return true;
		}

		return false;
	}

	private boolean isAStraight() {
		for (int i = 0; i < cards.length - 1; i++) {
			if (cards[i + 1].getPointValue() != cards[i].getPointValue() - 1) {
				return false;
			}
		}

		return true;
	}

	private boolean isAFlush() {
		for (int i = 0; i < cards.length - 1; i++) {
			String currentCardSuit = cards[i].getSuit();
			String nextCardSuit = cards[i + 1].getSuit();

			if (!currentCardSuit.equals(nextCardSuit)) {
				return false;
			}
		}

		return true;
	}

	private boolean isAFullHouse() {
		if (value1 == value2 && value2 == value3 && value4 == value5 || //
				value1 == value2 && value3 == value4 && value4 == value5) {
			return true;
		}

		return false;
	}

	private boolean hasFourOfAKind() {
		if (value1 == value2 && value2 == value3 && value3 == value4 || //
				value2 == value3 && value3 == value4 && value4 == value5) {
			return true;
		}

		return false;
	}

}
