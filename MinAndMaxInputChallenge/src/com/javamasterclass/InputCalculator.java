package com.javamasterclass;

import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int sum = 0;

		while(true) {
			if(scanner.hasNextInt()) {
				sum += scanner.nextInt();
				counter++;
			}
			else {
				break;
			}
			scanner.nextLine();
		}

		counter = counter > 0 ? counter : 1; // if we have no numbers, count as 0 / 1
		System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum / (double)counter));
		scanner.close();
	}
}
