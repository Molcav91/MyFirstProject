package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	public static void main(String[] args) {
		/*
		 * * 3. Create a Java program that will ask user to input city
		 * and temperature.
		 * Your program should convert Fahrenheit into celsius amd
		 * print "The temperature in the city __ is __"
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String city;
		double f, c;
		
		System.out.println("Please enter the city and the temperature: ");
		city = scan.next();
		f = scan.nextDouble();
		
		c = (f-32)*5/9;
		
		System.out.println("The temperature in " + city + " is " + c + " degree celcius! ");
		
		
	}

}
