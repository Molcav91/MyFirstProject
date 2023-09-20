package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		int time = 8;
		
		if (time < 9) {
			System.out.println("Good evening!");
		} 
		
		while (time < 12) {
			System.out.println(time);
			
			time++;
			
			// time = time +2;
			// time += 2;
			
		}
		
           //how can i print numbers between 20 and 30
		System.out.println("Numbers between 20 and 30");
		int a = 20;
		while(a < 30) {
			System.out.println(a);
			a++;
		}
		
		//how can I print numbers from 10 to 1
		int x = 10;
		while (x >=1) {
			System.out.println(x);
			x--;
		}
		//How can I print only even numbers from 50 to 1?
		   
		int number = 50;
	        while (number >= 1) {
	            if (number % 2 == 0) {    // mod operator  // even number check
	                System.out.println(number);
	            number--; 
	            
	           // or
	         
	            // int x = 50;
	            // while (x >= 1) {
	           // System.out.println((x + " "));
	           // x -= 2;
	            
	        }
	        }
		
		
		
		
	}

}
