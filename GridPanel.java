//********************************************************************
// GridPanel.javaJava Foundations
//
// Represents the panel in the LayoutDemoprogram that demonstrates
// the grid layout manager.
//********************************************************************
import java.awt.*;
import javax.swing.*;
public class GridPanel extends JPanel
{
	//-----------------------------------------------------------------
	// Sets up this panel with some buttons to show how grid
	// layout affects their position, shape, and size.
	//-----------------------------------------------------------------
	public GridPanel()
	{
		setLayout(new GridLayout(6, 6 ,3,5));
		setBackground(Color.green);
		JButton b1 = new JButton("BUTTON1");
		JButton b2 = new JButton("BUTTON2");
		JButton b3 = new JButton("BUTTON3");
		JButton b4 = new JButton("BUTTON4");
		JButton b5 = new JButton("BUTTON5");
		JButton b6 = new JButton("BUTTON1");
		
		
		//JButton b6 = new JButton("BUTTON6");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
	}
}