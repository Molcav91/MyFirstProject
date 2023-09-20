package com.neotech.lesson10;

public class Task2 {

	public static void main(String[] args) {

	
		/*
		 * 
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		for (int row = 0; row < 5; row++)
		{
			
			//1st loop: inner loop need to iterate once
			
			for (int col = 0; col <= row; col++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		  
		 */
		
		
		for (int row = 4; row >= 1; row--) //we change from 5 to 4, to print a pyramid sideways
		{
			for (int col = 0; col < row; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}