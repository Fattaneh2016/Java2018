
public class DualSelectionSort {

	public static void main(String[] args) {
		 int myArray[] = {12,123,1,28,183,16};
	       selectionSort(myArray);
	       for(int i=0; i<myArray.length; i++)
	           System.out.print(myArray[i]+" ");
	       System.out.println();

	}

	   public static void selectionSort(int myArray[]){
	      
	       int i=0;
	        while(i<=(myArray.length-i-1)) {
	          int min = i;
	          int max=myArray.length-i-1;
	          for (int j = i; j <=myArray.length-i-1; j++) {
	           if (myArray[j] <=myArray[min]) {
	             min= j;    
	             }
	           if(myArray[j]>=myArray[max]){
	              max = j;
	             }
	          }
	          swap(myArray, i, min);
	          if(i == max) {
	                 max = min; 
	           }
	          swap(myArray, (myArray.length-i-1), max);
	        i++;
	        }
	   
	   }
	  
	   private static void swap(int[] arr, int IndexBefore, int IndexAfter){
	        int temp=arr[IndexBefore];
	        arr[IndexBefore]=arr[IndexAfter];
	        arr[IndexAfter]=temp;
	   }
	   

}
