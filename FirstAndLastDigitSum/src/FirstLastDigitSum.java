public class FirstLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {
		if(number < 0) {
			return -1;
		}

		int firstDigit = number < 10 ? number : number / 10;
		while(firstDigit >= 10) {
			firstDigit /= 10;
		}

		int lastDigit = number % 10;

		return firstDigit + lastDigit;
	}
}
