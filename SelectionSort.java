import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {7,6,11,13,6,17,10,23,-1,1};
		System.out.println(Arrays.toString(selectionSort(a)));
		int[] a1= {7,6,11,13,6,17,10,23,-1,1};
		System.out.println(Arrays.toString(bubbleSort(a1)));
		
		int[] a2= {7,6,11,13,6,17,10,23,-1,1};
		System.out.println(Arrays.toString(insertionSort(a2)));
		
	}
	private static int[] insertionSort(int[] a) {
		for ( int i=0;i<a.length;i++) {		
			int j=i-1;
			int temp=a[i];
			while(j>=0 && temp<a[j]) {
				a[j+1]=a[j];
				j--;
			} 
			a[j+1]=temp;
		}
		return a;
	}
	private static int[] bubbleSort(int[] a) {	
		
		for ( int j=0;j<a.length;j++) {				
			for ( int i=0;i<a.length-1 ;i++) {								
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}	
			}
		}
		return a;
	}
	private static int[] selectionSort(int[] a) {		
		for ( int i=0;i<a.length-1 ;i++) {			
			int min=i;
			for ( int j=i+1;j<a.length ;j++) {				
				if(a[j]<a[min]) {
					min=j;
				}
			}
			swap(a,i,min);				
		}		
		return a;
	}
	private static void swap(int[] a, int i, int j) {		
		if(i!=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}		
	}
}
