public class TeenNumberChecker {
	public static void main(String[] args) {
//		args = new String[5];
//		args[0] = "0";
//		args[1] = "1";
//		args[2] = "2";
//		String[] testArray = new String[5];
//		testArray[0] = "0";
//		System.out.println(testArray[0]);
//		System.out.println("Checking if " + args.toString() + " are teen number");
		for(String s : args) {
			try {
				if(isTeen(Integer.parseInt(s))) {
					System.out.println(s + " is a teen number");
				}
				else {
					System.out.println(s + " is not a teen number");
				}
			}
			catch(NumberFormatException nfe) {
				System.out.println(s + " is not a number");
			}
		}
	}

	public static boolean hasTeen(int a, int b, int c) {
		return (isTeen(a) && isTeen(b) && isTeen(c));
	}

	public static boolean isTeen(int a) {
		return (a > 12 && a < 20);
	}
}
