
public class demo {

	public static void main(String[] args) {
		
		printSquareStar(5);
		System.out.println("                                    ");
		printSquareStar(8);
		System.out.println("                                    ");
		printSquareStar(9);
		
		
	}
	
	public static void printSquareStar(int number) {
		if(number<5) {
			System.out.println("Invalid Value");
		}
			for(int i =1; i<=number; i++) {
				for(int j = 1; j<=number; j++) {
					if(i==1 || j==1 || i==j || i==number || j==number || ((i+j) == (number+1))){
						System.out.print("*");
					}else {
						System.out.print(" ");
					}	
					
				}
				System.out.println();
			}
	}

}

