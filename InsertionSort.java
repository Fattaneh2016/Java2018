import java.util.Arrays;


public class InsertionSort {

	public static void main(String[] args) {
		
		
		String[] my={"s","w","d","a","e"};
		insertionSort(my);
		System.out.println(Arrays.toString(my)) ;		
	}
	private static void insertionSort(String[] s) {
		
		for(int i=0;i<s.length;i++){
			
			int j=i-1;
			String temp=s[i];
			while(j>=0 && temp.compareTo(s[j]) <0 ){
				s[j+1]=s[j];
				j--;
			}
			s[j+1]=temp;
		}		
	}
	
}
