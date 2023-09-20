package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		//Data Type - Identifier - Assignment Operator - value ;
		//Class Name -- Identifier - Assignment Op - new + Classname
		
		
		
		
		//Import shortcut: CTRL + SHIFT + O
		Scanner scanner = new Scanner (System.in);
		
		String text1, text2, text3;
		int age, year;
		double salary;
		boolean isRaining;
		char gender;
		/*
		//be careful when you ask for input. Sometimes you might 
		//not know that your code is expecting you to write something.
		System.out.println("Enter a sentence:");
		text1 = scanner.next();

		
		//difference between next() and nextLine();
		
		text1 = scanner.next();
		System.out.println(text2);
		text2 = scanner.nextLine();
		System.out.println(text3);
		
		
		 System.out.println("Enter your age: ");
		age = scanner.nextInt();
		System.out.println("Enter the current year: ");
		// year = scanner.nextInt();
	
		
		
		//remember the multiple line comment
		/*
		*
		*you can comment multiple lines by using:
		*Select the code and then CTRL + SHIFT + /
		*
	    */
		
		/*System.out.println("What is your salary:");
		salary = scanner.nextDouble();
		
		System.out.println("Is it raining today??");
		isRaining = scanner.nextBoolean();
		
		* System.out.println("Salary is " + salary + "and isRaining is" + isRaining);
*/
	
		/*System.out.println("Enter your gender (M or F) : ");
		 *gender = scanner.next().charAt(2); //method chaining
		*System.out.println(gender);
		*/
		
		//long way:
		 //get the whole word until space
		 //String str = scanner.next();
		 //get only the first character of the string
		 
		 System.out.println("Enter your name, age , salary and gender:");
		 text1 = scanner.next();
		 age = scanner.nextInt();
		 salary = scanner.nextDouble();
		 gender = scanner.next().charAt(0);
		 
		 System.out.println("Your info is: " + text1 + " " + age + " " + salary + " " + gender + "!");
		 
		 
		 
	}

}
