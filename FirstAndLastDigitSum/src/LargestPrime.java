public class LargestPrime {
	public static int getLargestPrime(int number) {
		if(number < 0) { // negative so return -1;
			return -1;
		}
		else {
			for(int i = number; i > 1; i--) {
				if(number % i == 0) {
					boolean prime = true;
					for(int x = 2; x < i; x++) {
						if(i % x == 0) {
							prime = false;
							break;
						}
					}
					if(prime) {
						return i; // no factors
					}
				}
			}
		}
		return -1;
	}
}
