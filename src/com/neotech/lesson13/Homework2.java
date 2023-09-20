package com.neotech.lesson13;

public class Homework2 {

	public static void main(String[] args) {
		/* 2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
			Then you program should print name of the students that has A and B grade
		*/	
			
		String [][] students = {
				{ "Omer", "Ahmet","Ismail", "Olga"},  //names
				{"A", "C", "A", "B"}                  //grades
		};
		
		//students.length ----> number of rows
		//for the number of columns in a row i
		//students[i].length
		for(int i = 0; i < students[1].length; i++)  //1 here is the grades length  //i represents column
		{
			//print name of the students that has A and B grade
			if(students[1][i].equals("A") || students[1][i].equals("B"))
			{	
				System.out.println(students[0][i] + " : " + students[1][i]);
		    }
		
	}

} }
