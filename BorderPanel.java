//********************************************************************
// BorderPanel.javaJava Foundations
//
// Represents the panel in the LayoutDemoprogram that demonstrates
// the border layout manager.
//********************************************************************
import java.awt.*;
import javax.swing.*;
public class BorderPanel extends JPanel
{
	//-----------------------------------------------------------------
	// Sets up this panel with a button in each area of a border
	// layout to show how it affects their position, shape, and size.
	//-----------------------------------------------------------------
	public BorderPanel()
	{
		setLayout(new BorderLayout());
		setBackground(Color.green);
		JButton b1 = new JButton("BUTTON1");
		JButton b2 = new JButton("BUTTON2");
		JButton b3 = new JButton("BUTTON3");
		JButton b4 = new JButton("BUTTON4");
		JButton b5 = new JButton("BUTTON5");
		add(b1, BorderLayout.CENTER);
		add(b2, BorderLayout.NORTH);
		add(b3, BorderLayout.SOUTH);
		add(b4, BorderLayout.EAST);
		add(b5, BorderLayout.WEST);
	}
}