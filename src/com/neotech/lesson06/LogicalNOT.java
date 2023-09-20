package com.neotech.lesson06;

public class LogicalNOT {

	public static void main(String[] args) {
		
		
	
		//  ! (NOT) ----- it will reverse the value of a boolean variable

		boolean b1 = !true; //not true ---> false
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(!b2);
		
		//! can go in front of any boolean expression
		
		System.out.println(!(6 < 4));
		
		
		boolean cold = !true;
		
		if (!cold) 
		{
			System.out.println("Cold!");
		}
		
		int x = 12;
		
		if (x == 12) 
		{
			System.out.println("x is 12");
		}
		else 
		{
			System.out.println("x is not 12");
			
		}
		
		
		
		
		//combining ! with = ---> !=
		if (x != 12)
		{
			System.out.println("x is not 12");
		}
		
	}

}
