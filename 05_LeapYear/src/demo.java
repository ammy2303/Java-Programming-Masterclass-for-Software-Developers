
public class demo {

	public static void main(String[] args) {
		
	}

	public static boolean isLeapYear(int year) {
		if(year<0 || year >9999) {
			return false;
		}else if(year%100==0) {
			if(year%400==0) {
				return true;
			} else return false;
		}else if(year%4==0) {
			return true;
		}else {
			return false;
		}
	}
	
}
