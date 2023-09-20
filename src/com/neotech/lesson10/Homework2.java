package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		//Write a program that asks user to enter his/her username and password 
		//until user enters them correctly.

		//how do we decide which loop?
		// for vs while vs do while
		// - for is suitable when we are dealing with a countable number of loops
		// - in this case, we do not know, so we will not use it
		
		// while vs do while
		// - do while get executed at least once
		// - in this case, do while is more suitable
		
		Scanner scan = new Scanner(System.in);
		
		// our credentials
		String un = "user";
		String pass = "password";
		
		//user input
		String user;
		String password;
		
		do
		{
			System.out.println("Enter the username and password:");
			user = scan.next();
			password = scan.next();
			
			//check if the username and password are correct:
			
	       // break; //get out of the loop, can be used with while(true):
			
		}while (!user.equals(un) && password.equals(pass));
		
		//while(true) --> keep the loop always running
		
		//or if (user.equals(un) && password.equals(pass))
		System.out.println("Succesfully logged in!");
		
 
	}

}
