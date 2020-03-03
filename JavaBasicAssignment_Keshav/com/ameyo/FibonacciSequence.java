package com.ameyo;

import java.util.logging.*;

/**
 * Way of printing the Fibonacci Sequence
 * @author ameyo
 *
 */
public class FibonacciSequence {

    private static final Logger LOGGER = Logger.getLogger(FibonacciSequence.class.getName());
   // set the value of count 
    static int n1 = 0, n2 = 1, n3 = 0, count = 50;
    
    /**
	 * This is the main method
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("print the Fibonacci sequence using recursive approache:");
		System.out.print(n1 + " " + n2);
		
		// Invoke the fibonacciRecursion method
		fibonacciRecursion(count - 2);
		
		System.out.println("");
		LOGGER.info("print the Fibonacci sequence using iterative approache:");
		LOGGER.info("Reset the values of n1, n2 and n3");
		n1 = 0; n2 = 1; n3 = 0;
		System.out.print(n1 + " " + n2);
		
		// Invoke the fibonacciLoop method
		fibonacciLoop(count - 2);
	}

	/**
	 * Print the Fibonacci sequence using recursive approache
	 * @param count
	 */
	public static void fibonacciRecursion(int count) {
		if (count > 0)
			{
				n3 = n1 + n2;    
				n1 = n2;    
				n2 = n3; 
				// printing the series
				System.out.print(" " + n3);   
				fibonacciRecursion(count - 1);
			}
	}
	
	/**
	 * Print the Fibonacci sequence using iterative approache
	 * @param count
	 */
	public static void fibonacciLoop(int count) {
		for(int index = 2; index < count; ++index)  
			{    
				n3 = n1 + n2;
				// printing the series
				System.out.print(" " + n3);    
				n1 = n2;    
				n2 = n3;    
		    }    
       }
}