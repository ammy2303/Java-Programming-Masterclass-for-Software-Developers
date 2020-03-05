import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}
	
	public static void inputThenPrintSumAndAverage() {
		 
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		long avg = 0;
		int count = 0;
		
		while(true) {
			
			if(scanner.hasNextInt()) {
			sum = sum + scanner.nextInt();
			count++;
			}
			else {
				break;
			}			
		}
		
		avg = Math.round((double)sum/count);
		long avg1 = Math.round(sum/count);
		long sum1 = sum;
		double sum2 = (double)sum;
		
		System.out.println(sum1+ " " +sum2);
		
		System.out.println("SUM = " +sum+ " AVG = "+avg);
		System.out.println(avg+ " " +avg1);
		scanner.close();
		
	}

}
