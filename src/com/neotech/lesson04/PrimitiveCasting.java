package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//casting or converting
		
		// byte --> short --> int --> long --> float --> double
		
		double d1 = 3.7; // no casting happened
		System.out.println(d1);
		
		double d2 = 6;
		System.out.println(d2); // casting happened
		
		// widening, implicit casting, automatic
		int num = 5;
		double d3 = num;
		System.out.println(d3);
		
		
		//compiler error - Type mismatch: cannot convert from double to int
		//int num2 = 6.5;
		
		//narrowing, explicit casting, manually
		int num2 = (int) 6.5;// I tell Java, I want to store this here
		System.out.println(num2);
		
		
		byte b1 = (byte) 4560; //
		System.out.println(b1);
		
		System.out.println("----------------");
		
		
		int i2 = 65000;
		byte b2 = (byte) i2; // I might be losing data
		System.out.println(b2);
		
		//another example;
		
		long l1 = 17;
		int number = (int) l1; //am I losing data ?
		System.out.println(number);
		
		
		long l2= 54745674658468648L;
		int number2 = (int) l2; //am I losing data ?
		System.out.println(number2);
		
		
		//another widening example
		int number3 = 250;
		float f1 = number3; // I can write it, but it is still widening
		
		float f2 = number3; //Java handles this automatically
		
		System.out.println(f1);
		System.out.println(f2);
		
		
		
		//Create a int variable named number1, assign the value of 500.
		//Store/assign number1 into a byte name number2
		//Re-assign the number1 into number2.
		//Print the value of number2. Check if it is 500
		//What if the initial value was 50?
		
		int number1 = 500;
		byte number2 = (byte) number1;
		System.out.println(number2);
		
		int number3 = 50;
		byte number4 = (byte) number 3;
		System.out.println(number4);
		
		
		
		
		
	
		
		
		
	}

}
