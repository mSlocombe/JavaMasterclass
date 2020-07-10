package com.javamasterclass;

public class Main {

    public static void main(String[] args) {
		byte myByte = 10;
		short myShort = 10;
		int myInt = 10;

		long myLong = 50000 + ((myByte + myShort + myInt) * 10);
		System.out.println(myLong);
    }
}
