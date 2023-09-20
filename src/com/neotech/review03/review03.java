package com.neotech.review03;

public class review03 {

	public static void main(String[] args) {
		// $$$$$
		// $$$$$
		// $$$$$
		// $$$$$
		
		/*for (int i = 1; i <= 4; i++) {  // 4 rows
			
			for (int j = 1; j <= 5; j++) {   // 5 columns
				System.out.print("$");
			}
			
			System.out.println();
			*/
		
		// Task (make some changes on pattern)
		// $$$$$
		// $   $
		// $   $
		// $$$$$
		
		 int size = 5;
		  // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 5; j++) {
                // Check if it's the first row, last row, first column, or last column
                // to print the '$' symbol, otherwise print a space ' '
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row is printed
        }
		
		System.out.println("----------------");
		
		// *
		// **
		// ***
		// ****
		
		for (int row = 1; row<=4; row++) {
			
			for (int col =1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		}
	}


