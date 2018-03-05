//package lab5;

/**
 Write a program that will count the number of characters, words, and lines
 in a file. Words are separated by whitespace characters. 
 The file name should be passed as a command-line argument.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_13 {
	
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("Usage: java Exercise12_13 filename");
			System.exit(1);
		}
		
		// filename is provided as first command line argument
		String fileName = args[0];
		File file = new File(fileName);
		if (!file.exists()) {
            System.out.println(file + " does not exist.");
            System.exit(1);
        }
		
	int numChars = 0; 
        int numWords = 0; 
        int numLines = 0;

        try {
        	
            Scanner input = new Scanner(file);
      
            // while there is next line in the file
            while (input.hasNextLine()) {
            	//increment line count
            	numLines++;
            	
            	// read the next line
            	String line = input.nextLine();
                
            	// add line length to number of characters
            	numChars += line.length();
                
                // split the line by space to count words
                String[] wordArray = line.split(" ");
                numWords += wordArray.length;
            }
            
            input.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    
        System.out.println("Number of Characters: " + numChars);
        System.out.println("Number of Words: " + numWords);
        System.out.println("Number of Lines: " + numLines);


    }

}
