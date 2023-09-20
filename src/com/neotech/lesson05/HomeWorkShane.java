package com.neotech.lesson05;

public class HomeWorkShane {

	public static void main(String[] args) {
		// Homework 1: 

 // Write a java program to check if a patient has allergies.
  //  If the patient does not have allergies print "You're healthy!".
   // If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy 
  //  and print a statement telling the patient 
   // "Don't eat ___". (fill the line with the food names – peanut, seafood etc.)

     boolean hasAllergy = false;
     boolean peanut = true;
     boolean lactose = false;
     boolean bee = false;
     boolean seafood = true;
     
     
     if (hasAllergy)
     {
    	 System.out.println("You have an allergy");
    	 
    	 if (peanut)
    	 {
    		 System.out.println("Don't eat peanuts!");
    	 }
    	 
    	 if (lactose) 
    	 {
    		 System.out.println("Don't drink milk!");
    	 }
    	 else 
    	 {
    		 System.out.println("You can drink milk!");
    	 }
    	 
    	 if (bee) 
    	 {
    		 System.out.println();
    	 }
    	 
    	 if (seafood) 
    	 {
    		 System.out.println();
    	 }
    	 
    	 
    	 
     }
     else 
     {
    	 System.out.println("You are healthy !");
     }	
		
		
		
	
 
		
		
		
		

	}

}
