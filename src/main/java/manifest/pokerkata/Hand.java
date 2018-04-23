package manifest.pokerkata;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Hand {

	private TreeSet<Card> cards;

	public Hand(Card... cardsInput) {
		cards = new TreeSet<Card>(Arrays.asList(cardsInput));
	}

	public NavigableSet<Card> getCards() {
		return cards.descendingSet();
	}

}
