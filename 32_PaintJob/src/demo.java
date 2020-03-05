
public class demo {

	public static void main(String[] args) {
		
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		
		System.out.println(getBucketCount(3.4, 1.5));
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		
		if(width<=0 || height <=0 || areaPerBucket <=0 || extraBuckets<0) {
			return -1;
		} else {
			int count = (int)(((width*height) - (extraBuckets*areaPerBucket))/areaPerBucket)+1;
			//System.out.println("width*height is " +width*height);
			//System.out.println("extraBuckets*areaPerBucket " +extraBuckets*areaPerBucket);
			//System.out.println("(extraBuckets*areaPerBucket/areaPerBucket) " +Math.round(extraBuckets*areaPerBucket/areaPerBucket));
			
			return count;
		}
		//return 0;
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if(width<=0 || height <=0 || areaPerBucket <=0) {
			return -1;
		} else {
			int count = 0;
			while((count*areaPerBucket)<(width*height)) {
				count++;
			}
			return count;
		}
		
		
	}
	
	public static int getBucketCount(double area, double areaPerBucket) {
		if(area <=0 || areaPerBucket <=0) {
			return -1;
		} else {
			int count = 0;
			while(area> count*areaPerBucket) {
				
				count++;
			}
			return count;
		}
		}
	
}

























