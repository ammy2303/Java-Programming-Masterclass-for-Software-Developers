
//This Program is not complete... and uis full of errors...

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getLargestPrime(121);
		
	}
	
	public static int getLargestPrime(int number) {
		
		int count = 0;
		int temp = 0;
		if(number<=1) {
			return -1;
		}
		for(int i = 1; i < number; i++) {
			if(number%i == 0) {
				count ++;
				if(isPrime(i)) {
				temp = i;
				System.out.println(temp);
				}
			}
		}
		if(count < 1) {
			return -1;
		}
		System.out.println(temp);
		return temp;		
	}
	public static boolean isPrime(int number) {
		if(number <=1) {
			return false;
		}
		int copy = number;
		int count = 0;
		for(int i = 2; i<number/2; i++) {
			if(number % i == 0) {
				count++;
				System.out.println(count);
			}
		}
		
		if(count>0) {
			return true;
		}else
			return false;
	}
	
	
	
}
