package lab3;

public class CallingCard extends Card {
	
	private int cardNumber;
	private int pin;
	
	
	
	public CallingCard(String name, int cardNumber, int pin) {
		super(name);
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	
	@Override
	public String format() {
		return super.format()+", Card Number: " + cardNumber;
	}

	@Override
	public String toString() {
		return "CallingCard[ name = "+super.getName()+"] [cardNumber=" + cardNumber + ", pin=" + pin + "]";
	}
	
	
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public boolean equals(CallingCard otherCard) {
		return super.equals(otherCard) &&
				this.cardNumber == otherCard.getCardNumber() &&
				this.pin == otherCard.getPin();
	}
	
	

}
