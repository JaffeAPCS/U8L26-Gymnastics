import java.io.*;
import java.util.*;
import java.text.*;

public class BaseClass {
    
    public static void main (String args[]) throws IOException {
        // Setup the number formatter for 3 decimal places
        // You may also use the System.out.printf formatting
        // method instead -- your choice
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);
        
        // Initialize the scanner
        // Make sure you insert the data filename
        Scanner sf = new Scanner(new File("<filename goes here>"));
        
        // i will keep the current length of the array
        // text will keep the lines of text
        int i = 0;
        String text[] = new String[1000];

        // Loop through the file scanner retrieving each line of text
        while (sf.hasNext()) {
            // Store line in text[]
            text[i] = sf.nextLine();
            // Print result to console (may be commented out if not needed)
            System.out.println(text[i]);
            // Increment the index
            i++;
            // At this point i has the current length of text[]
        }
        
        // Close the file scanner
        sf.close();
        
        // Loop through each line stored in text[]
        for (int j=0; j<i; j++) {
            // Use one of the following statements to "tokenize" each line:
            //
            // StringTokenizer is a class that will break apart words 
            // (tokens) that are separated by a delimiter (spaces, tabs,
            // or commas typically).  The delimiter parameter " " is optionsl.
            // If omitted, the default of spaces, tabs, newline, carriage-return, 
            // or form-feed is used.  You can specify more than one delimeter too!
            //
            // You are already familiar with the Scanner class
            StringTokenizer st = new StringTokenizer(text[j], " ");
            Scanner sc = new Scanner(text[j]);
            
            //**********************************************************//
            // This is the place where you'll add code that is specific to
            // your task.
            // 
            // text[j] is the line of text
            // st is the StringTokenizer variable. Use st.hasMoreTokens() and
            //   st.NextToken() to process the text
            // sc is the Scanner variable. Use sc.hasNext() and sc.nextXXX() 
            //   to process the text
            //
            // --> Your code goes here!
            //
            //**********************************************************//
            
            // This is for testing. You can comment this line out later if 
            // it's not needed
            System.out.println(text[j]);
        }
    }
}