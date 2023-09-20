package com.neotech.lesson09;

import java.util.Scanner;

public class Homework0801 {

	public static void main(String[] args) {
		// 2. Write a program that asks user to enter his/her username and password 
		// until user enters them correctly.
		
		 String correctUsername = "merto";
	        String correctPassword = "dchallenger91";

	        Scanner scanner = new Scanner(System.in);

	        boolean isAuthenticated = false;

	        while (!isAuthenticated) {
	            System.out.print("Enter username: ");
	            String username = scanner.nextLine();

	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();

	            if (username.equals(correctUsername) && password.equals(correctPassword)) {
	                System.out.println("Authentication successful!");
	                isAuthenticated = true;
	            } else {
	                System.out.println("Incorrect username or password. Please try again.");
	            }
	        }

	        scanner.close();
		
		
		
		
		
		
		
		
	}

}
