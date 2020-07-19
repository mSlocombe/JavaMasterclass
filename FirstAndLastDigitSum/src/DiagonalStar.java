public class DiagonalStar {
	public static void printSquareStar(int number) {
		if(number < 5) {
			System.out.println("Invalid Value");
		}
		else {
			for(int row = 1; row <= number; row++) {
				String line = "";
				for(int col = 1; col <= number; col++) {
					if(col == 1 || col == number || row == 1 || row == number) {
						line += "*";
					}
					else if(col == row) {
						line += "*";
					}
					else if(col == (number - row + 1)) {
						line += "*";
					}
					else {
						line += " ";
					}
				}
				System.out.println(line);
			}



			System.out.println();
			for(int y = 0; y < number; y++) {
				String line = "";
				for(int x = 0; x < number; x++) {
					if(y == 0 || y == (number - 1) || x == 0 || x == (number - 1)) {
						line += "*";
					}
					else if(x == y) {
						line += "*";
					}
					else if(x == (number - y - 1)) {
						line += "*";
					}
					else {
						line += " ";
					}
				}
				System.out.println(line);
			}

		}
	}
}