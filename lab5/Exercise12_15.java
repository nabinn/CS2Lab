//package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
Write a program to create a file named Exercise12_15.txt if it does not exist. 
Write 100 integers created randomly into the file using text I/O.
Integers are separated by spaces in the file. Read the data back from the file and
display the data in increasing order.
*/

public class Exercise12_15 {
	
	public static void main(String[] args) {
		
		File file = new File("Exercise12_15.txt");
		
		// if file doesn't exit, create it
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// write 100 random integers to the file separated by space
		try {
			PrintWriter output = new PrintWriter(file);
			
			for (int i = 0 ; i < 100 ; i++ ) {
				// range of random integers : 0 to 999
				output.print(((int)(Math.random() * 1000)) + " ");
			}
			output.close();
			System.out.println("Write Complete");
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		
		//read data back from the file and put it in a list
		List<Integer> listOfNumbers = new ArrayList<Integer>(); 
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				listOfNumbers.add(input.nextInt());
			}
			input.close();
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		// sort the list, so that numbers are in increasing order
		Collections.sort(listOfNumbers); // sorts the list in-place
		
		
		// print the numbers in sorted list
		System.out.println(listOfNumbers);
		
	}
	
}
