
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		/*
		 * if((x-y)<=0.001 || (x-y)>=0.001) { return false; }else return true;
		 */
		
		x = x * 1000;
	    y = y * 1000;

	    int x1 = (int)x;
	    int y1 = (int)y;

	    if (x1 == y1) {
	        return true;
	    }
	    else
	        return false;
		
	}

}
