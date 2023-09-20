package com.neotech.lesson09;

import java.util.Scanner;

public class Homework0904 {

	public static void main(String[] args) {
		// Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an "yes" from a user program should stop asking.

		String response;
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		for (int i=0; i<10; i++) 
		{
			System.out.println("Would you like to apply for a credit card? (yes/no): ");
			response=scanner.next(); // String response = scanner.nextLine();
			
			if (response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no") ) {
				 System.out.println("Great! Please proceed with the application.");
					
            break;
        } 
}
{
	
} 






	}

}
