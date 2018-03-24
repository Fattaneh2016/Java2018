
public class RecursiveSum {

	public static void main(String[] args) {
		int[] myList= {1,2,3,4,8};
		System.out.println(sum(myList, 0));
	}
	// returns the sum of the numbers in the given array
	public static int sum(int[] list) {
		return sum(list, 0);
	}
	// computes the sum of the list starting at the given index
	private static int sum(int[] list, int index) {
		if (index == list.length) {
			return 0;
		} else {
			return list[index] + sum(list, index + 1);
		}
	}


}
