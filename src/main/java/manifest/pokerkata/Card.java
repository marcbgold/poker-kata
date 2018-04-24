package manifest.pokerkata;

public class Card implements Comparable<Object> {

	private String suit;
	private String faceValue;
	private int pointValue;

	public Card(String value, String suit) {
		faceValue = value;
		this.suit = suit;

		switch (value) {
		case "T":
			this.pointValue = 10;
			break;
		case "J":
			this.pointValue = 11;
			break;
		case "Q":
			this.pointValue = 12;
			break;
		case "K":
			this.pointValue = 13;
			break;
		case "A":
			this.pointValue = 14;
			break;
		default:
			this.pointValue = Integer.parseInt(value);
		}
	}

	public String getSuit() {
		return suit;
	}

	public String getFaceValue() {
		return faceValue;
	}

	public int getPointValue() {
		return pointValue;
	}

	@Override
	public int compareTo(Object otherCard) {
		int otherValue = ((Card) otherCard).getPointValue();

		if (pointValue < otherValue) {
			return -1;
		} else if (pointValue > otherValue) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return pointValue + suit;
	}

}
