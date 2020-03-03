package com.ameyo;

public class StringManipulation {
    
	// method for maniplute the string
	public static void manipulateString(String str) {
		 String temp = "";
         for (int index = str.length()-1; index >= 0; index--){
            if (temp.indexOf(str.charAt(index)) == - 1){
               temp = temp + str.charAt(index);
         }
      }
         // print the output
         System.out.println(temp + " ");
	}
	
	// This is the main method
	public static void main(String[] args) {
		// taking string as a input
		manipulateString("aabcdaafhbdr");
	}
}
