public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		// example number 1221
		if(number > -10 && number < 10) { // single digit number
			return true;
		}

		int placeholder = number;
		int comparison = 0;


		while(placeholder != 0) { // 1221 -> 122 -> 12 -> 1 -> 0
			comparison = (comparison * 10) + placeholder % 10; // 1
			placeholder /= 10; // 1221 -> 122 -> 12 -> 1 -> 0
		}

		return (number == comparison);
	}
}
