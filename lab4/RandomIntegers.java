/*
Write a program that meets the following requirements:
Creates an array with 100 randomly chosen integers.
Prompts the user to enter the index of the array. Then display the corresponding element
value. If the specified index is out of bounds, display the message Out of Bounds.
 */
//package lab4;

import java.util.Scanner;

public class RandomIntegers {
	
	public static void main(String[] args) {
	
		// creating an array to hold 100 integers 
	    int[] arrayOfIntegers = new int[100];
	    
	    // populate the array with random integers between 0 and 999
	    for (int i = 0; i < arrayOfIntegers.length; i++) {
	    	arrayOfIntegers[i] = (int) (Math.random() * 1000);
	    }
	    
	    // get index from the user 
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter an index: ");
	    try {
	        int index = input.nextInt();
	        //for valid index print the integer present at that index of the array
	        System.out.println("Array item at index " + index + " = " + arrayOfIntegers[index]);
	        
	    } catch (IndexOutOfBoundsException ex) {
	        System.out.println("Index out of bound!");
	        System.out.println("Valid index: 0 to 99");
	    } catch (Exception ex) {
	        System.out.println("Invalid index value");
	    }
	    
		input.close();
	}

}
