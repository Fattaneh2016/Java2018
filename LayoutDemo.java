//********************************************************************
// LayoutDemo.javaJava Foundations
//
// Demonstrates the use of flow, border, grid, and box layouts.
//********************************************************************
import java.awt.Dimension;

import javax.swing.*;
public class LayoutDemo
{
	//-----------------------------------------------------------------
	// Sets up a frame containing a tabbed pane. The panel on each
	// tab demonstrates a different layout manager.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("LayoutManager Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tp= new JTabbedPane();
		tp.addTab("Intro", new IntroPanel());
		tp.addTab("Flow", new FlowPanel());
		tp.addTab("Border", new BorderPanel());
		tp.addTab("Grid", new GridPanel());
		tp.addTab("Box", new BoxPanel());
		frame.getContentPane().add(tp);
		
		frame.setPreferredSize(new Dimension(800,800));
		frame.setLocationRelativeTo(null);

		frame.pack();
		frame.setVisible(true);
	}
}

