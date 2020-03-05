
public class demo {

	public static void main(String[] args) {
		
	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		int gcd = 1;
		if(first <10 || second < 10) {
			return -1;
		}
		
		
//		int remainder = 0;
		if(first < second) {
			for(int i = 0; i< first; i++) {
				if (second % i == 0) {
					gcd = i;
				}
			}
		}else if(first > second) {
			for(int i = 0; i< second; i++) {
				if (first % i == 0) {
					gcd = i;
				}
			}
		}
		
		return gcd;
	}
	
}
