package com.neotech.lesson11;

public class Task2Sat {

	public static void main(String[] args) {
		// Find the largest number in array (1D)
		int [] numbers = {23, 56, -75, 16, 80, 70, -40};

		  int largestNumber = numbers[0]; // Assume the first element is the largest

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > largestNumber) {
	                largestNumber = numbers[i];
	            }
	        }

	        System.out.println("The largest number in the array is: " + largestNumber);
		
		//or
	        
	        /*//let us assume the largest number is the first number in the array
	         * int largest = numbers [0];
	         */ //loop through all numbers, to compare with my current largest number
	         
		
		
		
		
		
	}

}
