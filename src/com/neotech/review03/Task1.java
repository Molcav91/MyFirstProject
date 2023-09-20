package com.neotech.review03;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// // Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers from the array

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("How many numbers do you want to store in the array? ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size]; // Create an array of the specified size

	        System.out.println("Enter the numbers:");

	        // Read the numbers from the user and store them in the array
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        System.out.println("Numbers from the array:");

	        // Print the numbers from the array
	        for (int i = 0; i < size; i++) {
	            System.out.println(numbers[i]);
	        }
		
	}

}
