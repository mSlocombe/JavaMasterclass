public class Main {

	public static void main(String[] args) {
		SpeedConverter speedConverter = new SpeedConverter();
		System.out.println(speedConverter.toMilesPerHour(1.5));
		System.out.println(speedConverter.toMilesPerHour(10.25));
		System.out.println(speedConverter.toMilesPerHour(-5.6));
		System.out.println(speedConverter.toMilesPerHour(25.42));
		System.out.println(speedConverter.toMilesPerHour(75.114));

		speedConverter.printConversion(1.5);
		speedConverter.printConversion(10.25);
		speedConverter.printConversion(-5.6);
		speedConverter.printConversion(25.42);
		speedConverter.printConversion(75.114);
	}
}
