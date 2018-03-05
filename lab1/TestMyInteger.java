//package lab1;

// Tests MyInteger class and its methods
public class TestMyInteger {

	public static void main(String[] args) {
		
		 // checking instance methods
		 MyInteger myInteger1 = new MyInteger(12);
		 System.out.println("Is "+myInteger1.getValue()+ " even? " + myInteger1.isEven());
		 System.out.println("Is "+myInteger1.getValue()+ " odd? " + myInteger1.isOdd());
		 System.out.println("Is "+myInteger1.getValue()+ " prime? " + myInteger1.isPrime());

		 MyInteger myInteger2 = new MyInteger(45);
		 System.out.println("Is "+myInteger2.getValue()+ " even? " + myInteger2.isEven());
		 System.out.println("Is "+myInteger2.getValue()+ " odd? " + myInteger2.isOdd());
		 System.out.println("Is "+myInteger2.getValue()+ " prime? " + myInteger2.isPrime());	
		 
		 System.out.println(myInteger1.getValue()+ " equals "+myInteger2.getValue()+ " ? " + myInteger1.equals(myInteger2));
		 System.out.println(myInteger1.getValue()+ " equals "+myInteger1.getValue()+ " ? " + myInteger1.equals(myInteger1));
		 
		 System.out.println(myInteger1.getValue()+ " equals 23 ? " + myInteger1.equals(23));
		 
		 // checking static methods
		 MyInteger myInteger15 = new MyInteger(15);
		 System.out.println("Is 15 even? " + MyInteger.isEven(myInteger15));
		 System.out.println("Is 15 odd? " + MyInteger.isOdd(myInteger15));
		 System.out.println("Is 15 prime? " + MyInteger.isPrime(myInteger15));
		 
		 char[] c = {'1', '2' , '3' , '7'};
		 System.out.println("The int value for the char array is :" + MyInteger.parseInt(c));
		 
		 
		 String s = "1150";
		 System.out.println("The integer value for the string "+ s +" is "+ MyInteger.parseInt(s));
	}

}
