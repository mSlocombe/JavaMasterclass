public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		if(number < 0) {
			return -1;
		}

		int total = 0;
		while(number > 0) {
			int thisDigit = number % 10;
			if(thisDigit % 2 == 0) {
				total += thisDigit;
			}
			number /= 10;
		}
		return total;
	}
}
