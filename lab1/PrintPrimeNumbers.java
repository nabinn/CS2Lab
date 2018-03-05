/**Question 2:
 * Write a program that displays all the prime numbers less than 120 in decreasing order.
 */

//package lab1;

public class PrintPrimeNumbers {
	
	
	public static boolean isPrime(int number) {
        // numbers less than 2 are not prime
		if (number < 2) return false;
		
		// 2 is a prime number
        if (number == 2) return true;
        
        // even numbers are not prime (except 2)
        if (number % 2 == 0) return false;
        
        for (int i = 3; i * i <= number; i += 2)
            if (number % i == 0) return false;
        
        return true;
	}

	
	public static void main(String[] args) {
	
		System.out.println("Prime Numbers less than 120 in decreasing order: ");
		
		for (int i = 120 ; i > 0 ;  i--) {
			
			if ( isPrime(i)){
				System.out.println(i);
			}
		}

	}

}
