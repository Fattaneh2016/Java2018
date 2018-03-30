// Bubble sort
	import java.util.*;
// bid(O) = 
	public class BubbleSortAlgorithm {

	    public static void main(String[] args) {
	        // Initialize arr
	        int arr[] = { 7,6,11,13,6,17,10,23,-1,1 };
	        System.out.print("Initial Array : ");
	       printArray(arr);
	        bubbleSort(arr);
	    }
	    public static void printArray(int[] arr) {
	        for(int i = 0; i < arr.length; i++) {
	           // System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	    static void bubbleSort(int[] arr) {
	    	 
	         int temp = 0;  
	          for(int i=0; i < arr.length; i++){ 
	        	  System.out.println("After pass " + i + " " +  Arrays.toString(arr)+ "  : ");
	                  for(int j=0; j < arr.length-1; j++){  
	                           if(arr[j] > arr[j+1]){  
	                                  //swap elements  
	                                  temp = arr[j];  
	                                  arr[j] = arr[j+1];  
	                                  arr[j+1] = temp;  
	                          }  	  
	                          
	                  }  	          
	            
	            //Printing array after pass
	          printArray(arr);
	        }
	    }
	}


