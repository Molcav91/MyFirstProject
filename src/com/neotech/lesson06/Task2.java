package com.neotech.lesson06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Write a program that asks user to enter two numbers and prints which one is larger

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if ( num1 > num2 ) 
		{
			System.out.println(num1 + " is larger than " + num2);
		} else if ( num1 < num2 ) 
		{
			System.out.println(num2 + " is larger than " + num1);
		} else 
		{
			System.out.println(num1 + " is equal to " + num2);
		}
		
		
		
	}

}
