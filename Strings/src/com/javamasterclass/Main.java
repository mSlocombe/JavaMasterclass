package com.javamasterclass;

public class Main {

    public static void main(String[] args) {

    	// NOTE: Strings are immutable (cannot be changed) making this code inefficient and not the norm.

		String myString = "This is a string";
		System.out.println("MyString: " + myString);
		myString = myString + ", and this is more.";
		System.out.println("MyString: " + myString);
		myString = myString + " \u00A9 2020";
		System.out.println("MyString: " + myString);
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);

		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("lastString: " + lastString);
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("lastString: " + lastString);
    }
}
