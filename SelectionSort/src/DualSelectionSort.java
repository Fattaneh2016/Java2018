
public class DualSelectionSort {

	public static void main(String[] args) {
		 int arr2[] = {6,1,7,2,8,3,9,4,0,5};
	       selectionSort(arr2);
	       for(int i=0; i<arr2.length; i++)
	           System.out.print(arr2[i]+" ");
	       System.out.println();

	}
	// method where we are putting min and max at correct position
	   public static void selectionSort(int arr[]){
	      
	       int i=0;
	        while(i<=(arr.length-i-1)) {
	          int minIndex = i;
	          int maxIndex=arr.length-i-1;
	          for (int j = i; j <=arr.length-i-1; j++) {
	           if (arr[j] <=arr[minIndex]) {
	             minIndex = j;    
	             }
	           if(arr[j]>=arr[maxIndex]){
	              maxIndex = j;
	             }
	          }
	          swap(arr, i, minIndex);
	          if(i == maxIndex) {
	                 maxIndex = minIndex;
	           }
	          swap(arr, (arr.length-i-1), maxIndex);
	        i++;
	        }
	   }
	  
	   private static void swap(int[] arr, int oldIndex, int newIndex){
	        int temp=arr[oldIndex];
	        arr[oldIndex]=arr[newIndex];
	        arr[newIndex]=temp;
	   }
	   

}
