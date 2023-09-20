package com.neotech.lesson10;

import java.util.Scanner;

public class Task3Sabah {

	public static void main(String[] args) {
		// get input from the user, then based on that print this structure
				// for ex:input = 6
//				1
//				22
//				333
//				4444
//				55555
//				666666
//				55555
//				4444
//				333
//				22
//				1
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println(("Enter a number: "));
        int size = scan.nextInt();
        
        for (int row = 1; row <= size; row++) 
        {
        	
        	//first loop:
        	// row 1, col 0 ---> it runs only once
        	
        	for (int col = 0; col < row; col++)
        	{
        		System.out.print(row);
        	}
        	System.out.println();
        	
        }
	}

}
