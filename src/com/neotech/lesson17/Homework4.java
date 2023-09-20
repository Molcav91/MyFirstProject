package com.neotech.lesson17;

public class Homework4 {

	public static void main(String[] args) {
		/*  You have a 
		String a="Is it saturday? 
				Is it raining? Do we have a Java Class today?" 
				
				How would you find out how many sentences are in that String?
		*/		
		
		 String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
	        int sentenceCount = countSentences(a);
	        System.out.println("Number of sentences: " + sentenceCount);
	    }

	    public static int countSentences(String text) {
	        String[] sentences = text.split("[.!?]+");
	        return sentences.length;
	        
	        
	        
	    }
	
		
		
		
		
		
	}


