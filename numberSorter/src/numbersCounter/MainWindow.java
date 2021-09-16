package numbersCounter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import numbersCounter.MainWindow;
import javax.swing.SwingConstants;

import javax.swing.JTextArea;
import java.awt.Rectangle;

public class MainWindow extends JFrame {

	JButton btnSorter;
	JButton btnSaver;
	JLabel lbl_EnterNumbers;
	JLabel bckGr;
	JPanel bckGrPanel;
	JTextField tfEnterNumbersHere;
	JLabel lblNumbersSoFar;
	JTextArea taNumbersSoFar;
	JTextArea taSortedNumbers;
	JLabel lblSortedNumbers;
	JLabel lblIntroduction;
	JButton btnSSNtofile;
	
	public MainWindow()
		{
			setBounds(new Rectangle(50, 0, 0, 0));
			setAlwaysOnTop(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(300,690);
			this.setTitle("Number Sorter");
			getContentPane().setLayout(null);
						
			lbl_EnterNumbers = new JLabel("Please enter your first number:");
			lbl_EnterNumbers.setHorizontalAlignment(SwingConstants.CENTER);
			tfEnterNumbersHere = new JTextField();
			tfEnterNumbersHere.setHorizontalAlignment(SwingConstants.CENTER);
			btnSaver = new JButton("save number");
			btnSorter = new JButton("sort numbers");
									
			getContentPane().add(tfEnterNumbersHere);
			getContentPane().add(btnSorter);
			getContentPane().add(btnSaver);
			getContentPane().add(lbl_EnterNumbers);
			
			lbl_EnterNumbers.setBounds(30, 50, 215, 25);
			tfEnterNumbersHere.setBounds(30, 80, 215, 25);
			btnSaver.setBounds(30, 120, 215, 25);
			btnSorter.setBounds(30, 361, 215, 25);
			
			lblNumbersSoFar = new JLabel("Your numbers so far");
			lblNumbersSoFar.setHorizontalAlignment(SwingConstants.CENTER);
			lblNumbersSoFar.setBounds(30, 181, 215, 25);
			getContentPane().add(lblNumbersSoFar);
			
			taNumbersSoFar = new JTextArea();
			taNumbersSoFar.setEditable(false);
			taNumbersSoFar.setBounds(30, 211, 215, 140);
			getContentPane().add(taNumbersSoFar);
			
			taSortedNumbers = new JTextArea();
			taSortedNumbers.setEditable(false);
			taSortedNumbers.setBounds(30, 454, 215, 140);
			getContentPane().add(taSortedNumbers);
			
			lblSortedNumbers = new JLabel("Your numbers are sorted now");
			lblSortedNumbers.setHorizontalAlignment(SwingConstants.CENTER);
			lblSortedNumbers.setBounds(30, 420, 215, 25);
			getContentPane().add(lblSortedNumbers);
			
			lblIntroduction = new JLabel("Sort any 5 positive numbers!");
			lblIntroduction.setHorizontalAlignment(SwingConstants.CENTER);
			lblIntroduction.setBounds(30, 25, 215, 20);
			getContentPane().add(lblIntroduction);
			
			btnSaver.setEnabled(true);
			btnSorter.setEnabled(false);
			
			btnSSNtofile = new JButton("save sorted numbers in file");
			btnSSNtofile.setEnabled(false);
			btnSSNtofile.setBounds(30, 605, 215, 25);
			getContentPane().add(btnSSNtofile);
			
			ButtonKlick klick = new ButtonKlick(this);
			btnSaver.addActionListener(klick);
			btnSorter.addActionListener(klick);
								
			this.setVisible(true);
		}
	
	public static void main(String[] args)
	    {  		
			new MainWindow().setVisible(true);
	    }
}
//last update 210915 - 2121
