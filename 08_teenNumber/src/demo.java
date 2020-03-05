
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean hasTeen(int x1, int x2, int x3) {
		if((x1 >= 13 && x1 <= 19)||(x2 >= 13 && x2 <= 19)||(x3 >= 13 && x3 <= 19)) {
			return true;
		}
		else {
			return false;
		}
	} 
	public static boolean isTeen(int x1) {
		if(x1 >= 13 && x1 <= 19) {
			return true;
		}
		else {
			return false;
		}
	} 
	
}
