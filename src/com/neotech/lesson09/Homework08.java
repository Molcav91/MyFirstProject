package com.neotech.lesson09;

public class Homework08 {

	public static void main(String[] args) {
		// 1. Write a program using while loop that calculates 
		// the sum of the even numbers between 0 and 10.

		   int number = 0;  // Starting number
	        int sum = 0;     // Variable to store the sum
	        
	        while (number <= 10) {
	            if (number % 2 == 0) {
	                sum += number;  // Add the even number to the sum
	            }
	            number++;  // Increment the number
	        }
	        
	        System.out.println("Sum of even numbers between 0 and 10: " + sum);
	    }
		
		
		
		
	}


