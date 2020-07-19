package com.javamasterclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberCount = 0;
		int numberTotal = 0;

		do {
			System.out.println("Enter number #" + (numberCount + 1) + ": ");
			if(scanner.hasNextInt()) {
				numberTotal += scanner.nextInt();
				numberCount++;
			}
			else {
				System.out.println("Invalid Number");
			}
			scanner.nextLine();
		} while(numberCount < 10);

		scanner.close();
		System.out.println(numberTotal);
    }
}
