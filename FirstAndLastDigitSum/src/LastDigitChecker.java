public class LastDigitChecker {

	public static boolean hasSameLastDigit(int a, int b, int c) {
		if(isValid(a) && isValid(b) && isValid(c)) {
			a %= a;
			b %= b;
			c %= c;
			return a == b || a == c || b == c;
		}
		else {
			return false;
		}
	}

	public static boolean isValid(int number) {
		return (number >= 10 && number <= 1000);
	}
}
