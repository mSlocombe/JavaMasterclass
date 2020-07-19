package com.javamasterclass;

public class Main {

    public static void main(String[] args) {
//		int value = 1;
//		if(value == 1) {
//			System.out.println("Value was 1");
//		}
//		else if(value == 2) {
//			System.out.println("Value was 2");
//		}
//		else {
//			System.out.println("Was not 1 or 2");
//		}
//
//		int switchValue = 1;
//		switch(switchValue) {
//			case 1:
//				System.out.println("Value was 1");
//				break;
//			case 2:
//				System.out.println("Value was 2");
//				break;
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("Value was 3, 4 or 5");
//				break;
//			default:
//				System.out.println("Defaulting, value was: " + switchValue);
//		}

		char testCharacter = 'C';
		switch(testCharacter) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
				System.out.println(testCharacter + " entered");
				break;
			default:
				System.out.println(testCharacter + " is not A, B, C, D or E");
		}

		String month = "January";
		switch(month.toLowerCase()) {
			case "january":
				System.out.println("Jan");
				break;
			case "august":
				System.out.println("Aug");
				break;
			default:
				System.out.println("Not sure");
				break;
		}
    }
}
