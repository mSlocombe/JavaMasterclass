public class NumberToWords {
	public static void numberToWords(int number) {
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		else {
			int digitCount = getDigitCount(number);
			number = reverse(number);
			for(int i = 0; i < digitCount; i++) {
				int testCase = number % 10;
				number /= 10;
				switch(testCase) {
					case 0:
						System.out.println("Zero");
						break;
					case 1:
						System.out.println("One");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3:
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5:
						System.out.println("Five");
						break;
					case 6:
						System.out.println("Six");
						break;
					case 7:
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9:
						System.out.println("Nine");
						break;
				}
			}
		}
	}

	public static int reverse(int number) {
		int newNumber = 0;
		while(number != 0) {
			newNumber *= 10;
			newNumber += number % 10;
			number /= 10;
		}
		return newNumber;
	}

	public static int getDigitCount(int number) {
		if(number < 0) { // negative number
			return -1;
		}
		int numberCount = 0;
		if(number < 10) { // single digit positive number
			numberCount = 1;
		}
		else { // multi digit positive number
			while (number > 0) {
				numberCount++;
				number /= 10;
			}
		}
		return numberCount;
	}
}
