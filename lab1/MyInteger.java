/* Question 1:
Design a class named MyInteger. The class contains:
- An int data field named value that stores the int value represented by this object.
- A constructor that creates a MyInteger object for the specified int value.
- A get method that returns the int value.
- Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or
	prime, respectively.
- Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the
- specified value is even, odd, or prime, respectively.
- Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)
- that return true if the specified value is even, odd, or prime, respectively.
- Methods equals(int) and equals(MyInteger) that return true if the value in the object
- is equal to the specified value.
- A static method parseInt(char[]) that converts an array of numeric characters to an
	int value.
- A static method parseInt(String) that converts a string into an int value.
 */

package lab1;

public class MyInteger {
	// An int data field named value that stores the int value represented by this object
	private int value;
	
	// A constructor that creates a MyInteger object for the specified int value.
	public MyInteger(int value) {
		this.value = value;
	}
	
	//A get method that returns the int value
	public int getValue() {
		return this.value;
	}
	
	// Methods isEven(), isOdd(), and isPrime() that return true if 
	// the value is even, odd, or prime, respectively.
	public boolean isEven() {
		return this.value % 2 == 0 ;
	}
	
	public boolean isOdd() {
		return this.value % 2 == 1; 
	}
	
	public boolean isPrime() {
        // numbers less than 2 are not prime
		if (this.value < 2) return false;
		
		// 2 is a prime number
        if (this.value == 2) return true;
        
        // even numbers are not prime (except 2)
        if (this.isEven()) return false;
        
        for (int i = 3; i * i <= this.value; i += 2)
            if (this.value % i == 0) return false;
        
        return true;
	}
	
	//Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the
	//specified value is even, odd, or prime, respectively.
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	public static boolean isPrime(int num) {
    
		if (num < 2) return false;
		
		// 2 is a prime number
        if (num == 2) return true;
        
        // even numbers are not prime (except 2)
        if (num % 2 == 0) return false;
        
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        
        return true;
	}

	
	// Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)
	// that return true if the specified value is even, odd, or prime, respectively.
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}
	
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}

	
	// Methods equals(int) and equals(MyInteger) that return true if the value 
	// in the object is equal to the specified value.
	public boolean equals(int num) {
		return this.value == num;
	}
	
	public boolean equals(MyInteger myInteger) {
		return this.value == myInteger.getValue();
	}
	
	// A static method parseInt(char[]) that converts an array of numeric characters to an
	// int value.
	public static int parseInt(char[] charArr) {
		return Integer.parseInt(new String(charArr));
	}
	
	// A static method parseInt(String) that converts a string into an int value.
	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
	
}
