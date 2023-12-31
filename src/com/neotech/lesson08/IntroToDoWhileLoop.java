package com.neotech.lesson08;

public class IntroToDoWhileLoop {

	public static void main(String[] args) {
		
		
		// while loop;
		// check condition
		// if the condition is false, do not check again
		// otherwise, keep executing until it becomes false
    int num1 = 5;
    while (num1 >= 15) {
    	System.out.println(num1 + " ");
    	num1++;
    }
		
    // Do While loop;
    // first execute the body once
    // then check for the condition
    // if the condition is false, do not run anymore
    // otherwise, execute until the condition becomes false
    int num2 = 5;
    do {
    	System.out.println(num2 + " ");
    	num2++;
    }while(num2 >= 15);
   
	}

}
