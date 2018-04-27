//********************************************************************
// BoxPanel.javaJava Foundations
//
// Represents the panel in the LayoutDemoprogram that demonstrates
// the box layout manager.
//********************************************************************
import java.awt.*;
import javax.swing.*;
public class BoxPanel extends JPanel
{
	//-----------------------------------------------------------------
	// Sets up this panel with some buttons to show how a vertical
	// box layout (and invisible components) affects their position.
	//-----------------------------------------------------------------
	public BoxPanel()
	{
		//Horizontal
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		//vertical
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.green);
		JButton b1 = new JButton("BUTTON1");
		JButton b2 = new JButton("BUTTON2");
		JButton b3 = new JButton("BUTTON3");
		JButton b4 = new JButton("BUTTON4");
		JButton b5 = new JButton("BUTTON5");
		add(b1);
		add(Box.createRigidArea(new Dimension ( 10,0)));
		//add(Box.createRigidArea(new Dimension ( 0,10)));
		add(b2);
		add(Box.createHorizontalGlue());
		//add(Box.createVerticalGlue());
		add(b3);
		add(b4);
		add(Box.createRigidArea(new Dimension (20,0)));
		//add(Box.createRigidArea(new Dimension (0, 20)));
		add(b5);
	}
}
