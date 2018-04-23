package manifest.pokerkata;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class Hand {

	private Collection<Card> cards;

	public Hand(Card... cardsInput) {
		cards = new TreeSet<Card>();
		cards.addAll(Arrays.asList(cardsInput));
	}

	public Collection<Card> getCards() {
		return cards;
	}

}
