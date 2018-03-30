import java.util.Arrays;

public class SequentialSort {

	public static void main(String[] args) {
		int[] a= {1,7,89,4,3,78,4};
		int ta=sequentialSort(a ,4);
		System.out.println(a[ta]);
	}

	private static int sequentialSort(int[] a ,int target) {
		
		for ( int i=0;i<a.length;i++) {
			if(a[i]==target) {
				return i;
			}			
		}			
		return -1;		
	}

}
