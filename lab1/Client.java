package lab1;

public class Client {

		public static void main(String[] args) {
			
			Ticket myTicket = new Ticket();
			myTicket.setPrice(100.0);
			
			// checking the toString method
			System.out.println(myTicket);
			
			// f) answer
			float taxRate = 0.06f;	
			double myTax = myTicket.tax(taxRate);
			
			System.out.println(myTax);
			
			// g) answer
			System.out.println(Ticket.DEFAULT_SERVICE);
			
			
			
		}
}
