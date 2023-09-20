package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		
		Phone iPhone = new Phone ();

		iPhone.brand = "Apple";
		iPhone.color = "Red";
		iPhone.model = "14 Pro";
		iPhone.price = 2000;
		
		
		iPhone.call();
		iPhone.text();
		iPhone.navigate();
		
		Phone android = new Phone ();

		android.brand = "Apple";
		android.color = "Red";
		android.model = "14 Pro";
		android.price = 500;
		
		
		android.call();
		android.text();
		android.navigate();
		
		
		
		
		
		
		
		
		
		
		
	}

}
