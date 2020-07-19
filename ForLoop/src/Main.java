public class Main {
	public static void main(String[] args) {
//		System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
//		System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
//		System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4));
//		System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5));

		for(int i = 2; i < 9; i++) {
			System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000, i));
		}

		for(int i = 8; i > 1; i--) {
			System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000, i));
		}

		int primeNumbersFound = 0;
		for(int i = 0; i < 10000; i++) {
			if(isPrime(i)) {
				primeNumbersFound++;
				System.out.println(i + " is a prime number");
				System.out.println("Prime numbers found: " + primeNumbersFound);
				if(primeNumbersFound == 10) {
					System.out.println("Found 3, exit");
					break;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}

		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount*(interestRate/100));
	}
}
