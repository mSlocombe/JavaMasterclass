public class SharedDigit {
	public static boolean hasSharedDigit(int first, int second) {
		if(first >= 10 && first <= 99 && second >= 10 && second <= 99) {
			int firstTens = first / 10;
			int firstUnits = first % 10;
			int secondTens = second / 10;
			int secondUnits = second % 10;

			return (firstTens == secondTens ||
			firstTens == secondUnits ||
			firstUnits == secondTens ||
			firstUnits == secondUnits);
		}

		return false;
	}
}
