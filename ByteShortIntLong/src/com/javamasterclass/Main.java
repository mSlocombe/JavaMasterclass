package com.javamasterclass;

public class Main {

	public static void main(String[] args) {

		int myValue = 10000;

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;

		System.out.println("int min: " + myMinIntValue);
		System.out.println("int max: " + myMaxIntValue);

		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN value = " + (myMinIntValue - 1));

		int myMaxIntTest = 2_147_483_647;
	}
}