public class Main {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				count++;
				int newTotal = total + i;
				System.out.println(total + " + " + i + " = " + newTotal);
				total = newTotal;
				if(count == 5) {
					break;
				}
			}
		}
		System.out.println("Totalling: " + total);
	}
}
