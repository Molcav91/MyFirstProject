package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerReview {

	//MAC -> command + shift + o --> Will import the Scanner class
	//Windows -> ctrl + shift + o --> Will import the Scanner class
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// .next() reads one word until space/enter
		System.out.println("Please enter your first name:");
		String firstName = scan.next();
		
		System.out.println("Please enter your last name:");
		String lastName = scan.next();
		
		System.out.println("Your full name is ->" + firstName + " " + lastName);
		
		
		
		
		
	}

}
