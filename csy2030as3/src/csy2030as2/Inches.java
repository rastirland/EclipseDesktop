package csy2030as2;
import java.io.*;
public class Inches {

	    // Function to perform conversion
	    static double Conversion(int cm)
	    {
	        double inch = 0.3937 * cm;
	        
	        System.out.printf("Inches is: %.2f \n", inch);
	        return 0;
	    }
	 
	    // Driver Code
	    public static void main(String args[])
	    {
	        int cm = 5;
	        Conversion(cm);
	    }
	}

