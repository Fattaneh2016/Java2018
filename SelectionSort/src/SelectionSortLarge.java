
public class SelectionSortLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mySort= {1,4,7,3,5};
		for(int i=mySort.length-1; i>0; i--){
	           int max = i;
	           for(int j= i-1; j>=0; j--){
	               if(mySort[j] > mySort[max])
	                   max = j;
	           }
	          
	           //swapping
	           int temp = mySort[i];
	           mySort[i] = mySort[max];
	           mySort[max] = temp;
	           System.out.print(mySort[i]+" ");
	       }
		
	   }
	}


