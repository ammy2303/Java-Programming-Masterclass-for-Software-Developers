
public class demo {

	public static void main(String[] args) {
		sumFirstAndLastDigit(-5);
	}
	
	public static int sumFirstAndLastDigit(int number) {
		int numcopy = number;
		int count = 0;
		int newnum = 1;
		while(number != 0) {
			number = number/10;
			count++;
		}
		//System.out.println(count);
		for(int i = 0; i<count-1; i++) {
		newnum = newnum * 10;
		}
		//System.out.println(newnum);
		int firstnum = numcopy / newnum;
		//System.out.println(firstnum);
		
		int lastnum = numcopy % 10;
		
		System.out.println(lastnum + firstnum);
		return lastnum + firstnum;
	}
	
}
