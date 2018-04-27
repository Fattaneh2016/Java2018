import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class Panel extends JPanel
{

	ArrayList<Credit> myCreditList=new ArrayList<Credit>();	

	private JLabel lName;
	private JTextField tName;
	private JLabel lBalance;
	private JTextField tBalance;
	private JLabel lDueDate;
	private JTextField tDueDate;

	private JButton bAddCredit;
	private JButton bShowCredit;
	private JButton bRemoveCredit;

	private double s;

	Credit myCredit=new Credit(0, null, null, 0, 0, 0, 0);

	public Panel()
	{
		setLayout(new GridLayout(3, 3,40,20));		
		setBackground(new Color(12,159,198));


		//label 
		lName=new JLabel("Credit" ,SwingConstants.CENTER);		
		lName.setFont(new Font("Helvetica", Font.PLAIN, 28));
		add(lName);

		lBalance=new JLabel("Current Balance",SwingConstants.CENTER);		
		lBalance.setFont(new Font("Helvetica", Font.PLAIN, 28));
		add(lBalance);

		//label Due date 
		lDueDate=new JLabel("Due Date",SwingConstants.CENTER);		
		lDueDate.setFont(new Font("Helvetica", Font.PLAIN, 28));
		add(lDueDate);

		//label 
		tName=new JTextField();
		tName.setFont(new Font("Helvetica", Font.PLAIN, 28));
		tName.setText("Credit Name");
		add(tName);
		myCredit.setCreditName(tName.toString());

		//text
		tBalance=new JTextField(10);
		tBalance.setFont(new Font("Helvetica", Font.PLAIN, 28));
		tBalance.setText("0");
		add(tBalance);

		s = Double.parseDouble(tBalance.getText());
		myCredit.setcurrentBalance(s);

		//text
		tDueDate=new JTextField();
		tDueDate.setFont(new Font("Helvetica", Font.PLAIN, 28));
		//Current date 
		String date = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		tDueDate.setText(date);
		add(tDueDate);

		//button
		bAddCredit = new JButton("Add Credit");
		bAddCredit.setFont(new Font("Helvetica", Font.PLAIN, 28));
		add(bAddCredit);		
		bAddCredit.addActionListener(new ButtonListener());

		//button
		bRemoveCredit = new JButton("Remove Credit");
		bRemoveCredit.setFont(new Font("Helvetica", Font.PLAIN, 28));
		add(bRemoveCredit);		
		bRemoveCredit.addActionListener(new ButtonListener());

		//button
		bShowCredit = new JButton("Show Credit");
		bShowCredit.setFont(new Font("Helvetica", Font.PLAIN, 28));
		add(bShowCredit);		
		bShowCredit.addActionListener(new ButtonListener());
	}
	public class ButtonListener implements ActionListener {			
		public void actionPerformed(ActionEvent e) {

			if (e.getSource()==bAddCredit) 	{
				myCreditList.add(new Credit(0, tName.getText(), tDueDate.getText(),0 , 0, 0, s));

				JOptionPane.showMessageDialog(null, myCreditList.get(0).toStirng() , "", JOptionPane.INFORMATION_MESSAGE);
			}

			else if  (e.getSource()==bRemoveCredit)	{			
				myCreditList.remove(0);
				tName.setText("");
				tBalance.setText("0");
			}
			else 	{					
				for (int i=0 ;i<myCreditList.size();i++) {				
					JOptionPane.showMessageDialog(null, myCreditList.get(i).toStirng() , "", JOptionPane.INFORMATION_MESSAGE);
				}							
			}
		}
	}
}