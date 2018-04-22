
public class ImportantSearch {

	public static void main(String[] args) {

		int[] array= {5,7,12,15,19,27,33,39,50,52,55,70};

		System.out.println("Found the  index " + sequentialSearch( array,12));

		System.out.println(binarySearch( array,70));

		System.out.println(binarySearchRecursive( array,69,0,11));

	}

	private static int binarySearchRecursive(int[] array, int target ,int min ,int max) {

		if(min>max)
		{
			return -1;  //not found
		}else {
			int mid=(min+max)/2;
			if(target>array[mid]) {
				return binarySearchRecursive(array,target,mid+1,max);
			}else if (target<array[mid])
			{				
				return binarySearchRecursive(array,target,min,mid-1);
			}else
			{
				return mid;
			}
		}
	}

	private static int binarySearch(int[] array, int target) {

		int min=0;
		int max=array.length -1;

		for ( int i=0;i<array.length;i++) {
			int mid=(min+max)/2;

			if(array[mid]<target) {
				min=mid+1;
			}else if( array[mid]>target) {
				max=mid-1;
			}else

				return mid;  // found
		}
		return -(min+1);  //not found
	}

	private static int sequentialSearch(int[] a ,int target) {

		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
