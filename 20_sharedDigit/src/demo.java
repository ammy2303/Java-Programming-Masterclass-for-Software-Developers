
public class demo {

	public static void main(String[] args) {
		
	}
	
	public static boolean hassharedDigit(int num1, int num2) {
		if(num1 <10 || num2 < 10 || num1 > 100 || num2 > 100){
			return false;
		}
		int a , b, c, d;
		a = num1 % 10;
		b = num1 / 10;
		
		c = num2 % 10;
		d = num2 / 10;
		
		if((a==c)||(a==d)||(b==c)||(b==d)) {
			return true;
		}else
			return false;
		
	}
	
}
