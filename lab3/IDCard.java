package lab3;

public class IDCard extends Card{
	
	private int idNumber;

	public IDCard(String name, int idNumber) {
		super(name);
		this.idNumber = idNumber;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	@Override
	public String format() {
		return super.format()+ ", Id Number: " + idNumber;
	}

	@Override
	public String toString() {
		return "IDCard [name = "+super.getName()+" ][idNumber=" + idNumber + "]";
	}
	
	public boolean equals(IDCard otherCard) {
		return super.equals(otherCard) && 
			   this.idNumber == otherCard.idNumber;
	}
	
	

}
