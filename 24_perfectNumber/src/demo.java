
public class demo {

	public static void main(String[] args) {
		isPerfectNumber(29);
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number<1) {
			return false;
		}
		
		int sum = 0;
		
		for (int i = 1; i<number; i++) {
			if(number%i == 0) {
				sum = sum + i;
				//System.out.println(i);
			}
			//System.out.println(sum);
			
		}
		
		System.out.println(sum);
		
		if(sum == number) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
