
public class demo {

	public static void main(String[] args) {
		
		getEvenDigitSum(2000);
		
	}
	
	public static int getEvenDigitSum(int number) {
		
		int numcopy = number;
		int sum = 0;
		int remainder = 0;
		
		if(numcopy<0) {
			return -1;
		}
		else {
		while(number > 0) {
			remainder = number % 10;
			
			if(remainder % 2 ==0) {
				sum = sum + remainder;
			}
			number = number / 10;
		}
		System.out.println(sum);
		return 0;
	}
	}
}
