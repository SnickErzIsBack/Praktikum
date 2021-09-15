package numbersCounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ComCave.FileManager;

public class ButtonKlick implements ActionListener {

	MainWindow mw;

	public ButtonKlick(MainWindow window)
		{
			this.mw = window;
		};

	@Override
	public void actionPerformed(ActionEvent e)
		{
			//System.out.println("erfolgreicher Klick");
			ArrayList<String> numberList = new ArrayList<String>();
			
			if(e.getSource().equals(mw.btnSaver))
				{
					String numStrg = mw.tfEnterNumbersHere.getText();
					if( numStrg.matches("[0-9]+") )
						{
							Numbers.numberList.add(new Numbers(numStrg));
							switch (Numbers.numberList.size())
								{
								case 1:
									{mw.lbl_EnterNumbers.setText("Please enter your second number!");
										break;}
								case 2:
									{mw.lbl_EnterNumbers.setText("Please enter your third number!");
										break;}
								case 3:
									{mw.lbl_EnterNumbers.setText("Please enter your fourth number!");
										break;}
								case 4:
									{mw.lbl_EnterNumbers.setText("Please enter your last number!");
										break;}
								default:
									System.out.println("falscheingabe");
										break;
								}
							mw.tfEnterNumbersHere.setText("");
							String toSortStrg ="";
							for (Numbers numberlist: Numbers.numberList)
								{
									toSortStrg += numStrg +"\n";
								}
							mw.taNumbersSoFar.setText(toSortStrg);
					}else{
							//mw.lbl_EnterNumbers.setText("Please enter an ACTUAL number!");
							JOptionPane.showMessageDialog(mw, "Kunde nicht gespeichert");
							ArrayList<String> numberList = new ArrayList<String>();
					}
					
			}else if (e.getSource().equals(mw.btnSorter))
				{
					mw.taSortedNumbers.setText("");
					
				}
//			next UPLOAD-try 210915-1556
			
		}

}
