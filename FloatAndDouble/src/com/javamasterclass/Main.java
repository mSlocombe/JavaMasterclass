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

		int myIntValue = 5;
		float myFloatValue = 5.25f; // without f assumes double; could also be (float)5.25 but this isn't common.
		double myDoubleValue = 5.25d;
    }
}
