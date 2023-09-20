package com.neotech.lesson10;

public class Task1 {

	public static void main(String[] args) {
		// Print the following pattern using a nested for loop.
		//1
		//22
		//333
		//4444
		//55555
		
		int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= 5; i++) 
        {
        	   //in the first loop: i = 1, the inner loop only happens once
        	
        	   //the inner loop:
        	   //1st record:only loop once
        	   //2nd record:only loop twice
        	   //.....
        	
               for (int j = 0; j < i; j++) 
        {
        System.out.print(i);
        }
        System.out.println();
        }
		
		
		
		
		
		
	}

}
