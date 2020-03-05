
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if(num1 <10 || num2 < 10 || num3 < 10 || num3 > 1000 || num1 > 1000 || num2 > 1000){
			return false;
		}
		int a , b, c, d;
		a = num1 % 10;
		b = num2 % 10;
		c = num3 % 10;
		//d = num2 / 10;
		
		if((a==b)||(a==c)||(b==c)) {
			return true;
		}else
			return false;
		
	}
	
	public static boolean isValid(int num) {
		if(num<10 || num>1000) {
			return false;
		}
		else
			return true;
		}
	}


