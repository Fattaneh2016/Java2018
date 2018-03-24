import java.io.File;

public class crawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	crawl(, "*");
	}
	// Prints information about this file,
	// and (if it is a directory) any files inside it.
	public static void crawl(File f) {
	crawl(f, ""); // call private recursive helper
	}
	// Recursive helper to implement crawl/indent behavior.
	private static void crawl(File f, String indent) {
	System.out.println(indent + f.getName());
	if (f.isDirectory()) {
	// recursive case; print contained files/dirs
	for (File subFile : f.listFiles()) {
	crawl(subFile, indent + " ");
	}
	}
	}
}
