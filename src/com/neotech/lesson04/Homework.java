package com.neotech.lesson04;

public class Homework {

	public static void main(String[] args) {
		
    double scale = 1.609344;
    double km, mile, km2, mile2;
    
    mile = 2;
    km = mile*scale;
    System.out.println(mile + " miles is " + km + " kilometers ");
		
    System.out.println("-----------------------");
		
    km2 = 60;
    mile2 = km2/scale;
    
    System.out.println(km2 + " kilometers is " + mile2 + " miles ");
		

	}

}
