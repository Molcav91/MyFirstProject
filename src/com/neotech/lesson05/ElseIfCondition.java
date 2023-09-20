package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
	double d1 = 15.5;
	double d2 = 15.2;
		
	// 3 conditions:
	// d1 > d2 --> d2 < d1
	// d1 == d2
	// d1 < d2
	
	if (d1 > d2) {
		System.out.println("Number " + d1 + " is greater than " + d2);
	}
	else if (d1 < d2) {
		System.out.println("Number " + d1 + " is less than " + d2);
	}
	else {
		System.out.println("Number " + d1 + " is equal to " + d2);
	}
	
	int a = 5;
	int b = 7;
	// 3 conditions:
	// a > b
	// a < b
	// a == b
	
	if (a == b) { 
		System.out.println("Number " + a + " is equal to + + b)");
	}
	else if (a < b) {
		System.out.println("Number " + a + " is less than " + b);
	}
	else 
	{ // a > b
		System.out.println("Number " + a + " is larger than + + b");
	}
	
	
	
	
	}

}
