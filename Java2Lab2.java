import java.util.Arrays;

public class Java2Lab2 {
	public static void main(String[] args){
		int[] myArray={22, 34, 21, 35, 12, 4, 2, 3, 99, 81};
		System.out.println("Before Reverse " + Arrays.toString(myArray));
		reverse(myArray);		
		System.out.println("The smallest number is " + getMin(myArray));		
		computeTwice(myArray);
		System.out.print("The array with two times the numbers " + Arrays.toString(myArray));
	}
	public static int[] computeTwice(int[] myArray) {
		for ( int i=0;i<myArray.length;i++){
			myArray[i]=myArray[i]*2;						
		}
		return myArray;
	}

	public static int getMin(int[] myArray) {
		int min=myArray[0];				
			for(int i=0;i<myArray.length;i++){
				if(myArray[i]<min){
					min=myArray[i];
				}
			}
			return min;
		}			
	public static void reverse(int[] myArr) {
		
		for ( int i=0;i<myArr.length/2;i++){			
			int temp=myArr[i];
			myArr[i]=myArr[myArr.length-i-1];
			myArr[myArr.length-i-1]=temp;						
		}
		System.out.println("After Reverse "  + Arrays.toString(myArr));
	}
}
