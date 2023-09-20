package com.neotech.lesson03;

public class CircleAndMile {

	public static void main(String[] args) {
		
		double r, pi ;
		
		r=5;
		pi=3;
		
		// Area of a circle = x
		
		double x = pi * (r*r);
		
		System.out.println("Area of a circle = " + x);
		
		// Perimeter of a circle = y
		
		double y = 2 * (pi*r);
		
		System.out.println("Perimeter of a circle = " + y);
		
		System.out.println(" ------------------ ");
		
		double mile = 1.609344;
		
		double kilometer = 0.621371;
		
		double MileToKm = 10 * mile;
		
		
		System.out.println("10 miles = " + MileToKm + " kilometers");
		
		double KmToMile = 5 * kilometer;
		
		System.out.println("5 kilometers = " + KmToMile + " miles");
		
		
		
		
		
		
		
		
		

	}

}
