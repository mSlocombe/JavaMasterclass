package com.javamasterclass;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//
//		while(true) {
//			System.out.println("Enter number: ");
//			if(scanner.hasNextInt()) {
//				int thisNumber = scanner.nextInt();
//					if (thisNumber < min) {
//						min = thisNumber;
//					}
//					if (thisNumber > max) {
//						max = thisNumber;
//					}
//			}
//			else {
//				break;
//			}
//			scanner.nextLine();
//		}
//
//		System.out.println("Min: " + min + ", Max: " + max);

//		InputCalculator.inputThenPrintSumAndAverage();

		System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
		System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
		System.out.println();
		System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
		System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
		System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
		System.out.println();
		System.out.println(PaintJob.getBucketCount(3.4, 1.5));
		System.out.println(PaintJob.getBucketCount(6.26, 2.2));
		System.out.println(PaintJob.getBucketCount(3.26, 0.75));
    }
}
