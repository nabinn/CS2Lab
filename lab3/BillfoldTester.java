//package lab3;

public class BillfoldTester {

	public static void main(String[] args) {
		
		Billfold billfold1 = new Billfold();
		
		Card card1 = new IDCard("Adam", 1234);
		Card card2 = new CallingCard("Bryan", 4567, 123);
		
		billfold1.addCard(card1);
		billfold1.addCard(card2);
		
		System.out.println(billfold1.formatCards());
		
		
		Billfold billfold2 = new Billfold();
		Card card3 = new CallingCard("Chloe", 4567, 567); //calling card
		Card card4 = new DriverLicense("David", 8879, 2017); //expired driver license
		
		billfold2.addCard(card3);
		billfold2.addCard(card4);
		System.out.println(billfold2.getExpiredCardCount()); // should print 1
		
		//checking toString() method
		System.out.println(card1);
		System.out.println(card3);
		System.out.println(card4);
		
		
		
		Card card5 = new IDCard("Adam", 1234);
		Card card6 = new DriverLicense("David", 8879, 2017); //expired driver license
		
		// checking equals method
		System.out.println(card1.equals(card5)); // true
		System.out.println(card2.equals(card3)); // false
		System.out.println(card2.equals(card4)); // false
		System.out.println(card4.equals(card6)); // true
	}

}
