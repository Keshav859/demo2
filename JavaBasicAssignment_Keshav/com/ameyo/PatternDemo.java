package com.ameyo;

public class PatternDemo {

	// method for printing the pattern
	public static void print(int n) 
		{ 
	    	int var1 = 3, var2 = 2; 
	      
	        for (int i = 0; i < n; i++)  
	        { 
	           for (int j = n - 1; j > i; j--)  
	            { 
	                System.out.print(" "); 
	            } 
	           for (int k = 1; k <= var1; k++)  
	            { 
	                System.out.print(Math.abs(k - var2)); 
	            } 
	      
	            var1 += 2; 
	            var2++; 
	            System.out.println(); 
	        } 
	    } 

	// This is the main method
	public static void main(String[] args) {
		// set the input for pattern
		print(5);
	}
}
