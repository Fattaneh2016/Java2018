import java.util.Scanner;

public class ReverseLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void reverseLines(Scanner input) {
		if (input.hasNextLine()) {
		// recursive case
		String line = input.nextLine();
		reverseLines(input);
		System.out.println(line);
		}
		}
}
