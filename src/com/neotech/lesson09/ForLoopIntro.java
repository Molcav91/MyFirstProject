package com.neotech.lesson09;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		
		// printing numbers from 1 to 10
		int num = 1;
		
		while (num <=10)
		{
			System.out.println(num);
			num++;
		}

		//when we know how many times we should iterate, for loop is the best option
		
		//3 important parts:
		//initialization; condition; increment
		for (int num2 = 1; num2 <=10; num2++)
		{
			System.out.println(num2);
		}
		
		//we cannot use num2 outside the for loop, since it is created inside for loop
		//system.out.println(num2);
		
	}

}
