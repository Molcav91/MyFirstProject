package com.neotech.lesson10;

public class Task3 {

	public static void main(String[] args) {
		// get input from the user, then based on that print this structure
		// for ex:input = 6
//		1
//		22
//		333
//		4444
//		55555
//		666666
//		55555
//		4444
//		333
//		22
//		1
		for (int row = 1; row <= 6; row++) 
		{
			for (int col = 0; col < row; col++)
			{
				System.out.print(row);
			}
			
			System.out.println();
		
	}
		for (int row = 5; row >=1; row --) 
		{
			for (int col = 0; col < row; col ++) {
				System.out.print(row);
			}
			System.out.println();
		}

} }
