public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			long years, days;
			long hours = minutes / 60;
			days = hours / 24;
			years = days / 365;
			days %= 365;
			System.out.println(minutes + " min = " + years + " y and " + days + "d");
		}
	}
}
