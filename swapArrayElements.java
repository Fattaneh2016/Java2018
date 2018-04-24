import java.util.Arrays;


public class swapArrayElements {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,98,1};
		System.out.println("Before Swap " + Arrays.toString(numbers));
		swapPairs(numbers);
		System.out.println("After Swap  " + Arrays.toString(numbers));
	}
	private static void swapPairs(int[] numbers) {		
		for (int i = 0; i < numbers.length-1; i+=2) {
			int temp = numbers[i];
			numbers[i] = numbers[i+1];
			numbers[i+1] = temp;
		}								
	}
}
