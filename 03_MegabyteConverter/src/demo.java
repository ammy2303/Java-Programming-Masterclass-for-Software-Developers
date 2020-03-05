
public class demo {

	public static void main(String[] args) {
		
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
		
		
		int mb = kiloBytes/1024;
		int kb = kiloBytes%1024;
		
		if(kiloBytes<0) {
			System.out.println("Invalid Value");
		}
		else
		{
		System.out.println(kiloBytes+ " KB = "+mb+" MB and "+kb+" KB");
		}
	}
}
