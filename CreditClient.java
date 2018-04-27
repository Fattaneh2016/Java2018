import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JFrame;


public class CreditClient {

	public static void main(String[] args) throws FileNotFoundException {

		JFrame frame = new JFrame("Organize Credit ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Panel());
		
		frame.setPreferredSize(new Dimension(1400,800));
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);

	}
}


