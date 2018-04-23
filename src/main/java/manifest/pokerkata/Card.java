package manifest.pokerkata;

public class Card implements Comparable<Object> {

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

	@Override
	public int compareTo(Object otherCard) {
		int thisValue = Integer.parseInt(value);
		int otherValue = Integer.parseInt(((Card) otherCard).getValue());

		if (thisValue < otherValue) {
			return -1;
		} else if (thisValue > otherValue) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return value + suit;
	}

}
