package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerOperatorHomework6 {

	public static void main(String[] args) {
		/*
		Use Scanner
Use AND,OR Operator

1. Ask the user to enter the height in inches. Person should be classified as one of the following:
	• short (under 60 inch)
	• medium (between 60 -72 inch)
	• tall (over 72 inch)
*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches: ");
		int height = scan.nextInt();
		
		 if (height >= 60 && height <= 72) {
	            System.out.println("Person is \"medium\"!");
		 
	 } else if (height< 60) {
         System.out.println("Person is \"short\"!");
     } else if (height > 72) {
         System.out.println("Person is \"tall\"!");
     } else {
         System.out.println("Invalid height entered.");
     }
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
