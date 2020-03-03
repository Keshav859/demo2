package com.ameyo;

import java.util.Random;
import java.util.logging.*;

/**
 * Iteration through different approaches
 * @author ameyo
 *
 */
public class IterationWays {

    private static final Logger LOGGER = Logger.getLogger(IterationWays.class.getName());
	static int[] anArray = new int[100];

	/**
	 * Generate the random numbers
	 * @return
	 */
	public static int randomFill() {
		Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
	}
	
	/**
	 * This is the main method
	 * @return
	 */
	public static void main(String[] args) {
		
		/**
		 * Set the random values in array
		 */
		for(int index = 0; index < anArray.length; index++){
	        anArray[index] = randomFill();
	    }
		
		LOGGER.info("Iterate and print the array using for i = 0 style of loop: ");
		for(int index = 0; index < anArray.length; index++){
			System.out.print(anArray[index]+" ");
		}
	
		System.out.println("");
		LOGGER.info("Iterate and print the array using for each style of loop: ");
		for(int index:anArray) {
			System.out.print(index+" ");
		}
	}
}
