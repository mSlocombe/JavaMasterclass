package com.javamasterclass;

public class Main {

    public static void main(String[] args) {

    	float myMinFloatValue = Float.MIN_VALUE;
    	float myMaxFloatValue = Float.MAX_VALUE;

		System.out.println("Float min: " + myMinFloatValue);
		System.out.println("Float max: " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;

		System.out.println("Double min: " + myMinDoubleValue);
		System.out.println("Double max: " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f; // without f assumes double; could also be (float)5.25 but this isn't common.
		double myDoubleValue = 5.0 / 3.0;

		System.out.println("myIntValue: " + myIntValue);
		System.out.println("myFloatValue: " + myFloatValue);
		System.out.println("myDoubleValue: " + myDoubleValue);

		// 1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
		// 2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable.
		// 3. Print out the result

		double pounds = 200d;
		double kilograms = pounds * 0.45359237d;

		System.out.println(pounds + "lbs is " + kilograms + "kg");

		double pi = Math.PI;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(anotherNumber);
    }
}
