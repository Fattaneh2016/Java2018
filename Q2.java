
public class Q2 {
	public static void main(String[] arg){
		
		int[] arr1={10,20,30,41,56};
		int[] arr2={2,5,3,12,10};
		
		boolean checkSorted1=isSorted(arr1);
		boolean checkSorted2=isSorted(arr2);
		
		System.out.println("array is sorted " + checkSorted1);
		System.out.println("array is sorted " + checkSorted2);
		
	}
	
	public static boolean isSorted(int[] arr){
								
		for ( int i=0;i<arr.length-1;i++){
			if( arr[i]<arr[i+1]){
					
			}else{
				return false;
			}
		}
		return true;
	}
}


