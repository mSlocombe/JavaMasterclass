package com.javamasterclass;

public class Main {

    public static void main(String[] args) {

    	int result = 1 + 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		result = result - 1; // 3 - 1 = 2
		System.out.println("3 - 1 = " + result);
		System.out.println("previousResult = " + previousResult);

		result = result * 10; // 2 * 10 = 20
		System.out.println("2 * 10 = " + result);

		result = result / 5; // 20 / 5 = 4
		System.out.println("20 / 5 = " + result);

		result = result % 3; // 4 % 3 = 1;
		System.out.println("4 % 3 = " + result);

		// result = result + 1;
		result++; // 1 + 1 = 2
		System.out.println("1 + 1 = " + result);

		result--; // 2 - 1 = 1
		System.out.println("2 - 1 = " + result);

		//result = result + 2
		result += 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);

		//result = result * 10
		result *= 10; // 3 * 10 = 30
		System.out.println("3 * 10 = " + result);

		//result = result / 3
		result /= 3; // 30 / 3 = 10
		System.out.println("30 / 3 = " + result);

		//result = result - 2
		result -= 2; // 10 - 2 = 8
		System.out.println("10 - 2 = " + result);

		boolean isAlien = false;
		if(isAlien == false) {
			System.out.println("It is not an alien!");
			System.out.println("And I am scaled of aliens");
		}

		int topScore = 80;
		if(topScore < 100) {
			System.out.println("You got the high score!");
		}

		int secondTopScore = 95;
		if((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than secondTopScore and less than 100");
		}

		if((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}

		int newValue = 50;
		if (newValue == 50) {
			System.out.println("This is true");
		}

		boolean isCar = false;
		if(isCar) {
			System.out.println("Definitely a car");
		}

		isCar = true;
		boolean wasCar = isCar ? true : false;
		if(wasCar) {
			System.out.println("wasCar is true");
		}

		// 1. Create a double variable with a value of 20.00
		// 2. Create a second variable of type double wth the value 80.00
		// 3. Add both numbers together and multiply by 100.00
		// 4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00. We used the modulus or remainder operator on ints in the course, but we can also use it on a double.
    	// 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not zero.
		// 6. Output the boolean variable
		// 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true. Don't be surprised if you see output for this step, where you might expect it not to show. I'll explain it in my solution.

		double firstDouble = 20.00d;
		double secondDouble = 80.00d;
		firstDouble = (firstDouble + secondDouble) * 100.00d;
		firstDouble %= 40.00d;
		boolean challengeResult = firstDouble == 0;
		System.out.println("result: " + challengeResult);
		if(!challengeResult) {
			System.out.println("Got some remainder");
		}
    }
}
