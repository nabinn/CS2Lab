package lab3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicense extends IDCard {
	
	private int expirationYear;
	
	public int getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}

	public DriverLicense(String name, int idNumber, int expirationYear) {
		super(name, idNumber);
		this.expirationYear = expirationYear;
	}
	
	@Override
	public boolean isExpired() {
		GregorianCalendar calendar = new GregorianCalendar();
		int currentYear = calendar.get(Calendar.YEAR);
		return expirationYear < currentYear;
	}
	
	
	@Override
	public String format() {
		
		return super.format()+", Expiration Year: " + expirationYear;
	}

	@Override
	public String toString() {
		return "DriverLicense[ name = "+super.getName()+", id number = "+
				super.getIdNumber()+" ] [expirationYear=" + expirationYear + "]";
	}
	
	public boolean equals(DriverLicense otherCard) {
		return super.equals(otherCard) &&
				this.expirationYear == otherCard.getExpirationYear();
	}

}
