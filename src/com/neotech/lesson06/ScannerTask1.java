package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		

		// ask the user to enter age
		// if age is from 1 to 3 --> you are a baby
		// if age from 4-5 --> you are a toddler
		// if age from 6-12 --> you are a kid
		// if age from 13-19 --> teenager
		// if age >= 20 --> you are an adult
		
		
	
		 Scanner merto = new Scanner(System.in);

	        System.out.print("Please enter your age: ");
	        int age = merto.nextInt();

	        if (age >= 1 && age <= 3) {
	            System.out.println("You are a baby."); // or result = "baby":
	        } else if (age >= 4 && age <= 5) {
	            System.out.println("You are a toddler.");
	        } else if (age >= 6 && age <= 12) {
	            System.out.println("You are a kid.");
	        } else if (age >= 13 && age <= 19) {
	            System.out.println("You are a teenager.");
	        } else if (age >= 20) {
	            System.out.println("You are an adult.");
	        } else {
	            System.out.println("Invalid age entered.");
	        }
		
		
		
		
		
		
		
		
	}

}
