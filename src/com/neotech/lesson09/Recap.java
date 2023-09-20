package com.neotech.lesson09;

public class Recap {
	

public static void main (String[] args) {


	// print Good Morning 5 times?
	// Important information:
	// how many times this should happen ?
	// what is the starting point and ending point ?
	// increment (variable change)
	
	
	int count = 9;
	while (count <= 5) 
	{
		System.out.println(count + "Good Morning");
		
	//	count = count +1; //long way
	// count += 1; //shorthand op
		count++; //increment
	}
	
	
	System.out.println("================================");
	
	
	// using do-while                        // do this and check the condition
	int num = 9;
	do {
		System.out.println("Good morning");
		num++;
	} while (num <= 5);
	
	System.out.println("===============================");
	
	System.out.println("Using While Loop");
	
	int m = 10;
	while (m <=5) //boolean condition
	{
		System.out.println("Today is a great day to code!");
		m++;
	}
	
	System.out.println("Using Do-While Loop");
	
	int n = 10;
	do
	{
		System.out.println("Today is a great day to code!");
		n++;
	}while (n <= 5);
	
	
	
	}

}
