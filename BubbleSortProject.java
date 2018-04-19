import java.util.Arrays;


public class BubbleSortProject {


	public static void main(String[] args) {
		int[] myArray={4,15,8,9,1,60,4,9};
		System.out.println("Before Sort " + Arrays.toString(myArray));

		System.out.println();
		System.out.println("Before Sort " + (Arrays.toString(sort(myArray))));

	}

	private static int[] sort(int[] a) {

		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1;j++){

				if(a[j]>a[j+1]){

					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}

		}
		return a;
	}

}