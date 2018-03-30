
//Insertion sort
		import java.io.*;
		import java.util.*;
		
public class InsertionSort {
	public static void main(String[] args) {
		
		
		        //initializing array
		        int arr[] = {10, 7, 3, 1, 9, 7, 4, 3};
		        System.out.print("Initial Array : ");
		        printArray(arr);
		        insertionSort(arr);
		    }
		    public static void printArray(int[] arr) {
		        for(int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }

		        System.out.println();
		    }
		    public static void insertionSort(int[] arr) {
		        int N = arr.length;

		        for(int i = 1; i < N; i++) {
		            int j = i - 1;
		            int temp = arr[i];

		            while(j >= 0 && temp < arr[j]) {
		                arr[j + 1] = arr[j];
		                j--;
		            }
		            arr[j + 1] = temp;
		            System.out.print("After pass " + i + "  : ");
		            //Printing array after pass
		            printArray(arr);
		        }
		    }
		}
	

