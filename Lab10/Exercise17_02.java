/*
17.2 (Create a binary data file) Write a program to create a file named Exercise17_02.dat if it
does not exist. Append new data to it if it already exists. Write 100 integers created randomly
into the file using binary I/O.
*/

import java.util.Random;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

//import java.io.DataInputStream;
//import java.io.FileInputStream;



public class Exercise17_02 {
	  public static void main(String[] args) {  
		  
			  String filename = "Exercise17_02.dat";
			  boolean append = true;
			  
			  try(
					// create an output stream to the file 
					  DataOutputStream dataOutputStream = new DataOutputStream(
							  		new FileOutputStream(filename, append));
			      ) {
				  
				  	//write 100 random integers to the file using the output stream 
				  	Random random = new Random();	
				  	for(int i = 0; i< 100; i++) {
				  		dataOutputStream.writeInt(random.nextInt());
				  	}
				  
			    System.out.println("write successful");
				  
			  } catch (IOException ex) {
				ex.printStackTrace();
			  }
			  
			  // uncomment the following to read data back from the binary file
			  // note: need to import java.util.DataInputStream and java.util.FileInputStream
			  /*
			  try(
						// create an input stream from the file 
						  DataInputStream dataInputStream = new DataInputStream(
								  		new FileInputStream(filename));
				      ) {
					  	
			  // Read values from the file and print them
			  int value;
			  while ((value = dataInputStream.read()) != -1)
			  System.out.println(value + " ");  
			  } catch (IOException ex) {
				ex.printStackTrace();
			  }
			  */
	}

}