
public class 
Towers {
	public static void 
	main(String[] args) {
		towers(3, 
				"A"
				, 
				"C"
				, 
				"B"
				);
	}
	public static void 
	towers(
			int 
			num, String from, String to, String free) {
		if 
		(num == 1) {
			System.out.println(
					"Move " 
							+ num + 
							" from " 
							+ from + 
							" to " 
							+ to); 
		} 
		else 
		{
			towers(num - 1, from, free, to);
			System.out.println(
					"Move " 
							+ num + 
							" from " 
							+ from + 
							" to " 
							+ to); 
			towers(num - 1, free, to, from);
		}
	}
}

