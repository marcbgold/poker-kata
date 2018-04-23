package manifest.pokerkata;

public class Card {

	private String suit;
	private String value;

	public Card(String value, String suit) {
		this.suit = suit;

		switch (value) {
		case "T":
			this.value = "10";
			break;
		case "J":
			this.value = "11";
			break;
		case "Q":
			this.value = "12";
			break;
		case "K":
			this.value = "13";
			break;
		case "A":
			this.value = "14";
			break;
		default:
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
