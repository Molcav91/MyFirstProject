package com.neotech.lesson09;

public class Task4 {

	public static void main(String[] args) {
		// Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 20
		// Using for loop
		
		    int evenSum = 0;
	        int oddSum = 0;
	        int totalSum = 0;

	        for (int i = 1; i <= 20; i++) {
	            totalSum += i;

	            if (i % 2 == 0) {   // even
	                evenSum += i;
	            } else {            // odd
	                oddSum += i;
	            }
	        }

	        System.out.println("Sum of even numbers: " + evenSum);
	        System.out.println("Sum of odd numbers: " + oddSum);
	        System.out.println("Sum of all numbers: " + totalSum);
		
		
		
		
		
	}

}
