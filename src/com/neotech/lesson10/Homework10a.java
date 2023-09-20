package com.neotech.lesson10;

import java.util.Scanner;

public class Homework10a {

	public static void main(String[] args) {
		// Ask the user to enter an integer and build the following pattern:
		/*Hint: Use scanner, if user entered number 5, there should be 5 rows.
		In the first row, 0 spaces, (2 * 5) - 1 stars
		In the second row, 1 spaces, (2 * 4) - 1 stars
		In the third row, 2 spaces, (2 * 3) - 1 stars
		In the fourth row, 3 spaces, (2 * 2) - 1 stars
		In the fifth row, 4 spaces, (2 * 1) - 1 stars

		*********
		 *******
		  *****
		   ***
		    *
*/
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();
            int x = (2 * numRows) - 1;
            
            for (int i = 1; i<= numRows; i++) {
            	for (int j = x; j>= i; j--) {
            		if (i + j >= x + 2) {
            			System.out.print(" ");
            		} else {
            			System.out.print("*");
            		}
	            }
	            System.out.println();
	        }
	}

}
