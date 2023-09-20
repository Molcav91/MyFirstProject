package com.neotech.lesson09;

import java.util.Scanner;

public class Homework0902 {

	public static void main(String[] args) {
		//Write a program that asks user to enter his/her username and password 
		//until user enters them correctly.

		String username, password;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your username: ");
		username = input.next();
		
		System.out.println("Please enter your password: ");
		password = input.next();
		
		while (!username.equals("666omen") || !password.equals("endofdays")) 
		{
			System.out.println("Wrong username or password, try again please !");
			System.out.println("Please enter your username: ");
			username = input.next();
			System.out.println("Please enter your password: ");
			password = input.next();
			
		} if (username.equals("666omen") && password.equals("endofdays") )
			
		{
			System.out.println("Welcome, you are logged in  !");
			
		} else {
			System.out.println("Invalid username or password");
		}
		
	}

}
