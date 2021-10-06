package numbersCounter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import numbersCounter.MainWindow;
import javax.swing.SwingConstants;

import inputOutput.ButtonKlick;
import inputOutput.KeyKlick;

import javax.swing.JTextArea;
import java.awt.Rectangle;

public class MainWindow extends JFrame {

	// in dieser Klasse wird das "Fenster"/Formular und seine Elemente erstellt
	
	private JButton btnSorter;
	private JButton btnSaver;
	private JButton btnSSNtofile;
	private JLabel lbl_EnterNumbers;
	private JLabel bckGr;
	private JPanel bckGrPanel;
	private JTextField tfEnterNumbersHere;
	private JLabel lblNumbersSoFar;
	private JTextArea taNumbersSoFar;
	private JTextArea taSortedNumbers;
	private JLabel lblSortedNumbers;
	private JLabel lblIntroduction;
		
	public JButton getBtnSorter()
		{
			return btnSorter;
		}
	public void setBtnSorter(JButton btnSorter)
		{
			this.btnSorter = btnSorter;
		}
	public JButton getBtnSaver()
		{
			return btnSaver;
		}
	public void setBtnSaver(JButton btnSaver)
		{
			this.btnSaver = btnSaver;
		}
	public JButton getBtnSSNtofile()
		{
			return btnSSNtofile;
		}
	public void setBtnSSNtofile(JButton btnSSNtofile)
		{
			this.btnSSNtofile = btnSSNtofile;
		}
	public JLabel getLbl_EnterNumbers()
		{
			return lbl_EnterNumbers;
		}
	public void setLbl_EnterNumbers(JLabel lbl_EnterNumbers)
		{
			this.lbl_EnterNumbers = lbl_EnterNumbers;
		}
	public JLabel getBckGr()
		{
			return bckGr;
		}
	public void setBckGr(JLabel bckGr)
		{
			this.bckGr = bckGr;
		}
	public JPanel getBckGrPanel()
		{
			return bckGrPanel;
		}
	public void setBckGrPanel(JPanel bckGrPanel)
		{
			this.bckGrPanel = bckGrPanel;
		}
	public JTextField getTfEnterNumbersHere()
		{
			return tfEnterNumbersHere;
		}
	public void setTfEnterNumbersHere(JTextField tfEnterNumbersHere)
		{
			this.tfEnterNumbersHere = tfEnterNumbersHere;
		}
	public JLabel getLblNumbersSoFar()
		{
			return lblNumbersSoFar;
		}
	public void setLblNumbersSoFar(JLabel lblNumbersSoFar)
		{
			this.lblNumbersSoFar = lblNumbersSoFar;
		}
	public JTextArea getTaNumbersSoFar()
		{
			return taNumbersSoFar;
		}
	public void setTaNumbersSoFar(JTextArea taNumbersSoFar)
		{
			this.taNumbersSoFar = taNumbersSoFar;
		}
	public JTextArea getTaSortedNumbers()
		{
			return taSortedNumbers;
		}
	public void setTaSortedNumbers(JTextArea taSortedNumbers)
		{
			this.taSortedNumbers = taSortedNumbers;
		}
	public JLabel getLblSortedNumbers()
		{
			return lblSortedNumbers;
		}
	public void setLblSortedNumbers(JLabel lblSortedNumbers)
		{
			this.lblSortedNumbers = lblSortedNumbers;
		}
	public JLabel getLblIntroduction()
		{
			return lblIntroduction;
		}
	public void setLblIntroduction(JLabel lblIntroduction)
		{
			this.lblIntroduction = lblIntroduction;
		}

	public MainWindow()
		{
			setBounds(new Rectangle(50, 0, 0, 0));
			setAlwaysOnTop(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(300,690);
			this.setLocationRelativeTo(null);
			this.setTitle("Number Sorter");
			getContentPane().setLayout(null);
						
			lbl_EnterNumbers = new JLabel("Please enter your first number:");
			lbl_EnterNumbers.setHorizontalAlignment(SwingConstants.CENTER);
			tfEnterNumbersHere = new JTextField();
			tfEnterNumbersHere.setHorizontalAlignment(SwingConstants.CENTER);
			btnSaver = new JButton("save number");
			btnSorter = new JButton("sort numbers");
			btnSSNtofile = new JButton("save sorted numbers in file");
									
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
			
			lblSortedNumbers = new JLabel("You will see the outcome here");
			lblSortedNumbers.setHorizontalAlignment(SwingConstants.CENTER);
			lblSortedNumbers.setBounds(30, 420, 215, 25);
			getContentPane().add(lblSortedNumbers);
			
			lblIntroduction = new JLabel("Sort any 5 positive numbers!");
			lblIntroduction.setHorizontalAlignment(SwingConstants.CENTER);
			lblIntroduction.setBounds(30, 25, 215, 20);
			getContentPane().add(lblIntroduction);
			
			btnSaver.setEnabled(true);
			btnSorter.setEnabled(false);	
			btnSSNtofile.setEnabled(false);
			
			btnSSNtofile.setBounds(30, 605, 215, 25);
			getContentPane().add(btnSSNtofile);
			
			ButtonKlick klick = new inputOutput.ButtonKlick(this);
			KeyKlick klick2 = new KeyKlick(this);
			
			btnSaver.addActionListener(klick);
			//tfEnterNumbersHere.addActionListener((ActionListener) klick2);
			btnSorter.addActionListener(klick);
			btnSSNtofile.addActionListener(klick);
								
			this.setVisible(true);
		}
	
	public static void main(String[] args)
	    {  		
			new MainWindow().setVisible(true);
	    }
}
//last update 210915 - 2121
