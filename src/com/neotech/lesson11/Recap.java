package com.neotech.lesson11;

public class Recap {

	public static void main(String[] args) {
		
	   
		int [] grades = new int [5];
		
		System.out.println("The size of the array is --> " + grades.length);
		System.out.println("Grade with index 2 is --> " + grades[2]);
		
		
		//grades   0  1  2  3  4
		//        [0, 0, 0, 0, 0]
		
		grades [3] = 85; // assigning value 85 to the 4th element
		
		//grades   0  1  2  3  4
		//        [0, 0, 0, 85,0]
		grades[1] = 90;
		//grades   0  1  2  3  4
		//        [0, 90,0, 85,0]
		
		//grades [5] = 100; //run-time error
		//grades[2] = "three"; //compile-time error
		
		grades [2] = 100;
		//grades   0  1  2  3  4
		//        [0, 90,100, 85,0]
		
		grades [4] = 98;
		//grades   0  1  2  3  4
		//        [0, 90,0, 85,98]
		
		grades [0] = 93;
		//grades   0   1   2   3   4
		//        [93, 90,100, 85, 98]
		
		//re-assign a value to the first element (element at index 0)
		grades [0] = 95;
		
		System.out.println("-----Find the average of the grades-----");
		
		//1st way:
		int total = grades[0] + grades [1] + grades [2] + grades [3] + grades [4];
		System.out.println("The total is: " + total);
		
		int average = total/5;
		System.out.println("The average is: " + average);
		
		System.out.println("----");
		
		
		//2nd way - using for loop
		int sum = 0;
		for (int i=0; i < grades.length; i++) 
		{
			//loop 1: sum --> grades [0]
			//loop 2: sum --> grades [0] + grades [1]
			//loop 2: sum --> grades [0] + grades [1] + grades [2]
			
			//i goes from 0 to 5
			//sum = sum + grades[i]
			sum += grades[i];
			
			
		}
		
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + (sum/grades.length));
		
		System.out.println("--------------------");
		
		String [] cities = {"Tirana", "Ankara", "Paris", "Rome", "Bern","Oslo"};
 		
		//what is the size of this array ?
		System.out.println("The length is: " + cities.length) ;
		
		//how can I print the last city?
		int length = cities.length;
		System.out.println("The last city in the array is: " + cities[cities.length-1]);
		
		//how would I print all the cities?
		
		for (int i = 0; i < length; i++) 
		{
			System.out.println(cities[i]);
		}
		
		System.out.println("Let us print the cities in reverse order");
		
		for (int i = cities.length-1; i >=0; i--) 
		{
			System.out.println(cities[i]);
		}
		
		
		// cities[6] = "Berlin"; //still cannot do this -Array size is FIXED
		
		
		
		
		
		
		
		
		
		
	}

}
