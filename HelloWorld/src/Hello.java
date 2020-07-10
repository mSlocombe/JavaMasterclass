public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Matt!");

		int myFirstNumber = (10 + 5) + (2 * 10);
		int mySecondNumber = 12;
		int myThirdNumber = myFirstNumber * 2;
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		System.out.println("myTotal = " + myTotal);

		int myLastOne = 1000 - myTotal;
		System.out.println("1000 - " + myTotal + " = " + myLastOne);
	}
}