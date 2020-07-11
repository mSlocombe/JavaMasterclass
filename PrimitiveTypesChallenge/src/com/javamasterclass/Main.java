package com.javamasterclass;

public class Main {

    public static void main(String[] args) {
		byte myByte = 10;
		short myShort = 10;
		int myInt = 10;

		long myLong = 50000L + ((myByte + myShort + myInt) * 10L);
		System.out.println(myLong);

		short shortTotal = (short)(10000 + 10 * (myByte + myShort + myInt));
    }
}