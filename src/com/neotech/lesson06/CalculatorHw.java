package com.neotech.lesson06;

import java.util.Scanner;

public class CalculatorHw {
	
	// Ask the user to enter 2 numbers
	// Ask the user for the operator (+,-,*,/)
	// Solve it using if-else
	
	

	public static void main(String[] args) {
		
		  Scanner mert = new Scanner(System.in);

	        System.out.print("Please enter the first number: ");
	        double firstNumber = mert.nextDouble();

	        System.out.print("Please enter the second number: ");
	        double secondNumber = mert.nextDouble();

	        System.out.print("Please enter the operator (+, -, *, /): ");
	        char operator = mert.next().charAt(0);

	 double result = 0;

	        if (operator == '+') {
	            result = firstNumber + secondNumber;
	        } else if (operator == '-') {
	            result = firstNumber - secondNumber;
	        } else if (operator == '*') {
	            result = firstNumber * secondNumber;
	        } else if (operator == '/') {
	            result = firstNumber / secondNumber;
	        } else {
	            System.out.println("Invalid operator!");
	            return;
	        }

	        
	        
	        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals ("%") ){
	        System.out.println("The result is: " + result);
	        }
	        
		
		
		
		
		
		
		
		
		
	}

} 
