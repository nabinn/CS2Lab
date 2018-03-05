//package lab1;

public class Ticket {
	
	private double price;
	private char service;
	public static char DEFAULT_SERVICE = 'B';
	
	// Default constructor
	public Ticket() {
		price = 0.0 ; 
		service = DEFAULT_SERVICE; 
	}
	
	public Ticket( double newPrice, char newService ){
		setPrice( newPrice );
		setService( newService );
	}
	
	// a) mutator methods
	public void setPrice(Double newPrice) {
		if (newPrice >= 0 ) {
			price = newPrice;
		}
		else {
			System.out.println("Price must be greate than or equal to zero");
		}
	}
	
	public void setService(char newService) {
		if (newService == 'A' || newService == 'B') {
			service = newService;
		}
		else {
			System.out.println("Service must be either A or B.");
		}
	}
	
	// b) accessor methods
	public double getPrice() {
		return price;
	}
	
	public char getService() {
		return service;
	}
	
	//c) method that switches the value of service
	public void switchService() {
		if (service == 'A') {
			service = 'B';
		}else {
			service = 'A';
		}
	}
	
	// d) changing the toString method to return the service and price separated by a : (colon)
	@Override
	public String toString() {
		return  getService()+" : "+ getPrice();
	}
	
	// e) data type of parameter is float
	// return type is double
	public double tax(float rate) {
		return price * rate ;
	}
	
	// see Client.java for f) and g)
	
}
