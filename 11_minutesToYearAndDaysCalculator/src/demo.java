
public class demo {

	public static void main(String[] args) {
		
	}
	
	public static void printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println("Invalid Value");
		}else {
			int hours = (int)minutes/60;
			int days = hours/24;
			int year = days/365;
			int remaining = days%365;
			System.out.println(minutes+ " min "+"= "+year+" y and "+remaining+" d");
		}
	}

}
