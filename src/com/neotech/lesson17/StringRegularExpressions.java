package com.neotech.lesson17;

public class StringRegularExpressions {

	public static void main(String[] args) {
		
		
	String greeting = "Good Eveing";
	
	//replace()
	String newGreeting = greeting.replace('E', 'e');	
    System.out.println(newGreeting);
    
    String otherGreeting = greeting.replace("Evening", "Afternoon");
	System.out.println(otherGreeting);
    
    //can I do this: greeting.replace('G', 'g') ('E', 'e')
	String replaceMultiple = greeting.replace('G', 'g').replace('E', 'e');
	System.out.println(replaceMultiple);
	
	//replaceAll()
	String combination = "My phone # is 345-678-0910";
	
	String combination2 = combination.replaceAll("[0-9]", "*");
	
	String combination3 = combination.replaceAll("[a-z]", "+");
	System.out.println(combination3);
	
	String combination4 = combination.replaceAll("[A-Z]", "+");
	System.out.println(combination4);
	
	String combination5 = combination.replaceAll("[A-zA-Z]", "+");
	System.out.println(combination5);
	
	}
	

}
