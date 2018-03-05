//package lab3;

public class Card {
	
	private String name;
	
	public Card() {
		name = "";
	}
	
	public Card(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}

	public boolean isExpired() {
		return false;
	}

	public String format() {
		return "Card holder: " + name;
	}
	
	public boolean equals(Card otherCard) {
		return otherCard.getName().equals(this.getName());
	}
	
	@Override
	public String toString() {
		return "Card [name=" + name + "]";
	}
}
