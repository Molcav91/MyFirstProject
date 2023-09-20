package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Write a program that asks user to enter first name and 
		//then last name. At the end print user's full name.

		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your first name: ");
		//asking for input and saving the input in a String
		String name = input.next();
		System.out.println("Your first name is: " + name);
		

		System.out.println("Please enter your last name: ");
		//asking for input and saving the input in a String
		String lastname = input.next();
		System.out.println("Your last name is: " + lastname);
		
		System.out.println("Please enter your full name: ");
		//asking for input and saving the input in a String
		String fullname = input.next();
		System.out.println("Your full name is: " +  name + " " +  lastname);
		
		
		
		
		
	}

}
