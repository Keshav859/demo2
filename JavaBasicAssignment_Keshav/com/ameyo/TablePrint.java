package com.ameyo;

import java.util.logging.*;

/**
 * Display the table of n
 * @author ameyo
 *
 */
public class TablePrint {

    private static final Logger LOGGER = Logger.getLogger(TablePrint.class.getName());

	/**
	 * This is the main method 
	 * Set the input for tablePrint method
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3;
		LOGGER.info("set the input for tablePrint method is: " + n);
		tablePrint(n);
	}

	/**
	 * This method will print the table of n
	 * @param n
	 */
	public static void tablePrint(int n) {
		for(int index = 1; index < 11; index++) {
			System.out.println(n + " x " + index + " = " + n * index);
		}
	}
}
