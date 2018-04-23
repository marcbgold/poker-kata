package manifest.pokerkata;

public class Card {

	private String suit;
	private String value;

	public Card(String suit, String value) {
		this.suit = suit;

		if (value.equals("T")) {
			this.value = "10";
		} else {
			this.value = value;
		}
	}

	public String getSuit() {
		return suit;
	}

	public String getValue() {

		return value;
	}

}
