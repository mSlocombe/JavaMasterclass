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

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;

		System.out.println("byte MIN_VALUE: " + myMinByteValue);
		System.out.println("byte MAX_VALUE: " + myMaxByteValue);

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;

		System.out.println("short MIN_VALUE: " + myMinShortValue);
		System.out.println("short MAX_VALUE: " + myMaxShortValue);

		long myLongValue = 100;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;

		System.out.println("long MIN_VALUE: " + myMinLongValue);
		System.out.println("long MAX_VALUE: " + myMaxLongValue);
		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);

		short bigShortLiteralValue = 32767;

	}
}
