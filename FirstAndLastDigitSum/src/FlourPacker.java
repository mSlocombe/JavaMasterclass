public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		else {
			int total = 0;
			while(total < goal && (bigCount > 0 || smallCount > 0)) {
				if(bigCount > 0 && (total <= goal - 5)) { // got a big bag and we have enough space
					total += 5;
					bigCount--;
				}
				else if(smallCount > 0) { // got a small bag
					total += 1;
					smallCount--;
				}
				else { // no bags left
					break;
				}
			}
			return (total == goal);
		}
	}
}