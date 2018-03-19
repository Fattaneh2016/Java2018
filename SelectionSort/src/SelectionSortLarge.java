
public class SelectionSortLarge {

	public static void main(String[] args) {
		
		int[] mySort= {1,4,7,3,5};
		selectionSortMax(mySort);
		 
	   }
	public static void selectionSortMax(int[] mySort) {
		
		for(int i=mySort.length-1; i>=0; i--){
	           int max = i;
	           for(int j= i-1; j>=0; j--){
	               if(mySort[j] > mySort[max])
	                   max = j;
	           }
	           swap(mySort, i, max);
	           System.out.print(mySort[i]+ " ");
	       }
		
	}
	public static void swap( int[] mySort , int i,int max) {
		//swapping
        int temp = mySort[i];
        mySort[i] = mySort[max];
        mySort[max] = temp;
        
	}
}

