package com.neotech.lesson11;

public class Task1Sat {

	public static void main(String[] args) {
	
		//Create an array on integers and calculate the sum of all elements in an array.
		  int[] array = {3, 5, 7, 9, 11}; 

	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }

	        System.out.println("The sum of all elements in the array is: " + sum);
	   
	        {
	}
	System.out.println("-----------");
	        
	  //Create an array of countries. While retrieving all values from an array print capital for each country.      
	 String[] countries = {"USA", "Canada", "Germany", "France"};
     String[] capitals = {"Washington D.C.", "Ottawa", "Berlin", "Paris"};

     for (int i = 0; i < countries.length; i++) {
         System.out.println("Capital of " + countries[i] + " is " + capitals[i]);
         
         //or
        /* String[] countries = {"USA", "Canada", "Germany", "France"};

         for (String country : countries) {
             if (country.equals("USA")) {
                 System.out.println("Capital of USA is Washington D.C.");
             } else if (country.equals("Canada")) {
                 System.out.println("Capital of Canada is Ottawa");
             } else if (country.equals("Germany")) {
                 System.out.println("Capital of Germany is Berlin");
             } else if (country.equals("France")) {
                 System.out.println("Capital of France is Paris");
             } else {
                 System.out.println("Capital not found for " + country);
             }
         }
         */
     }
	}
		
		
		
		
		
		
		
	

}
