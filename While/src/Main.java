public class Main {
	public static void main(String[] args) {
		int upperLimit = 10;
		int count = 0;
		for (int number = 0; number <= upperLimit; number++) {
			if (isEvenNumber(number)) {
				System.out.println("for loop " + number + " is even");
				count++;
			}
			if(count == 5) {
				break;
			}
		}

		int number = 0;
		count = 0;
		while (number <= upperLimit) {
			if (isEvenNumber(number)) {
				System.out.println("while loop " + number + " is even");
				count++;
			}
			number++;
			if(count == 5) {
				break;
			}
		}

		number = 0;
		count = 0;
		do {
			if (isEvenNumber(number)) {
				System.out.println("do while " + number + " is even");
				count++;
			}
			number++;
			if(count == 5) {
				break;
			}
		} while (number <= upperLimit);
	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
}
