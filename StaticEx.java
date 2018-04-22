
public class StaticEx {
	private static int count =10;
	public StaticEx() {
		count++;
	}
	public static int getCount() {
		return count;
	}
}
