package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// data  type  identifier  operator value;

		//how to import:
		//1. import specifically the class
		//2. Windows: CTRL + SHIFT + 0     MAC: CMD + SHIFT + 0
		
		//input is the identifier/name that we gave to this new thing we declared
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Please enter your name: ");
		//asking for input and saving the input in a String
		String name = input.next();
		System.out.println("Your name is: " + name);
		
		
		
		
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);
		
		System.out.println("Please enter your salary:");
		double salary = input.nextDouble();
		System.out.println("Your salary is:  " + salary);
		
		System.out.println("Is it raining??");
		boolean raining = input.nextBoolean();
				

	
		if (raining)
		{
			System.out.println("Bring an umbrella!");
		}		
		else 
		{
			System.out.println("Come as you wish!!");
		}		
				
				
				
		
		
		
		
	}

}




