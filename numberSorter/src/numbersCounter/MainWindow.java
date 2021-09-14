package numbersCounter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import numbersCounter.MainWindow;
import javax.swing.SwingConstants;

import javax.swing.JTextArea;

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
	
	public MainWindow()
		{
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(250,700);
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
			
			lbl_EnterNumbers.setBounds(30, 50, 170, 25);
			tfEnterNumbersHere.setBounds(30, 80, 170, 25);
			btnSaver.setBounds(30, 120, 170, 25);
			btnSorter.setBounds(30, 361, 170, 25);
			
			lblNumbersSoFar = new JLabel("These are your numbers so far");
			lblNumbersSoFar.setHorizontalAlignment(SwingConstants.CENTER);
			lblNumbersSoFar.setBounds(30, 181, 170, 25);
			getContentPane().add(lblNumbersSoFar);
			
			taNumbersSoFar = new JTextArea();
			taNumbersSoFar.setEditable(false);
			taNumbersSoFar.setBounds(30, 211, 170, 140);
			getContentPane().add(taNumbersSoFar);
			
			taSortedNumbers = new JTextArea();
			taSortedNumbers.setEditable(false);
			taSortedNumbers.setBounds(30, 454, 170, 140);
			getContentPane().add(taSortedNumbers);
			
			lblSortedNumbers = new JLabel("Your numbers are sorted now");
			lblSortedNumbers.setHorizontalAlignment(SwingConstants.CENTER);
			lblSortedNumbers.setBounds(30, 420, 170, 25);
			getContentPane().add(lblSortedNumbers);
			
			lblIntroduction = new JLabel("This app will sort 5 numbers.");
			lblIntroduction.setHorizontalAlignment(SwingConstants.CENTER);
			lblIntroduction.setBounds(30, 25, 170, 20);
			getContentPane().add(lblIntroduction);
					
			ButtonKlick klick = new ButtonKlick(this);
			btnSaver.addActionListener(klick);
			btnSorter.addActionListener(klick);
								
			this.setVisible(true);
		}
	
	public static void main(String[] args)
	    {  
		
			new MainWindow().setVisible(true);
	    	
//			int a;
//	    	double number;
//	    	    	
//	        ArrayList<Integer> numberList=new ArrayList<Integer>();
//	        System.out.println("This app sorts 5 Numbers by your choosing.");
//	        
//	        for(int i=0; i<5;i++)
//		        {
//	        		a= i+1;
//	        		switch(a)
//	        			{
//		        			case 1:
//		        				System.out.println("Please enter your 1st number: ");
//		        				break;
//		        			case 2:	
//		        				System.out.println("Please enter your 2nd number: ");
//		        				break;
//		        			case 3:
//		        				System.out.println("Please enter your 3rd number: ");
//		        				break;
//		        			case 4:
//		        				System.out.println("Please enter your 4th number: ");
//		        				break;
//		        			case 5:
//		        				System.out.println("Please enter your 5th number: ");
//		        				break;
//		        			default:
//		        				System.out.println("Please enter a correct number!");
//	        			}
//		        	number = new Scanner(System.in).nextInt();
//		        	numberList.add((int) number);
//				}  
//	        Collections.sort(numberList);
//	        for(int i=0;i<numberList.size();++i)
//	            {
//	        		System.out.println(numberList.get(i));
//	            };   
    }
}