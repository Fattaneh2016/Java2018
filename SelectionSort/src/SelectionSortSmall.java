
public class SelectionSortSmall {

public static void main(String[] args) {
		
		int[] mySort= {1,4,7,3,5};
		selectionSortSmall(mySort);
		 
	   }
	public static void selectionSortSmall(int[] mySort) {
		//selection sort 
		for(int i=0; i<mySort.length; i++){
	           int min = i;
	           for(int j= i+1; j<mySort.length; j++){
	               if(mySort[j] < mySort[min])
	                   min = j;
	           }
	           swap(mySort, i, min);
	           System.out.print(mySort[i]+", ");
	       }
		
	}
	public static void swap( int[] mySort , int i,int max) {
		//swapping
        int temp = mySort[i];
        mySort[i] = mySort[max];
        mySort[max] = temp;
        
	}

}
