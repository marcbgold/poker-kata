package manifest.pokerkata;

import java.util.Collection;
import java.util.HashSet;

public class Hand {

	private Collection<Card> cards;

	public Hand(Card card) {
		cards = new HashSet<Card>();
		cards.add(card);
	}

	public Collection<Card> getCards() {
		return cards;
	}

}
