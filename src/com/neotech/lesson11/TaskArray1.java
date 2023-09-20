package com.neotech.lesson11;

public class TaskArray1 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */

		char character [] = new char [6];
		character [0] = 'A';
		character [1] = 'B';
		character [2] = 'C';
		character [3] = 'D';
		character [4] = 'E';
		character [5] = 'F';
		
		
		System.out.println(character[1]);
		
		
		char [] grades2 = { 'A', 'B', 'C', 'D', 'E', 'F' };
		grades2 [0] = 'A';
		grades2 [1] = 'B';
		grades2 [2] = 'C';
		grades2 [3] = 'D';
		grades2 [4] = 'E';
		grades2 [5] = 'F';
		
		
		System.out.println(grades2[1]);
	}

}
