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

	JButton jbSorter;
	JButton jbSaver;
	JLabel lbl_EnterNumbers;
	JLabel bckGr;
	JPanel bckGrPanel;
	JTextField tfEnterNumbersHere;
	JLabel lblNumbersSoFar;
	JTextArea taNumbersSoFar;
	JTextArea taSortedNumbers;
	JLabel lblSortedNumbers;
	
	public MainWindow()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(370,280);
		this.setTitle("Number Sorter");
		getContentPane().setLayout(null);
		
		lbl_EnterNumbers = new JLabel("enter Numbers here");
		tfEnterNumbersHere = new JTextField();
		tfEnterNumbersHere.setHorizontalAlignment(SwingConstants.CENTER);
		jbSaver = new JButton("save number");
		jbSorter = new JButton("sort Numbers");
		
		getContentPane().add(tfEnterNumbersHere);
		getContentPane().add(jbSorter);
		getContentPane().add(jbSaver);
		getContentPane().add(lbl_EnterNumbers);
		
		lbl_EnterNumbers.setBounds(20, 40, 130, 25);
		tfEnterNumbersHere.setBounds(20, 70, 130, 25);
		jbSaver.setBounds(208, 70, 111, 25);
		jbSorter.setBounds(208, 130, 111, 25);
		
		lblNumbersSoFar = new JLabel("your Numbers so far");
		lblNumbersSoFar.setBounds(20, 100, 130, 25);
		getContentPane().add(lblNumbersSoFar);
		
		taNumbersSoFar = new JTextArea();
		taNumbersSoFar.setEditable(false);
		taNumbersSoFar.setBounds(20, 130, 130, 25);
		getContentPane().add(taNumbersSoFar);
		
		taSortedNumbers = new JTextArea();
		taSortedNumbers.setEditable(false);
		taSortedNumbers.setBounds(20, 190, 130, 25);
		getContentPane().add(taSortedNumbers);
		
		lblSortedNumbers = new JLabel("your sorted Numbers");
		lblSortedNumbers.setBounds(20, 160, 130, 25);
		getContentPane().add(lblSortedNumbers);
				
		ButtonKlick klick = new ButtonKlick(this);
		jbSaver.addActionListener(klick);
		jbSorter.addActionListener(klick);
		
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