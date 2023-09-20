package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {
		// aka shorthand operator
		
		int num = 100; //store 100 in this container
		
		num = num + 100; //add 100 to the value inside the container
		
		System.out.println(num);
		
		num = num + 150;
		
		System.out.println(num);
		
		//we call this cmpound/shorthand operator
		num += 50; // exactly the same as num = num + 50;
		// long way: num = num + 50
		
		System.out.println(num);
		
	//	num = num - 10; //how can I do this with shorthand ?
		num -= 10;
		System.out.println(num);
		
		num /= 30; // num = num/30
		System.out.println(num);
		
		//num = num * 6
		num *= 6;
		System.out.println(num);
		
		num %= 7; //num = num%7
		System.out.println(num);
		
		
		
		
		
		
	}

}
