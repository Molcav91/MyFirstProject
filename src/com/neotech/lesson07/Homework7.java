package com.neotech.lesson07;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String grade;
		
		System.out.println("Please enter your grade");
		grade = scanner.next();
		
		if (grade.equals("A")) {
			System.out.println("Your grade A is Excellent");
		} else if (grade.equals("B")) {
		    System.out.println("Your grade B is Good");
		} else if (grade.equals("C")) {
			System.out.println("Your grade C is Average");
		} else if (grade.equals("D")) {
			System.out.println("Your grade D is Bad");
		} else {
			System.out.println("Not Aceeptable");
		}
		
		
		switch (grade) {
		case "A":
			System.out.println("Your grade A is Excellent");
		    break;
		case "B":
			System.out.println("Your grade B is Good");
		    break;    
		case "C":
			System.out.println("Your grade C is Average");
		    break; 
		case "D":
			System.out.println("Your grade D is Bad");
		    break; 
		default:   
			System.out.println("Not Acceptable");
			 break; 
			 
		
		
		
		
		
		
		
		}
		
		
	}

}
