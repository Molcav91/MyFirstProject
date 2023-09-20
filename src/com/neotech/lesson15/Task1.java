package com.neotech.lesson15;

public class Task1 {

	
		/*
		 * method1: Create a method that will take 2 parameters as numbers and prints
		 * which number is larger.
		 *
		 * method2: Create a method that will take a number and
		 * prints whether the number is even or odd.
		 *
		 * method3: Create a method that will say Hello in a different
		 * language based on the country that will passed when method is executed.
		 */
		
		//minimalistic method:
		// 1. return type (void)
		// 2. in this case, two int parameters
		// 3. name
	
	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else if (b>a) {
		System.out.println(b + " is larger than " + a);
	} else {
		System.out.println("Numbers are equal");
	}
	}
	
	void evenOrOdd (int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even!");
		} else {
			System.out.println(num + " is odd!");
		}
	}
	
	void sayHello (String country) {
		switch (country) {
		case "US":
			System.out.println("Hello!");
			break;
		case "Turkiye":
			System.out.println("Merhaba!");
			break;
		case "Albania":
		case "Kosova" :
			System.out.println("Ckemi!");
		case "Mexico":
			System.out.println("Hello!");
			break;
			
			default:
				System.out.println("I don't know how to say hello for " + country);
		}
	}
	
	
	
		public static void main(String[] args) {
			Task1 t = new Task1();
			
			t.larger(5, 3);
			t.evenOrOdd(8);
			t.sayHello("Turkiye");
			t.sayHello("US");
			t.sayHello("Mexico");
			t.sayHello("Albania");
			t.sayHello("China");
	}

}
