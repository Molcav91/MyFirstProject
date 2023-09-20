package com.neotech.lesson09;

public class Task2 {

	public static void main(String[] args) {
		// // I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
		// but not 13th birthday, because we are scared
		// Let's use for loop
		
		for(int i = 11; i<=20; i++) {
			if(i==13 ) {    // or if(i!=13)
				continue;   // or  else {
			}System.out.println(i + " --> Happy Birthday !");
			}
		
		System.out.println("-----Same thing using While loop----");
		
		int age2 = 10;
		
		while (age2 < 20) {
			age2++;
			if (age2 == 13) {
				continue;
			}
			
			System.out.println("Happy birthday ! You are " + age2 + " years old!");
			
			
		}
		
		}
		
	
		
		}
		

	


