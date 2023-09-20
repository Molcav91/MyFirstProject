package com.neotech.lesson05;

public class Task1 {

	public static void main(String[] args) {
		
		// * Write a program.
        // Create a variable day ( 1 - 7)
        // For every weekday, print
        // "Today is Monday and we are working."
        // For weekend, print
        // "We are on a break on Weekend."
		
		int day = 1;
		// 1. if day == 1 --> Today is Monday and we are working
		// 2. else if day == 2 --> Today is Tuesday and we are working
		// 3. else if day == 3 --> Today is Wednesday and we are working
		//.....
		
		if (day == 1) {
			System.out.println("Today is Monday and we are working");
		} else if (day == 2) {
			System.out.println("Today is Tuesday and we are working");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we are working");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we are working");
		} else if (day == 5) {
			System.out.println("Today is Friday and we are working");
		} else {
			System.out.println("We are on a break on weekend");
		}
		
		// lets modify the task
		// print if its weekday or weekend
		// [1-5] --> weekday
		// [6,7] --> weekend
		// else --> wrong input
		
		if (day >= 1 && day <= 5)  {
			System.out.println("Today is a weekday and we are working!");
		} else if (day < 8) {
			System.out.println("Today is a weekend we are working!");
		} else {
			System.out.println("Wrong input ! ");
		}
		
		
		
		
	}

}
