public class demo {

	public static void main(String[] args) {
		/*
		 * getLargestPrime(45); System.out.println("--------"); getLargestPrime(16);
		 * System.out.println("--------"); getLargestPrime(21);
		 * System.out.println("--------"); getLargestPrime(11);
		 */
		System.out.println(getLargestPrime(45));	
		System.out.println(getLargestPrime(14));
		
	}

	public static int getLargestPrime(int number) {
		if(number<1) {
			return -1;
		}
		int count = 0;
		int newfactor = 0;
		int copy = number;
		for(int i = 1; i < copy; i++) {
			if(copy%i==0) {
				count++;
				newfactor = i;
				//System.out.println("Count is "+count+" and factor is "+i);
			}			
		}
		//System.out.println("New Factor" +newfactor);
		if(count < 2) {
			//System.out.println("copy is"+copy);
			return copy;
		}else {
			return getLargestPrime(newfactor);
		}
		
//		return 0;
	}
}
