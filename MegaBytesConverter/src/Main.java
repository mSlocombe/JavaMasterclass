public class Main {

	public static void main(String[] args) {
		MegaBytesConverter mbc = new MegaBytesConverter();
		mbc.printMegaBytesAndKiloBytes(2500);
		mbc.printMegaBytesAndKiloBytes(-1024);
		mbc.printMegaBytesAndKiloBytes(5000);
	}
}
